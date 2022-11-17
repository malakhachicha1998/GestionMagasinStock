package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.DetailProduit;
import com.example.validation_tp.Entities.Facture;

import java.util.List;

public interface IFactureService {

    public List<Facture> getAllFactures();

    public Facture addFacture(Facture f);

    public Facture updateFacture (Facture f);

    public Facture getFactureById (long idFacture);

    public void removeFactureById (long idFacture);
}
