package com.example.practice_bilingual.repository;

import com.example.practice_bilingual.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query("select case when count(c) > 0 then true else false end" +
            " from Admin c where c.authInfo.email = ?1")
    boolean existsByEmail(String email);
}
