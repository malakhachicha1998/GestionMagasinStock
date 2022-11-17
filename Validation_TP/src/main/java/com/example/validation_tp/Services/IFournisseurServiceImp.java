package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Fournisseur;
import com.example.validation_tp.Repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IFournisseurServiceImp implements IFournisseurService{

    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur getFournisseurById(long idFournisseur) {
        return fournisseurRepository.findById(idFournisseur).orElse(null);
    }

    @Override
    public void removeFournisseurById(long idFournisseur) {
        fournisseurRepository.deleteById(idFournisseur);

    }
}
