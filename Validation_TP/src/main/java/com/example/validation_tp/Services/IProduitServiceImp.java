package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Produit;
import com.example.validation_tp.Repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IProduitServiceImp implements IProduitService{

    @Autowired
    ProduitRepository produitRepository;

    @Autowired
    IStockService iStockService;

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit getProduitById(long idProduit) {
        return produitRepository.findById(idProduit).orElse(null);
    }

    @Override
    public void removeProduitById(long idProduit) {
        produitRepository.deleteById(idProduit);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p=getProduitById(idProduit);
        if ( p != null && iStockService.getStockById(idStock)!=null){
            p.setStock(iStockService.getStockById(idStock));
            produitRepository.save(p);}
    }
}
