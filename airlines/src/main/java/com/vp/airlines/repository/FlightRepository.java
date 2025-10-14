package com.vp.airlines.repository;


import com.vp.airlines.model.Flight;
import com.vp.airlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FlightRepository {

    private final List<Flight> flights = new ArrayList<>();

    public boolean addFlight(Flight flight){
        return flights.add(flight);
    }
    public List<Flight> getFlights(){
        return flights;
    }

    public Flight getFlight(int id){
        return flights.get(id);
    }

}
