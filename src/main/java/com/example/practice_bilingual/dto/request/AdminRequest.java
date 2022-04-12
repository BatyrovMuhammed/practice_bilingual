package com.example.practice_bilingual.dto.request;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class AdminRequest {

    @NotNull
    private String adminName;

    @Email
    private String email;

    private String password;

}
