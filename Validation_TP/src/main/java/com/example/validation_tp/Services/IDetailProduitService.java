package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.DetailFacture;
import com.example.validation_tp.Entities.DetailProduit;

import java.util.List;

public interface IDetailProduitService {

    public List<DetailProduit> getAllDetailProduits();

    public DetailProduit addDetailProduit(DetailProduit d);

    public DetailProduit updateDetailProduit (DetailProduit d);

    public DetailProduit getDetailProduitById (long idDetailProduit);

    public void removeDetailProduitById (long idDetailProduit);
}
