package com.example.apoteka.repository;

import com.example.apoteka.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
    List<Medicine> findMedicineById(@Param("id") Integer id);
}
