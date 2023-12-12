package com.zygadlo.cash_register_system.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "servicemen")
public class Serviceman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String cardInfo;

    private List<Intervention> interventionList;
}
