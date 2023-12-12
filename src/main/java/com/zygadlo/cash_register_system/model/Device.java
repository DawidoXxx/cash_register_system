package com.zygadlo.cash_register_system.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String manufacturer;
    private String model;
    private String type;
    private String applicationVersion;
    private String fabrycznyNr;
    private String uniqueNr;
    private String ewidencyjnyNr;
    private String fiscalizationDate;
    private String methodOfUse;
    private String comments;

    private List<Intervention> interventions;

    private Serviceman currentServiceman;


    private InstallationPlace installationPlace;
}
