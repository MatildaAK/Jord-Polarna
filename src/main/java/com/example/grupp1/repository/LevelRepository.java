package com.example.grupp1.repository;

import com.example.grupp1.models.GameLevel;
import org.springframework.data.repository.CrudRepository;

public interface LevelRepository extends CrudRepository<GameLevel, Long> {
}
