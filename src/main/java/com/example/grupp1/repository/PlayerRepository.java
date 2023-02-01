package com.example.grupp1.repository;

import com.example.grupp1.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findByName(String name);
}
