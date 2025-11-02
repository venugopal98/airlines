package com.vp.airlines.model;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String seatNumber;
    private Date bookingDate;
    private String passengerId;
    private String flightId;
}
