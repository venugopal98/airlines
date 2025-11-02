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

}
