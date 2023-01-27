package com.example.grupp1.repository;

import com.example.grupp1.models.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {
    @Query(value ="SELECT * FROM PAGE WHERE GAME_LEVEL_ID = ?;",nativeQuery = true)

    List<Page> findAllGameLvl(int i);

    /*@Query(value ="SELECT * FROM PAGE WHERE GAME_LEVEL_ID = 2;",nativeQuery = true)

    List<Page> findAllGameLvl2(long i);*/
}

