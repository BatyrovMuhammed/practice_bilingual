package com.example.practice_bilingual.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "admin")
@Getter
@Setter
@NoArgsConstructor
public class Admin {

    @SequenceGenerator(name = "student_sequence",
            sequenceName = "student_seq",
            allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToOne(cascade = ALL)
    private AuthInfo authInfo;

    public Admin(String name, String email, String password, AuthInfo authInfo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authInfo = authInfo;
    }
}
