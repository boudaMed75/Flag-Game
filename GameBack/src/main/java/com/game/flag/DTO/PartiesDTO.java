package com.game.flag.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartiesDTO {

    private Long id;

    private Long id_jeu ;

    private Long id_joueur ;

    private String statut;

    private Integer scoreObtenu;
}
