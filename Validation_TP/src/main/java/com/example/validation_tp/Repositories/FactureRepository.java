package com.example.validation_tp.Repositories;

import com.example.validation_tp.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
