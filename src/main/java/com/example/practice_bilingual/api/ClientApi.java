package com.example.practice_bilingual.api;

import com.example.practice_bilingual.dto.request.ClientRequest;
import com.example.practice_bilingual.dto.response.ClientResponse;
import com.example.practice_bilingual.entity.Client;
import com.example.practice_bilingual.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client/{id}")
public class ClientApi {


    private final ClientService clientService;

    //@PreAuthorize("hasAnyAuthority('ADMIN','STUDENT','TEACHER')")
    @GetMapping
    public List<Client> findAllStudent() {
        return clientService.findAllClient();
    }

   // @PreAuthorize("hasAnyAuthority('ADMIN','STUDENT')")
    @PostMapping("/save")
    public ClientResponse saveStudent(@PathVariable("id") Long id,
                                      @RequestBody ClientRequest clientRequest) {
        return clientService.saveClient(id, clientRequest);
    }

   // @PreAuthorize("hasAnyAuthority('ADMIN','STUDENT')")
    @DeleteMapping("/delete/{deleteId}")
    public void deleteByStudent(@PathVariable("deleteId") Long id) {
        clientService.deleteByIdClient(id);
    }

    //@PreAuthorize("hasAnyAuthority('ADMIN','STUDENT','TEACHER')")
    @GetMapping("/find/{findId}")
    public Optional<Client> findByIdStudent(@PathVariable("findId") Long id) {
        return clientService.findByIdClient(id);
    }

   // @PreAuthorize("hasAnyAuthority('ADMIN','STUDENT')")
    @PatchMapping("/update/{updateId}")
    public ClientResponse updateCourse(@PathVariable("updateId") Long id, @RequestBody ClientRequest clientRequest) {
        return clientService.updateClient(id, clientRequest);
    }
}
