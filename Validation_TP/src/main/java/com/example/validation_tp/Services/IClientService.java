package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Client;

import java.util.List;

public interface IClientService {

    public List<Client> getAllClients();

    public Client addClient(Client c);

    public Client updateClient (Client c);

    public Client getClientById (long idClient);

    public void removeClientById (long idClient);
}
