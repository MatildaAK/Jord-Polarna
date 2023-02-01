package com.example.grupp1;

import com.example.grupp1.models.Page;
import com.example.grupp1.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {

    @Autowired
    PageRepository pageRepository;


    List<Page> getAllPagesFromLevel(int i){
        List<Page> pages = pageRepository.findAllPagesFromGameLvl(i);
        return pages;
    }

    List<Page> getAllPreviousPagesWhereLevel(int i){
        List<Page> previousPages = pageRepository.findAllPreviousPagesWhereGameLevel(i);
        return previousPages;
    }

    int getFirstPageFromLevel(int i){
        List<Page> pages = pageRepository.findAllPagesFromGameLvl(i);
        return pages.get(0).getId().intValue();
    }

    int getTotalAmountOfQuestionsSoFar(int currentLevel){
        int total = getAllPagesFromLevel(currentLevel).size()+getAllPreviousPagesWhereLevel(currentLevel).size();
        return total;
    }



}
