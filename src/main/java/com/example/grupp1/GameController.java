package com.example.grupp1;

import com.example.grupp1.models.GameLevel;
import com.example.grupp1.models.Page;
import com.example.grupp1.models.Player;
import com.example.grupp1.repository.PlayerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private PlayerRepository playerRepository;

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
        List<String> answerList = new ArrayList<>();
        answerList.add("1");
        answerList.add("2");
        answerList.add("3");
        answerList.add("4");
        Page page1 = new Page(1L, "Vad blir 1+1?","2");
        List<Page> pageList = new ArrayList<>();
        pageList.add(page1);
        GameLevel level = new GameLevel(1L, "Level 1");
        model.addAttribute("levelList", level);
        model.addAttribute("answerList", answerList);
        model.addAttribute("player", player);

        return "level1";
    }


}
