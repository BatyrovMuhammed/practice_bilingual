package com.example.practice_bilingual.mapper.editMapper;

import com.example.practice_bilingual.dto.request.AdminRequest;
import com.example.practice_bilingual.entity.Admin;
import com.example.practice_bilingual.entity.AuthInfo;
import com.example.practice_bilingual.repository.RoleRepository;
import org.springframework.stereotype.Component;

@Component
public class AdminEditMapper {

    private final RoleRepository roleRepository;

    public AdminEditMapper(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public Admin create(Long id, AdminRequest adminRequest) {
        if (adminRequest == null) {
            return null;
        }
        Admin admin = new Admin();
        admin.setAdminName(adminRequest.getAdminName());
        admin.setEmail(adminRequest.getEmail());
        admin.setPassword(adminRequest.getPassword());

        AuthInfo authInfo = new AuthInfo();
        authInfo.setEmail(adminRequest.getEmail());
        authInfo.setPassword(adminRequest.getPassword());
        authInfo.setAuthInfo1(roleRepository.getById(id));

        admin.setAuthInfo(authInfo);
        return admin;
    }

    public void Update(Admin admin, AdminRequest adminRequest) {
        admin.setAdminName(adminRequest.getAdminName());
        admin.setEmail(admin.getEmail());
    }

}
