package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Rayon;
import com.example.validation_tp.Entities.Stock;
import com.example.validation_tp.Repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IStockServiceImp implements IStockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock getStockById(long idStock) {
        return stockRepository.findById(idStock).orElse(null);
    }

    @Override
    public void removeStockById(long idStock) {
        stockRepository.deleteById(idStock);
    }
}
