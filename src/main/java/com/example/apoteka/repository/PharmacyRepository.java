package com.example.apoteka.repository;

import com.example.apoteka.model.Medicine;
import com.example.apoteka.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
    List<Pharmacy> findByMedicine (@Param("medicine") List<Medicine> medicine);
}
