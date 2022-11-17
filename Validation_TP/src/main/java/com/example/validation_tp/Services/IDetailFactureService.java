package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Entities.DetailFacture;

import java.util.List;

public interface IDetailFactureService {

    public List<DetailFacture> getAllDetailFactures();

    public DetailFacture addDetailFacture(DetailFacture d);

    public DetailFacture updateDetailFacture (DetailFacture d);

    public DetailFacture getDetailFactureById (long idDetailFacture);

    public void removeDetailFactureById (long idDetailFacture);
}
