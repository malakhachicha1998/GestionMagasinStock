package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.DetailFacture;
import com.example.validation_tp.Entities.DetailProduit;
import com.example.validation_tp.Services.IDetailFactureService;
import com.example.validation_tp.Services.IDetailProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detailProduit")

public class DetailProduitController {

    @Autowired
    IDetailProduitService iDetailProduitService;

    @GetMapping
    public List<DetailProduit> getAllDetailProduits() {
        return iDetailProduitService.getAllDetailProduits();
    }

    @PostMapping
    public DetailProduit addDetailProduit(@RequestBody DetailProduit d) {
        return iDetailProduitService.addDetailProduit(d);
    }

    @PutMapping
    public DetailProduit updateDetailProduit(@RequestBody DetailProduit d) {
        return iDetailProduitService.updateDetailProduit(d);
    }

    @GetMapping("/{idDetailProduit}")
    public DetailProduit getDetailProduitById(@PathVariable long idDetailProduit) {
        return iDetailProduitService.getDetailProduitById(idDetailProduit);
    }

    @DeleteMapping("/{idDetailProduit}")
    public void removeDetailProduitById(@PathVariable long idDetailProduit) {
        iDetailProduitService.removeDetailProduitById(idDetailProduit);
    }
}

