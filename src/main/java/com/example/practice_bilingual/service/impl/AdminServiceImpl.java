package com.example.practice_bilingual.service.impl;

import com.example.practice_bilingual.entity.Admin;
import com.example.practice_bilingual.repository.AdminRepository;
import com.example.practice_bilingual.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AdminServiceImpl implements AdminService {

   private final AdminRepository adminRepository;

    @Override
    public void saveFounder(Admin admin) {
        adminRepository.save(admin);

    }
}
