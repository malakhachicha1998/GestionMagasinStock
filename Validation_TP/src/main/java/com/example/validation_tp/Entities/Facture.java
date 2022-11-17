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

public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture ;

    private float montantRemise;
    private float montantFacture;
    private Date dateFacture;
    private boolean active;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;

    @ManyToOne
    private Client client;
}
