package com.example.practice_bilingual.service;

import com.example.practice_bilingual.dto.request.AdminRequest;
import com.example.practice_bilingual.dto.request.ClientRequest;
import com.example.practice_bilingual.dto.response.AdminResponse;
import com.example.practice_bilingual.dto.response.ClientResponse;
import com.example.practice_bilingual.entity.Admin;
import com.example.practice_bilingual.entity.Client;

import java.util.List;
import java.util.Optional;

public interface AdminService {

//    void saveFounder(Admin admin);

    List<Admin> findAllAdmin();

    AdminResponse saveAdmin(Long id, AdminRequest adminRequest);

    Optional<Admin> findByIdAdmin(Long id);

    Admin getAdminById(Long id);

    void deleteByIdAdmin(Long id);

    AdminResponse updateAdmin(Long id, AdminRequest adminRequest);

}
