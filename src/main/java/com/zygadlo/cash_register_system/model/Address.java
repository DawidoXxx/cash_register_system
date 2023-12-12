package com.zygadlo.cash_register_system.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {

    private String country;
    private String voivodeship;
    private String district;
    private String street;
    private String houseNr;
    private String apartmentNr;
    private String city;
    private String zipCode;
    private String PostOffice;
    private String PostBox;
    private String phoneNumber;
    private String email;
    private String messages;
}
