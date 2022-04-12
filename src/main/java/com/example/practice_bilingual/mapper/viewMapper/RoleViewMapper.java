package com.example.practice_bilingual.mapper.viewMapper;

import com.example.practice_bilingual.dto.response.RoleResponse;
import com.example.practice_bilingual.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleViewMapper {

    public RoleResponse viewClient(Role role) {
        if (role == null) {
            return null;
        }
        RoleResponse roleResponse = new RoleResponse();
        if (role.getId() != null) {
            roleResponse.setId(String.valueOf(role.getId()));
        }
        roleResponse.setRoleName(role.getRoleName());
        return roleResponse;

    }
}
