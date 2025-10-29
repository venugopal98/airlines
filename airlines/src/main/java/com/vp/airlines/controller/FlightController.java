package com.vp.airlines.controller;

import com.vp.airlines.model.Flight;
import com.vp.airlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("flights")
    private List getFlights() {
        try {
            return flightService.getFlights();
        } catch (Exception e) {
            System.out.println("ERROR: Cannot get flight details\nDetails:  " + e.getMessage());
            return null;
        }
    }

    @GetMapping("flights/{id}")
    private Optional getFlights(@PathVariable("id") int flightId) {
        return flightService.getFlight(flightId);
    }

    @PostMapping("flights")
    private Flight addFlights(@RequestBody Flight flight) {
        return this.flightService.addFlight(flight);
    }
}
