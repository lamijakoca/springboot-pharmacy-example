package com.example.apoteka.controller;

import com.example.apoteka.model.Location;
import com.example.apoteka.model.Message;
import com.example.apoteka.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    LocationRepository locationRepository;

    @Autowired
    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
    @GetMapping(path = "/locations")
    public List<Location> getAll() {
        return locationRepository.findAll();
    }
    @PostMapping(path = "new/location")
    public Message newLocation(@RequestBody Location location){
        locationRepository.save(location);
        return new Message("Location created!");
    }
}
