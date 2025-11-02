package com.vp.airlines.model;

import java.awt.print.Book;
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

    public Booking(String seatNumber, Date bookingDate, String passengerId, String flightId) {
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
        this.passengerId = passengerId;
        this.flightId = flightId;
    }
}
