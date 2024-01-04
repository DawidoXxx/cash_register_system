package com.zygadlo.cash_register_system.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "servicemen")
public class Serviceman {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String cardInfo;

    @OneToMany(mappedBy = "currentServiceman")
    private List<Device> device;

    @OneToMany(mappedBy = "serviceman")
    private List<Intervention> interventionList;
}
