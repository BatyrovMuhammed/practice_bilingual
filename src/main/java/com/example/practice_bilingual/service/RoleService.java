package com.example.practice_bilingual.service;

import com.example.practice_bilingual.dto.request.RoleRequest;
import com.example.practice_bilingual.dto.response.RoleResponse;
import com.example.practice_bilingual.entity.Role;

public interface RoleService {

    RoleResponse save(RoleRequest roleRequest);
}
