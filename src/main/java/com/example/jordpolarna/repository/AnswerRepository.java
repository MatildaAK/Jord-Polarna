package com.example.jordpolarna.repository;

import com.example.jordpolarna.models.Answer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer,Long> {

    @Query(value ="SELECT * FROM ANSWER WHERE PAGE_ID = ?;",nativeQuery = true)
    List<Answer> findAllFromPage(int i);

}
