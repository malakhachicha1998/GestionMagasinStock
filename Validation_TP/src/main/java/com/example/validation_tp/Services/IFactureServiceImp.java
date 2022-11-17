package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Facture;
import com.example.validation_tp.Repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IFactureServiceImp implements IFactureService{

    @Autowired
    FactureRepository factureRepository;

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture addFacture(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public Facture updateFacture(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public Facture getFactureById(long idFacture) {
        return factureRepository.findById(idFacture).orElse(null);
    }

    @Override
    public void removeFactureById(long idFacture) {
        factureRepository.deleteById(idFacture);

    }
}
