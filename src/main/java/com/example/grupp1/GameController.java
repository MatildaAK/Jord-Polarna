package com.example.grupp1;

import com.example.grupp1.models.Answer;
import com.example.grupp1.models.Page;
import com.example.grupp1.models.Player;
import com.example.grupp1.repository.*;
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
    private AnswerRepository answerRepository;
    @Autowired
    private LevelRepository levelRepository;
    @Autowired
    private PageService pageService;
    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    String reg(HttpSession session,  Model model) {
        Player player = null;
        if (session.getAttribute("gameLevel") == null) {
            player = new Player();
        } else {
            return "redirect:/levelOverview";
        }
        model.addAttribute("player", player);
        return "index";
    }

    @PostMapping("/register")
    String register(HttpSession session, Model model, @ModelAttribute Player player) {
        playerService.saveNewPlayer(player.getName());
        session.setAttribute("gameLevel", playerService.getPlayer(player.getName()));
        return "redirect:/levelOverview";
    }

    @GetMapping("/level1")
    String start(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageService.getAllPagesFromLevel(1);

        int  currentPage = pageService.getFirstPageFromLevel(1);
        List<Answer> answers = answerRepository.findAllFromPage(currentPage);
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
        List<Page> pages = pageService.getAllPagesFromLevel(1);
        int amountQuestions = pages.size();
        int currentPage = (int)session.getAttribute("current");
        if(currentPage < amountQuestions){
            currentPage++;
        }else{
            player.setGameLevel(levelRepository.findById(2L).get());
            playerService.savePlayer(player);

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
            if(player.getGameLevel().getId() < 2L){
                return "redirect:/levelOverview";
            }

        List<Page> pages = pageService.getAllPagesFromLevel(2);
        int currentPage = pageService.getFirstPageFromLevel(2);
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
        List<Page> pages = pageService.getAllPagesFromLevel(2);
        int amountQuestions = pageService.getTotalAmountOfQuestionsSoFar(2);
        int currentPage = (int)session.getAttribute("current");
        if(currentPage < amountQuestions){
            currentPage++;
        }else{
            player.setGameLevel(levelRepository.findById(3L).get());
            playerService.savePlayer(player);

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
        List<Page> pages = pageService.getAllPagesFromLevel(3);

        int currentPage = pageService.getFirstPageFromLevel(3);
        List<Answer> answers = answerRepository.findAllFromPage(currentPage);

        if(player.getGameLevel().getId() < 3L){
            return "redirect:/levelOverview";
        }

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
        List<Page> pages = pageService.getAllPagesFromLevel(3);
        int amountQuestions = pageService.getTotalAmountOfQuestionsSoFar(3);
        int currentPage = (int)session.getAttribute("current");
        if(currentPage < amountQuestions){
            currentPage++;
        }else{
            player.setGameLevel(levelRepository.findById(4L).get());
            playerService.savePlayer(player);

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

    @GetMapping("/nyspelare")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

}
