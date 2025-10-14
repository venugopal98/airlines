package com.vp.airlines.controller;

import com.vp.airlines.model.Flight;
import com.vp.airlines.service.FlightService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightsController {

    @Autowired
    FlightService flightService;

    @GetMapping("flights")
    private List<Flight> getFlights() {
        try {
            System.out.println(flightService.getFlights());
            return flightService.getFlights();
        } catch (Exception e) {
            System.out.println("ERROR: Cannot get flight details\nDetails:  " + e.getMessage());
            return null;
        }
    }

    @PostMapping("flights")
    private boolean addFlights() {
        return flightService.addFlight(new Flight("AirBus 123", "AL123", 45));
    }

}
