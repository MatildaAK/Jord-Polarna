package com.example.grupp1;

import com.example.grupp1.models.GameLevel;
import com.example.grupp1.models.Page;
import com.example.grupp1.models.Player;
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

import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PageRepository pageRepository;

    @GetMapping("/")
    String reg(HttpSession session,  Model model){
        if(session.getAttribute("gameLevel") == null) {
            Player player = playerRepository.save(new Player());
            session.setAttribute("gameLevel", player);
        }
        model.addAttribute("gameLevel", session.getAttribute("gameLevel"));
        return "player";
    }

    @PostMapping("/register")
    String register(HttpSession session, Model model, @ModelAttribute Player gameLevel) {
        Player sessionGameLevel = (Player) session.getAttribute("gameLevel");
        sessionGameLevel.setName(gameLevel.getName());
        model.addAttribute("gameLevel", session.getAttribute("gameLevel"));
        playerRepository.save(sessionGameLevel);
        return "redirect:/level1";
    }
    @GetMapping("/level1")
    String start(Model model, HttpSession session){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(1l);
        int currentPage = 1;

        session.setAttribute("current", currentPage);
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        model.addAttribute("currentPage", currentPage);

        return "level1";
    }

    @PostMapping("/level1")
    String answer(Model model, HttpSession session, @RequestParam String correctanswer, @RequestParam int id){
        Player player = (Player) session.getAttribute("gameLevel");
        List<Page> pages = pageRepository.findAllGameLvl(1l);
        int currentPage = id;
        currentPage +=1;
        model.addAttribute("player", player);
        model.addAttribute("pages", pages);
        session.setAttribute("current", currentPage);

        return "level1";
    }



}
