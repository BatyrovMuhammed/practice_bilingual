package com.example.practice_bilingual.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReturnTokenResponse {

    private String email;

    private String token;
}
