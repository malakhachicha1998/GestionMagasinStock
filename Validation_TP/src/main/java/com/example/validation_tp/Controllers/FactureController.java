package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.Facture;
import com.example.validation_tp.Services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")

public class FactureController {

    @Autowired
    IFactureService iFactureService;

    @GetMapping
    public List<Facture> getAllFactures() {
        return iFactureService.getAllFactures();
    }

    @PostMapping
    public Facture addFacture(@RequestBody Facture f) {
        return iFactureService.addFacture(f);
    }

    @PutMapping
    public Facture updateFacture(@RequestBody Facture f) {
        return iFactureService.updateFacture(f);
    }

    @GetMapping("/{idFacture}")
    public Facture getFactureById(@PathVariable long idFacture) {
        return iFactureService.getFactureById(idFacture);
    }

    @DeleteMapping("/{idFacture}")
    public void removeFactureById(@PathVariable long idFacture) {
        iFactureService.removeFactureById(idFacture);
    }
}
