package com.example.grupp1;

import com.example.grupp1.models.Answer;
import com.example.grupp1.models.Page;
import com.example.grupp1.models.Player;
import com.example.grupp1.repository.AnswerRepository;
import com.example.grupp1.repository.PageRepository;
import com.example.grupp1.repository.PlayerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping("/")
    String reg(HttpSession session,  Model model){
        if(session.getAttribute("gameLevel") == null) {
            Player player = playerRepository.save(new Player());
            session.setAttribute("gameLevel", player);
        }
        model.addAttribute("gameLevel", session.getAttribute("gameLevel"));
        return "index";
    }

    @PostMapping("/register")
    String register(HttpSession session, Model model, @ModelAttribute Player gameLevel) {
        Player sessionGameLevel = (Player) session.getAttribute("gameLevel");
        sessionGameLevel.setName(gameLevel.getName());
        model.addAttribute("gameLevel", session.getAttribute("gameLevel"));
        playerRepository.save(sessionGameLevel);
        return "redirect:/levelOverview";
    }

    @GetMapping("/level1")
    String start(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(1L);
        System.out.println(pages);
        int  currentPage = 1;
        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        System.out.println(answers);


        session.setAttribute("current", currentPage);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        model.addAttribute("answers", answers);
        model.addAttribute("currentPage", currentPage);

        return "level1";
    }

    @PostMapping("/level1")
    String answer(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(1);

        int currentPage = (int)session.getAttribute("current");
        currentPage++;

        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        model.addAttribute("answers", answers);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        session.setAttribute("current", currentPage);


        return "level1";
    }


    @GetMapping("/level2")
    String lvl2(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(2L);
        int currentPage = 6;
        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        System.out.println(answers);


        session.setAttribute("current", currentPage);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        model.addAttribute("answers", answers);
        model.addAttribute("currentPage", currentPage);



        return "level2";
    }

    @PostMapping("/level2")
    String answerlvl2(Model model, HttpSession session, @RequestParam int answer, @RequestParam int id){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(2L);

        int currentPage = id;

        System.out.println("CORRECTANSWER: "+pages.get(id-1).getCorrectAnswer());
        System.out.println("ANSWER: "+answer);
        if (pages.get(id-1).getCorrectAnswer()==answer){
            currentPage +=1;
            System.out.println("Du svarade rätt.");

        }else{
            System.out.println("Du svara fel");
        }
        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        model.addAttribute("answers", answers);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        session.setAttribute("current", currentPage);


        return "level2";
    }


}
