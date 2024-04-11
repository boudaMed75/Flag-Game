package com.game.flag.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "parties")
public class Partie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Joueur joueur;

    @ManyToOne
    private Jeu jeu;

    private String statut;

    private Integer scoreObtenu;

    // Autres informations de la partie

    // private Date dateDebut;

    // private Date dateFin;

    // Constructeurs, getters et setters

}
