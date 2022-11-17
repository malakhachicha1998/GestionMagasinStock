package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Entities.Produit;
import com.example.validation_tp.Services.IClientService;
import com.example.validation_tp.Services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")

public class ProduitController {

    @Autowired
    IProduitService iProduitService;

    @GetMapping
    public List<Produit> getAllProduits() {
        return iProduitService.getAllProduits();
    }

    @PostMapping
    public Produit addProduit(@RequestBody Produit p) {
        return iProduitService.addProduit(p);
    }

    @PutMapping
    public Produit updateProduit(@RequestBody Produit p) {
        return iProduitService.updateProduit(p);
    }

    @GetMapping("/{idProduit}")
    public Produit getProduitById(@PathVariable long idProduit) {
        return iProduitService.getProduitById(idProduit);
    }

    @DeleteMapping("/{idProduit}")
    public void removeProduitById(@PathVariable long idProduit) {
        iProduitService.removeProduitById(idProduit);
    }
    @PutMapping("/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable long idProduit, @PathVariable long idStock){
        iProduitService.assignProduitToStock(idProduit,idStock);
    }
}

