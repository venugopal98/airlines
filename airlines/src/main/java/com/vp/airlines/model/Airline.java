package com.vp.airlines.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "airline")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String code;
    private String country;

    public Airline(String name, String code, String country) {
        this.name = name;
        this.code = code;
        this.country = country;
    }
}
