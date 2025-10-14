package com.vp.airlines.service;

import com.vp.airlines.model.Flight;
import com.vp.airlines.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public boolean addFlight(Flight flight) {
        return flightRepository.addFlight(flight);
    }

    public List<Flight> getFlights() {
        return flightRepository.getFlights();
    }
}
