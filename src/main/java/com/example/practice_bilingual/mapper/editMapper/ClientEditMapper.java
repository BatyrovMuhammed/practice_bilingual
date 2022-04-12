package com.example.practice_bilingual.mapper.editMapper;

import com.example.practice_bilingual.dto.request.ClientRequest;
import com.example.practice_bilingual.entity.AuthInfo;
import com.example.practice_bilingual.entity.Client;
import com.example.practice_bilingual.repository.RoleRepository;
import org.springframework.stereotype.Component;

@Component
public class ClientEditMapper {

    private final RoleRepository roleRepository;

    public ClientEditMapper(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Client create(Long id, ClientRequest clientRequest) {
        if (clientRequest == null) {
            return null;
        }
        Client client = new Client();
        client.setName(clientRequest.getName());
        client.setEmail(clientRequest.getEmail());
        client.setPassword(clientRequest.getPassword());

        AuthInfo authInfo = new AuthInfo();
        authInfo.setEmail(clientRequest.getEmail());
        authInfo.setPassword(clientRequest.getPassword());
        authInfo.setAuthInfo1(roleRepository.getById(id));

        client.setAuthInfo(authInfo);
        return client;
    }

    public void Update(Client client, ClientRequest clientRequest) {
        client.setName(clientRequest.getName());
        client.setEmail(clientRequest.getEmail());
    }
}
