package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Produit;
import com.example.validation_tp.Entities.Rayon;

import java.util.List;

public interface IRayonService {

    public List<Rayon> getAllRayons();

    public Rayon addRayon(Rayon r);

    public Rayon updateRayon (Rayon r);

    public Rayon getRayonById (long idRayon);

    public void removeRayonById (long idRayon);
}
