package com.example.practice_bilingual.service.impl;

import com.example.practice_bilingual.dto.request.AdminRequest;
import com.example.practice_bilingual.dto.response.AdminResponse;
import com.example.practice_bilingual.entity.Admin;
import com.example.practice_bilingual.mapper.editMapper.AdminEditMapper;
import com.example.practice_bilingual.mapper.viewMapper.AdminViewMapper;
import com.example.practice_bilingual.repository.AdminRepository;
import com.example.practice_bilingual.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AdminServiceImpl implements AdminService {

   private final AdminRepository adminRepository;
    private final AdminEditMapper adminEditMapper;
    private final AdminViewMapper adminViewMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<Admin> findAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public AdminResponse saveAdmin(Long id, AdminRequest adminRequest) {
        adminRequest.setPassword(passwordEncoder.encode(adminRequest.getPassword()));
        System.out.println(adminRequest.getPassword());
        return adminViewMapper.viewAdmin(
                adminRepository.save(
                        adminEditMapper.create(id,adminRequest)));
    }

    @Override
    public Optional<Admin> findByIdAdmin(Long id) {
        return adminRepository.findById(id);
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.getById(id);
    }

    @Override
    public void deleteByIdAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public AdminResponse updateAdmin(Long id, AdminRequest adminRequest) {
        Admin admin = adminRepository.findById(id).get();
        adminEditMapper.Update(admin, adminRequest);
        return adminViewMapper.viewAdmin(adminRepository.save(admin));
    }
}
