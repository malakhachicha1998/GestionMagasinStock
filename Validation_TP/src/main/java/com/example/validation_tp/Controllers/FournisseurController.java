package com.example.validation_tp.Controllers;


import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Entities.Fournisseur;
import com.example.validation_tp.Services.IClientService;
import com.example.validation_tp.Services.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")

public class FournisseurController {

    @Autowired
    IFournisseurService iFournisseurService;

    @GetMapping
    public List<Fournisseur> getAllFournisseurs() {
        return iFournisseurService.getAllFournisseurs();
    }

    @PostMapping
    public Fournisseur addFournisseur(@RequestBody Fournisseur f) {
        return iFournisseurService.addFournisseur(f);
    }

    @PutMapping
    public Fournisseur updateFournisseur(@RequestBody Fournisseur f) {
        return iFournisseurService.updateFournisseur(f);
    }

    @GetMapping("/{idFournisseur}")
    public Fournisseur getFournisseurById(@PathVariable long idFournisseur) {
        return iFournisseurService.getFournisseurById(idFournisseur);
    }

    @DeleteMapping("/{idFournisseur}")
    public void removeClientById(@PathVariable long idFournisseur) {
        iFournisseurService.removeFournisseurById(idFournisseur);
    }
}

