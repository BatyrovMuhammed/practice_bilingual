package com.example.practice_bilingual.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "authInfo")
@Getter
@Setter
public class AuthInfo implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String email;
    private String password;
    private boolean isAccountNonExpired = true;
    private boolean isAccountNonLocked = true;
    private boolean isCredentialsNonExpired = true;
    private boolean isEnabled = true;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authInfo_roles",
            joinColumns = @JoinColumn(name = "authInfo_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private List<Role> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.synchronizedCollection(roles);
    }

    @Override
    public String getUsername() {
        return email;
    }


    public void setRole1(Role roless) {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        roles.add(roless);
    }
}
