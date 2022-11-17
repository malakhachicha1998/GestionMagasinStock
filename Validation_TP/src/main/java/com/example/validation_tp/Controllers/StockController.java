package com.example.validation_tp.Controllers;


import com.example.validation_tp.Entities.Stock;
import com.example.validation_tp.Services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")

public class StockController {

    @Autowired
    IStockService iStockService;

    @GetMapping
    public List<Stock> getAllStocks() {
        return iStockService.getAllStocks();
    }

    @PostMapping
    public Stock addStock(@RequestBody Stock s) {
        return iStockService.addStock(s);
    }

    @PutMapping
    public Stock updateStock(@RequestBody Stock s) {
        return iStockService.updateStock(s);
    }

    @GetMapping("/{idStock}")
    public Stock getStockById(@PathVariable long idStock) {
        return iStockService.getStockById(idStock);
    }

    @DeleteMapping("/{idStock}")
    public void removeStockById(@PathVariable long idStock) {
        iStockService.removeStockById(idStock);
    }
}
