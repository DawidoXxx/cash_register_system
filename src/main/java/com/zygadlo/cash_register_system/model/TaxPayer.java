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
@Table(name = "tax_payers")
public class TaxPayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String companyName;
    private String comments;

    @Embedded
    private Address address;

    private TaxOffice taxOffice;

    private List<InstallationPlace> installationPlaces;

    public TaxPayer(String name, String companyName, String comments, Address address) {
        this.name = name;
        this.companyName = companyName;
        this.comments = comments;
        this.address = address;
    }

}
