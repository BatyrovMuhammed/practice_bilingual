package com.example.practice_bilingual.repository;

import com.example.practice_bilingual.entity.AuthInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReturnTokenRepository extends JpaRepository<AuthInfo, UUID> {

    Optional<AuthInfo> findByEmail(String email);
}
