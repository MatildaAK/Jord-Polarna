package com.example.grupp1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {

    @GetMapping("/")
    String start(Model model){
        List<String> answerList = new ArrayList<>();
        answerList.add("1");
        answerList.add("2");
        answerList.add("3");
        answerList.add("4");
        Page page1 = new Page(1L, "Vad blir 1+1?", answerList);
        List<Page> pageList = new ArrayList<>();
        pageList.add(page1);
        Level level = new Level(1L, "Level 1", pageList);
        model.addAttribute("levelList", level);
        model.addAttribute("answerList", answerList);

        return "startPage";
    }



}
