package com.example.grupp1;

import com.example.grupp1.models.GameLevel;
import com.example.grupp1.models.Player;
import com.example.grupp1.repository.AnswerRepository;
import com.example.grupp1.repository.LevelRepository;
import com.example.grupp1.repository.PageRepository;
import com.example.grupp1.repository.PlayerRepository;
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

        model.addAttribute("levelList", levelList);
        model.addAttribute("player", player);

        return "levelPage";
    }
}
