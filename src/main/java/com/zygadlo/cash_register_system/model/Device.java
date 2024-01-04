package com.zygadlo.cash_register_system.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
//    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "device",orphanRemoval = true)
    private List<Intervention> interventions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currentServiceMan_id")
    @JsonIgnore
    private Serviceman currentServiceman;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "installationPlace_id")
    @JsonIgnore
    private InstallationPlace installationPlace;
}
