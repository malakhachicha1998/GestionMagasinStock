package com.example.validation_tp.Repositories;

import com.example.validation_tp.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
