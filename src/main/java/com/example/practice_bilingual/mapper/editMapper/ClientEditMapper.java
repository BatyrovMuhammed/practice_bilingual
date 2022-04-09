package com.example.practice_bilingual.mapper.editMapper;

import com.example.practice_bilingual.dto.request.ClientRequest;
import com.example.practice_bilingual.entity.AuthInfo;
import com.example.practice_bilingual.entity.Client;
import com.example.practice_bilingual.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class ClientEditMapper {

    public Client create(Long id, ClientRequest clientRequest) {
        if (clientRequest == null) {
            return null;
        }
        Client student = new Client();
        student.setName(clientRequest.getName());
        student.setEmail(clientRequest.getEmail());

        AuthInfo authInfo = new AuthInfo();
        authInfo.setEmail(clientRequest.getEmail());
        authInfo.setPassword(clientRequest.getPassword());
//        Role roles = new Role();
//        roles.setName("CLIENT");
//        authInfo.setRole1(roles);

        student.setAuthInfo(authInfo);
        return student;
    }

    public void Update(Client client, ClientRequest clientRequest) {
        client.setName(clientRequest.getName());
        client.setEmail(clientRequest.getEmail());
    }
}
