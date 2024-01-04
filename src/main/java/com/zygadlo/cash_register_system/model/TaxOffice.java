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
@Table(name="tax_offices")
public class TaxOffice {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String usCode;
    private String name;
    private String officeHead;

    @OneToMany(mappedBy = "taxOffice")
    private List<TaxPayer> taxPayers;
}
