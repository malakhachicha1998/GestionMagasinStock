package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Entities.DetailFacture;
import com.example.validation_tp.Services.IClientService;
import com.example.validation_tp.Services.IDetailFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detailFacture")

public class DetailFactureController {

    @Autowired
    IDetailFactureService iDetailFactureService;

    @GetMapping
    public List<DetailFacture> getAllDetailFactures() {
        return iDetailFactureService.getAllDetailFactures();
    }

    @PostMapping
    public DetailFacture addDetailFacture(@RequestBody DetailFacture d) {
        return iDetailFactureService.addDetailFacture(d);
    }

    @PutMapping
    public DetailFacture updateDetailFacture(@RequestBody DetailFacture d) {
        return iDetailFactureService.updateDetailFacture(d);
    }

    @GetMapping("/{idDetailFacture}")
    public DetailFacture getDetailFactureById(@PathVariable long idDetailFacture) {
        return iDetailFactureService.getDetailFactureById(idDetailFacture);
    }

    @DeleteMapping("/{idDetailFacture}")
    public void removeDetailFactureById(@PathVariable long idDetailFacture) {
        iDetailFactureService.removeDetailFactureById(idDetailFacture);
    }
}

