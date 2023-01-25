package com.example.grupp1.models;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private String answeropt;

    @ManyToOne
    private Page page;

    public Answer() {
    }

    public Answer(Long id, String answeropt) {
        this.id = id;
        this.answeropt = answeropt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnsweropt() {
        return answeropt;
    }

    public void setAnsweropt(String answeropt) {
        this.answeropt = answeropt;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
