package com.vp.airlines.service;

import com.vp.airlines.model.Flight;
import com.vp.airlines.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public Flight addFlight(Flight flight) {
        return (Flight) flightRepository.save(flight);
    }

    public List getFlights() {
        return flightRepository.findAll();
    }

    public Optional getFlight(int id){
        return flightRepository.findById(id);
    }

    public List getUsers(){
        return flightRepository.findAll();
    }

}
