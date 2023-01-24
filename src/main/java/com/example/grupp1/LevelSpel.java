package com.example.grupp1;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "LEVELSPEL")
public class LevelSpel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "NAME")
    String name;
    @OneToMany(mappedBy = "levelSpel", cascade = CascadeType.ALL)
    List<Page> pageList = new ArrayList<>(); //List of all pages in each level.

    public LevelSpel(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public LevelSpel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }
}
