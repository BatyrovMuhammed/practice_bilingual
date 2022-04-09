package com.example.practice_bilingual.api;

import com.example.practice_bilingual.entity.Admin;
import com.example.practice_bilingual.entity.AuthInfo;
import com.example.practice_bilingual.entity.Role;
import com.example.practice_bilingual.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/save")
public class AdminApi {

//    private final AdminService adminService;
//    private final PasswordEncoder passwordEncoder;
//
//    @PostConstruct
//    public void save(){
//        Admin admin = new Admin();
//        admin.setName("Muhammed");
//        admin.setEmail("muhammed@gmail.com");
//        admin.setPassword(passwordEncoder.encode("2003"));
//
//        AuthInfo authInfo = new AuthInfo();
//        authInfo.setEmail(admin.getEmail());
//        authInfo.setPassword(admin.getPassword());
//
//        admin.setAuthInfo(authInfo);
//        adminService.saveFounder(admin);
    //}
}
