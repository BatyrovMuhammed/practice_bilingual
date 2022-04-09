package com.example.practice_bilingual.service;

import com.example.practice_bilingual.dto.request.ClientRequest;
import com.example.practice_bilingual.dto.response.ClientResponse;
import com.example.practice_bilingual.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> findAllClient();

    ClientResponse saveClient(Long id, ClientRequest clientRequest);

    Optional<Client> findByIdClient(Long id);

    Client getClientById(Long id);

    void deleteByIdClient(Long id);

    ClientResponse updateClient(Long id, ClientRequest clientRequest);
}
