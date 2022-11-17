package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")

public class ClientController {

    @Autowired
    IClientService iClientService;

    @GetMapping
    public List<Client> getAllClients() {
        return iClientService.getAllClients();
    }

    @PostMapping
    public Client addClient(@RequestBody Client c) {
        return iClientService.addClient(c);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client c) {
        return iClientService.updateClient(c);
    }

    @GetMapping("/{idClient}")
    public Client getClientById(@PathVariable long idClient) {
        return iClientService.getClientById(idClient);
    }

    @DeleteMapping("/{idClient}")
    public void removeClientById(@PathVariable long idClient) {
        iClientService.removeClientById(idClient);
    }
}
