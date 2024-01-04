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
@Table(name = "installation_places")
public class InstallationPlace {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;
    private String nip;
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taxPayer_id")
    @JsonIgnore
    private TaxPayer taxPayer;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "installationPlace",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Device> devices;
}
