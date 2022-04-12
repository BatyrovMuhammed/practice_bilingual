package com.example.practice_bilingual.mapper.viewMapper;

import com.example.practice_bilingual.dto.response.AdminResponse;
import com.example.practice_bilingual.entity.Admin;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdminViewMapper {

    public AdminResponse viewAdmin(Admin admin) {
        if (admin == null) {
            return null;
        }
        AdminResponse adminResponse = new AdminResponse();
        if (admin.getId() != null) {
            adminResponse.setId(String.valueOf(admin.getId()));
        }
        adminResponse.setAdminName(admin.getAdminName());
        adminResponse.setEmail(admin.getEmail());
        return adminResponse;

    }

    public List<AdminResponse> viewAdmin(List<Admin> admins) {
        List<AdminResponse> adminResponses = new ArrayList<>();
        for (Admin c : admins
        ) {
            adminResponses.add(viewAdmin(c));
        }
        return adminResponses;
    }
}
