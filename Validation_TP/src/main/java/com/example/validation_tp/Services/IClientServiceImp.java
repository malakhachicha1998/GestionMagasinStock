package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IClientServiceImp implements IClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client getClientById(long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void removeClientById(long idClient) {
        clientRepository.deleteById(idClient);
    }
}
