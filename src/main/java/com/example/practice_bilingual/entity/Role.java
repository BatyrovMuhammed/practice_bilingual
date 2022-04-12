package com.example.practice_bilingual.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role implements GrantedAuthority {

    @SequenceGenerator(name = "student_sequence",
            sequenceName = "student_seq",
            allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    private String roleName;

    @ManyToMany(cascade = {MERGE,DETACH,PERSIST,REFRESH},mappedBy = "roles")
    private List<AuthInfo> authInfo;


    public void setAuthInfo1(AuthInfo authInfos) {
        if (authInfo == null) {
            authInfo = new ArrayList<>();
        }
        authInfo.add(authInfos);
    }

    @Override
    public String getAuthority() {
        return this.roleName;
    }

}
