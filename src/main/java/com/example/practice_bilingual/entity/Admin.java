package com.example.practice_bilingual.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "admin")
@Getter
@Setter
@NoArgsConstructor
public class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_sequence")
    @SequenceGenerator(name = "admin_sequence", sequenceName = "admin_seq", allocationSize = 1)
    private Long id;
    private String adminName;
    private String email;
    private String password;

    @OneToOne(cascade = ALL)
    private AuthInfo authInfo;

    public Admin(String adminName, String email, String password, AuthInfo authInfo) {
        this.adminName = adminName;
        this.email = email;
        this.password = password;
        this.authInfo = authInfo;
    }
}
