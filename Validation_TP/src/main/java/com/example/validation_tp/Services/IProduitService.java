package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Fournisseur;
import com.example.validation_tp.Entities.Produit;

import java.util.List;

public interface IProduitService {

    public List<Produit> getAllProduits();

    public Produit addProduit(Produit p);

    public Produit updateProduit (Produit p);

    public Produit getProduitById (long idProduit);

    public void removeProduitById (long idProduit);

    public void assignProduitToStock(Long idProduit, Long idStock);
}
