package com.vp.airlines.repository;


import com.vp.airlines.model.Flight;
import com.vp.airlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository {
    Flight findByFlightNumber(String flightNumber);
}
