package com.example.practice_bilingual.mapper.viewMapper;

import com.example.practice_bilingual.dto.response.ClientResponse;
import com.example.practice_bilingual.entity.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientViewMapper {

    public ClientResponse viewClient(Client client) {
        if (client == null) {
            return null;
        }
        ClientResponse clientResponse = new ClientResponse();
        if (client.getId() != null) {
            clientResponse.setId(String.valueOf(client.getId()));
        }
        clientResponse.setName(client.getName());
        clientResponse.setEmail(client.getEmail());
        return clientResponse;

    }

    public List<ClientResponse> viewClient(List<Client> students) {
        List<ClientResponse> clientResponses = new ArrayList<>();
        for (Client c : students
        ) {
            clientResponses.add(viewClient(c));
        }
        return clientResponses;
    }
}
