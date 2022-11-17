package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.DetailFacture;
import com.example.validation_tp.Repositories.DetailFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IDetailFactureServiceImp implements IDetailFactureService{

    @Autowired
    DetailFactureRepository detailFactureRepository;

    @Override
    public List<DetailFacture> getAllDetailFactures() {
        return detailFactureRepository.findAll();
    }

    @Override
    public DetailFacture addDetailFacture(DetailFacture d) {
        return detailFactureRepository.save(d);
    }

    @Override
    public DetailFacture updateDetailFacture(DetailFacture d) {
        return detailFactureRepository.save(d);
    }

    @Override
    public DetailFacture getDetailFactureById(long idDetailFacture) {
        return detailFactureRepository.findById(idDetailFacture).orElse(null);
    }

    @Override
    public void removeDetailFactureById(long idDetailFacture) {
        detailFactureRepository.deleteById(idDetailFacture);

    }
}
