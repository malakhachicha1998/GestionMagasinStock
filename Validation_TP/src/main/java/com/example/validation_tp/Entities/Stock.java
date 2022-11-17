package com.example.validation_tp.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock ;

    private Integer qteStock;
    private Integer qteMin;
    private String libelleStock;

    @OneToMany(mappedBy = "stock")
    private List<Produit> produits;
}
