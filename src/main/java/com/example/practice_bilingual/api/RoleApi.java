package com.example.practice_bilingual.api;

import com.example.practice_bilingual.dto.request.RoleRequest;
import com.example.practice_bilingual.dto.response.RoleResponse;
import com.example.practice_bilingual.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/role")
public class RoleApi {

    private final RoleService roleService;

    @PostMapping("/save")
    public RoleResponse save(@RequestBody RoleRequest roleRequest){
        return roleService.save(roleRequest);
    }
}
