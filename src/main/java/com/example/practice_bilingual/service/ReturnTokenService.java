package com.example.practice_bilingual.service;

import com.example.practice_bilingual.dto.request.ReturnTokenRequest;
import com.example.practice_bilingual.dto.response.ReturnTokenResponse;

public interface ReturnTokenService {

    ReturnTokenResponse returnToken(ReturnTokenRequest returnTokenRequest);
}
