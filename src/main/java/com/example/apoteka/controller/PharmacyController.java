package com.example.apoteka.controller;

import com.example.apoteka.model.Message;
import com.example.apoteka.model.Pharmacy;
import com.example.apoteka.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PharmacyController {
    PharmacyRepository pharmacyRepository;

    @Autowired

    public PharmacyController(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @GetMapping(path = "/pharmacy")
    public List<Pharmacy> getAll(){
        return pharmacyRepository.findAll();
    }

    @PostMapping(path = "/pharmacy")
    public Message newPharmacy(@RequestBody Pharmacy pharmacy){
        pharmacyRepository.save(pharmacy);
        return new Message("Pharmacy created!");
    }
}
