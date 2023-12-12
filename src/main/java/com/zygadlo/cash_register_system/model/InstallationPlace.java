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
@Table(name = "installation_places")
public class InstallationPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;
    private String nip;
    private String comments;

    private TaxPayer taxPayer;

    @Embedded
    private Address address;

    private List<Device> devices;
}
