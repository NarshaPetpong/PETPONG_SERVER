package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Comment_number;


    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostEntity post;

    @Column
    private int level;


}
