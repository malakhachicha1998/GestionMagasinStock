package com.example.validation_tp.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit ;

    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToMany
    private List<Fournisseur> fournisseurs;

    @ManyToOne
    private Rayon rayon;

    @ManyToOne
    private Stock stock;

    @OneToOne
    private DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
}
