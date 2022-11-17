package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.DetailProduit;
import com.example.validation_tp.Repositories.DetailProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IDetailProduitServiceImp implements IDetailProduitService{

    @Autowired
    DetailProduitRepository detailProduitRepository;

    @Override
    public List<DetailProduit> getAllDetailProduits() {
        return detailProduitRepository.findAll();
    }

    @Override
    public DetailProduit addDetailProduit(DetailProduit d) {
        return detailProduitRepository.save(d);
    }

    @Override
    public DetailProduit updateDetailProduit(DetailProduit d) {
        return detailProduitRepository.save(d);
    }

    @Override
    public DetailProduit getDetailProduitById(long idDetailProduit) {
        return detailProduitRepository.findById(idDetailProduit).orElse(null);
    }

    @Override
    public void removeDetailProduitById(long idDetailProduit) {
        detailProduitRepository.deleteById(idDetailProduit);
    }
}
