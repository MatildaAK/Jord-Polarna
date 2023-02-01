package com.example.jordpolarna;

import com.example.jordpolarna.models.GameLevel;
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

import java.util.List;

@Controller
public class LevelController {
    @Autowired
    private LevelRepository levelRepository;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PageRepository pageRepository;
    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping("/levelOverview")
    String levelOverview(HttpSession session, Model model){
        Player player = (Player) session.getAttribute("gameLevel");
        List<GameLevel> levelList = (List)levelRepository.findAll();
        int playerLevel = player.getGameLevel().getId().intValue();

        model.addAttribute("levelList", levelList);
        model.addAttribute("player", player);
        model.addAttribute("playerLevel", playerLevel);

        return "levelPage";
    }
}
