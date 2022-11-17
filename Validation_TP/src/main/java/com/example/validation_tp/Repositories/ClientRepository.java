package com.example.validation_tp.Repositories;

import com.example.validation_tp.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
