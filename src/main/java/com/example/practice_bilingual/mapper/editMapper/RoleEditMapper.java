package com.example.practice_bilingual.mapper.editMapper;

import com.example.practice_bilingual.dto.request.RoleRequest;
import com.example.practice_bilingual.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleEditMapper {

    public Role create( RoleRequest request) {
        if (request == null) {
            return null;
        }
        Role role = new Role();
        role.setRoleName(request.getRoleName());
        return role;
    }
}
