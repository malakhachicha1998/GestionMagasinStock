package com.example.validation_tp.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DetailFacture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture ;

    private Integer qte;
    private float prixTotal;
    private Integer pourcentageRemise;
    private Integer montantRemise;

    @ManyToOne
    private Produit produit;

    @ManyToOne
    private Facture facture;
 }

