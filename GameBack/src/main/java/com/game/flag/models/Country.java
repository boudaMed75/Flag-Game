package com.game.flag.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Country {
    @Id
    private int id;
    private String alpha_2;
    private String alpha_3;
    private String ar;
    private String bg;
    private String cs;
    private String da;
    private String de;
    private String el;
    private String en;
    private String eo;
    private String es;
    private String et;
    private String eu;
    private String fa;
    private String fi;
    private String fr;
    private String hr;
    private String hu;
    private String hy;
    private String it;
    private String ja;
    private String ko;
    private String lt;
    private String nl;
    private String no;
    private String pl;
    private String pt;
    private String ro;
    private String ru;
    private String sk;
    private String sl;
    private String sr;
    private String sv;
    private String th;
    private String uk;
    private String zh;
    private String zh_tw;
}
