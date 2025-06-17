package com.mysite.sbb;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime createDate;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    //mappedBy 속성을 지정하지 않으면 중간테이블을 만든다.
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Answer> answer;
}