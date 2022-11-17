package com.example.validation_tp.Repositories;

import com.example.validation_tp.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
