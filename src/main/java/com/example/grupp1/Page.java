package com.example.grupp1;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PAGE")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAGE_ID")
    Long id;
    @Column(name = "QUESTION")
    String question;
    @Column(name = "ANSWER")
    String answers;

    @ManyToOne
    private LevelSpel levelSpel;

    public Page(Long id, String question, String answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public Page() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public LevelSpel getLevelSpel() {
        return levelSpel;
    }

    public void setLevelSpel(LevelSpel levelSpel) {
        this.levelSpel = levelSpel;
    }
}
