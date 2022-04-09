package com.example.practice_bilingual.service.impl;

import com.example.practice_bilingual.dto.request.ReturnTokenRequest;
import com.example.practice_bilingual.dto.response.ReturnTokenResponse;
import com.example.practice_bilingual.jwt.JwtUtils;
import com.example.practice_bilingual.repository.ReturnTokenRepository;
import com.example.practice_bilingual.service.ReturnTokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReturnTokenServiceImpl implements ReturnTokenService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

    @Override
    public ReturnTokenResponse returnToken(ReturnTokenRequest returnTokenRequest) {
        Authentication authentication;
        authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                returnTokenRequest.getEmail(),
                returnTokenRequest.getPassword()));

        String generatedToken = jwtUtils.generateToken(authentication);

        return ReturnTokenResponse.builder()
                .email(returnTokenRequest.getEmail())
                .token(generatedToken)
                .build();
    }
}
