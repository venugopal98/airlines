package com.vp.airlines.model;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String flightNumber;
    private String source;
    private String destination;
    private Date departureTime;
    private Date arrivalTime;
    private String airlineId;

    public Flight(String flightNumber, String source, String destination, Date departureTime, Date arrivalTime, String airlineId) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airlineId = airlineId;
    }
}
