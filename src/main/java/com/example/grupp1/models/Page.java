package com.example.grupp1.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PAGE")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "QUESTION")
    String question;
    @Column(name = "CORRECTANSWER")
    Long correctAnswer;
    @Column(name = "IMAGE")
    String image;
    @ManyToOne
    private GameLevel gameLevel;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "page", cascade = CascadeType.ALL)
    List<Answer> answers = new ArrayList<>();


    public Page(Long id, String question, Long correctAnswer, String image) {
        this.id = id;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.image = image;
    }

    public Page() {
    }

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}

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

    public Long getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Long correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
