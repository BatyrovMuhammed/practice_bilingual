package com.example.practice_bilingual.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "question")
@Getter
@Setter
public class Question {

    @SequenceGenerator(name = "student_sequence",
            sequenceName = "student_seq",
            allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "student_sequence")
    private Long id;
    private String title;
    private String shortDescription;
   // private Timer duration;

    // TODO: 09.04.2022  relationShip with test
}
