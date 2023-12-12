package com.zygadlo.cash_register_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "interventions")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateOfIntervention;

    private Device device;

    private Serviceman serviceman;
}
