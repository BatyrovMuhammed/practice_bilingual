package com.example.practice_bilingual.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_sequence")
    @SequenceGenerator(name = "client_sequence", sequenceName = "client_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToOne(cascade = ALL)
    private AuthInfo authInfo;

    public Client(String name, String email, String password, AuthInfo authInfo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authInfo = authInfo;
    }
}

