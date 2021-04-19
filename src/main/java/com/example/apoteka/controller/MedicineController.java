package com.example.apoteka.controller;

import com.example.apoteka.model.Medicine;
import com.example.apoteka.model.Message;
import com.example.apoteka.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class MedicineController {
    MedicineRepository medicineRepository;

    @Autowired
    public MedicineController(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @GetMapping("/medicines")
    public List<Medicine> getAll(){
        return medicineRepository.findAll();
    }

    @PostMapping("/new/medicine")
    public Message newMedicine(@RequestBody Medicine medicine){
        medicineRepository.save(medicine);
        return new Message("Created!");
    }
}
