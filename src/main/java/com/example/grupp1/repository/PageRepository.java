package com.example.grupp1.repository;

import com.example.grupp1.models.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {
    @Query(value ="SELECT * FROM PAGE WHERE GAME_LEVEL_ID = ?;",nativeQuery = true)
    List<Page> findAllPagesFromGameLvl(long i);

    @Query(value ="SELECT * FROM PAGE WHERE GAME_LEVEL_ID < ?;",nativeQuery = true)
    List<Page> findAllPreviousPagesWhereGameLevel(int i);

}

