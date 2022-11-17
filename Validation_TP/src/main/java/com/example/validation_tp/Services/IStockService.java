package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Rayon;
import com.example.validation_tp.Entities.Stock;

import java.util.List;

public interface IStockService {

    public List<Stock> getAllStocks();

    public Stock addStock(Stock s);

    public Stock updateStock (Stock s);

    public Stock getStockById (long idStock);

    public void removeStockById (long idStock);
}
