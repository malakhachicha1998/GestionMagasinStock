package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.DetailProduit;
import com.example.validation_tp.Entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

    public List<Fournisseur> getAllFournisseurs();

    public Fournisseur addFournisseur(Fournisseur f);

    public Fournisseur updateFournisseur (Fournisseur f);

    public Fournisseur getFournisseurById (long idFournisseur);

    public void removeFournisseurById (long idFournisseur);
}
