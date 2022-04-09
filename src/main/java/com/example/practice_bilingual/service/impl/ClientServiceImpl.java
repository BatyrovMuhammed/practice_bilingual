package com.example.practice_bilingual.service.impl;

import com.example.practice_bilingual.dto.request.ClientRequest;
import com.example.practice_bilingual.dto.response.ClientResponse;
import com.example.practice_bilingual.entity.Client;
import com.example.practice_bilingual.mapper.editMapper.ClientEditMapper;
import com.example.practice_bilingual.mapper.viewMapper.ClientViewMapper;
import com.example.practice_bilingual.repository.ClientRepository;
import com.example.practice_bilingual.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientEditMapper clientEditMapper;
    private final ClientViewMapper clientViewMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<Client> findAllClient() {
        return null;
    }

    @Override
    public ClientResponse saveClient(Long id, ClientRequest clientRequest) {
       clientRequest.setPassword(passwordEncoder.encode(clientRequest.getPassword()));
        return clientViewMapper.viewClient(
                clientRepository.save(
                        clientEditMapper.create(id,clientRequest)));
    }

    @Override
    public Optional<Client> findByIdClient(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.getById(id);
    }

    @Override
    public void deleteByIdClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public ClientResponse updateClient(Long id, ClientRequest clientRequest) {
        Client client = clientRepository.findById(id).get();
        clientEditMapper.Update(client, clientRequest);
        return clientViewMapper.viewClient(clientRepository.save(client));
    }
}
