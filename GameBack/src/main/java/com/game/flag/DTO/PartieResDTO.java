package com.game.flag.DTO;

import com.game.flag.models.Jeu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PartieResDTO {
    private Long id;

    private Jeu jeu ;

    private String statut;

    private Integer scoreObtenu;
}
