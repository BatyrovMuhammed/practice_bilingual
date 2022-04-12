package com.example.practice_bilingual.api;

import com.example.practice_bilingual.dto.request.AdminRequest;
import com.example.practice_bilingual.dto.response.AdminResponse;
import com.example.practice_bilingual.entity.Admin;
import com.example.practice_bilingual.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/{id}")
public class AdminApi {

    private final AdminService adminService;

    //@PreAuthorize("hasAnyAuthority('ADMIN','STUDENT','TEACHER')")
    @GetMapping
    public List<Admin> findAllStudent() {
        return adminService.findAllAdmin();
    }

    // @PreAuthorize("hasAnyAuthority('ADMIN','STUDENT')")
    @PostMapping("/save")
    public AdminResponse saveAdmin(@PathVariable("id") Long id,
                                   @RequestBody AdminRequest adminRequest) {
        return adminService.saveAdmin(id, adminRequest);
    }

    // @PreAuthorize("hasAnyAuthority('ADMIN','STUDENT')")
    @DeleteMapping("/delete/{deleteId}")
    public void deleteByAdmin(@PathVariable("deleteId") Long id) {
        adminService.deleteByIdAdmin(id);
    }

    //@PreAuthorize("hasAnyAuthority('ADMIN','STUDENT','TEACHER')")
    @GetMapping("/find/{findId}")
    public Optional<Admin> findByIdAdmin(@PathVariable("findId") Long id) {
        return adminService.findByIdAdmin(id);
    }

    // @PreAuthorize("hasAnyAuthority('ADMIN','STUDENT')")
    @PatchMapping("/update/{updateId}")
    public AdminResponse updateCourse(@PathVariable("updateId") Long id, @RequestBody AdminRequest adminRequest) {
        return adminService.updateAdmin(id, adminRequest);
    }
}
