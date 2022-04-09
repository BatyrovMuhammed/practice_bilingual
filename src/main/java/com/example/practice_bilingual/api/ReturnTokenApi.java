package com.example.practice_bilingual.api;

import com.example.practice_bilingual.dto.request.ReturnTokenRequest;
import com.example.practice_bilingual.dto.response.ReturnTokenResponse;
import com.example.practice_bilingual.service.ReturnTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
@AllArgsConstructor
@RequestMapping("/api/authentication")
public class ReturnTokenApi {

private final ReturnTokenService returnTokenService;

    @PostMapping
    @PermitAll
    public ReturnTokenResponse save(@RequestBody ReturnTokenRequest returnTokenRequest){
        return returnTokenService.returnToken(returnTokenRequest);
    }
}
