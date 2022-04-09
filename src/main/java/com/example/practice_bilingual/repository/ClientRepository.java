package com.example.practice_bilingual.repository;

import com.example.practice_bilingual.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Override
    List<Client> findAll();

    @Override
    Client getById(Long aLong);

    @Override
    <S extends Client> S save(S entity);

    @Override
    Optional<Client> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
