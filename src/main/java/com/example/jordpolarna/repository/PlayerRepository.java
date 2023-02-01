package com.example.jordpolarna.repository;

import com.example.jordpolarna.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findByName(String name);
}
