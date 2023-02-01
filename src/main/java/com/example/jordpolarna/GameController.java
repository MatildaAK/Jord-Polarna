package com.example.jordpolarna;

import com.example.jordpolarna.models.Answer;
import com.example.jordpolarna.models.Page;
import com.example.jordpolarna.models.Player;
import com.example.jordpolarna.repository.AnswerRepository;
import com.example.jordpolarna.repository.LevelRepository;
import com.example.jordpolarna.repository.PageRepository;
import com.example.jordpolarna.repository.PlayerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private LevelRepository levelRepository;

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
    String register(HttpSession session, Model model, @ModelAttribute Player player) {
        Player sessionGameLevel = (Player) session.getAttribute("gameLevel");
        sessionGameLevel.setName(player.getName());
        sessionGameLevel.setGameLevel(levelRepository.findById(1L).get()); //Hämtar level-id för framtida upplåsning av nya levels.
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
        //int currentID = pages.get(currentPage-1).getId().intValue();
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
        int amountQuestions = pages.size();
        int currentPage = (int)session.getAttribute("current");
        if(currentPage < amountQuestions){
            currentPage++;
        }else{
            player.setGameLevel(levelRepository.findById(2L).get());
            playerRepository.save(player);
            return "redirect:/levelOverview";
        }


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
    String answerlvl2(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(2);
        int amountQuestions = pages.size()+5;
        int currentPage = (int)session.getAttribute("current");
        if(currentPage < amountQuestions){
            currentPage++;
        }else{
            player.setGameLevel(levelRepository.findById(3L).get());
            playerRepository.save(player);
            return "redirect:/levelOverview";
        }


        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        model.addAttribute("answers", answers);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        session.setAttribute("current", currentPage);

        return "level2";
    }
    @GetMapping("/level3")
    String lvl3(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(3L);
        int currentPage = 9;
        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        System.out.println(answers);


        session.setAttribute("current", currentPage);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        model.addAttribute("answers", answers);
        model.addAttribute("currentPage", currentPage);

        return "level3";
    }

    @PostMapping("/level3")
    String answerlvl3(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(3);
        int amountQuestions = pages.size()+8;
        int currentPage = (int)session.getAttribute("current");
        if(currentPage < amountQuestions){
            currentPage++;
        }else{
            player.setGameLevel(levelRepository.findById(4L).get());
            playerRepository.save(player);
            return "redirect:/levelOverview";
        }


        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
        model.addAttribute("answers", answers);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        session.setAttribute("current", currentPage);

        return "level3";
    }
    @GetMapping("/diplom")
    String diplom(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        model.addAttribute("player", player);
        return "diplom";
    }
}
