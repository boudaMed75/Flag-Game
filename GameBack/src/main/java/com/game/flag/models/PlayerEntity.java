package com.game.flag.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class PlayerEntity {
    @Id
    private String id;

    private Date dateCreation;

    private String type;

    private Integer sore ;

}
