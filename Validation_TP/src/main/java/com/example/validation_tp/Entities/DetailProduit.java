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

public class DetailProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailProduit ;

    private Date dateCreation;
    private Date dateDerniereModification;

    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;

    @OneToOne
    private Produit produit;
}

