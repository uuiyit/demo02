package com.example.demo02.mybatiscatalog.jpa;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Discuss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String content;
    private  String author;
    @Column(name = "a_id")
    private Integer aId;
}
