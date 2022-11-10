package com.example.demo.Entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
//@Table(name = "Post_Board")
@ToString
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer post_number;

    @Column(nullable = false)
    public String title;

    @Column(nullable = false)
    private String writing;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String writer;

    @Column
    private Integer heart;

    public PostEntity() {
        this.title = getTitle();
        this.writing = getWriting();
        this.date = getDate();
        this.writer = getWriter();
        this.heart = getHeart();
    }
}
