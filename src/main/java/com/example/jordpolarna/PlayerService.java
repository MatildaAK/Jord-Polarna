package com.example.jordpolarna;


import com.example.jordpolarna.models.Player;
import com.example.jordpolarna.repository.LevelRepository;
import com.example.jordpolarna.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    LevelRepository levelRepository;

    void saveNewPlayer(String name){
        Player player = new Player();
        player.setName(name);
        player.setGameLevel(levelRepository.findById(1L).get());
        savePlayer(player);
    }
    void savePlayer(Player player){
        playerRepository.save(player);
    }

    Player getPlayer(String name){
        Player player = playerRepository.findByName(name);
        return player;
    }

}
