package com.example.practice_bilingual.service.impl;

import com.example.practice_bilingual.dto.request.RoleRequest;
import com.example.practice_bilingual.dto.response.RoleResponse;
import com.example.practice_bilingual.mapper.editMapper.RoleEditMapper;
import com.example.practice_bilingual.mapper.viewMapper.RoleViewMapper;
import com.example.practice_bilingual.repository.RoleRepository;
import com.example.practice_bilingual.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleEditMapper roleEditMapper;
    private final RoleViewMapper roleViewMapper;

    @Override
    public RoleResponse save(RoleRequest roleRequest) {
        return roleViewMapper.viewClient(roleRepository.save(roleEditMapper.create(roleRequest)));
    }
}
