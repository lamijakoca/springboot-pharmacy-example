package com.example.apoteka.model;

import javax.persistence.*;

@Entity
public class Medicine {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    private String dose;

    @OneToOne
    private Medicine replacement;

    @ManyToOne
    private Pharmacy pharmacy;

    public Medicine() {
    }

    public Medicine(Integer id, String name, String dose, Medicine replacement, Pharmacy pharmacy) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.replacement = replacement;
        this.pharmacy = pharmacy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Medicine getReplacement() {
        return replacement;
    }

    public void setReplacement(Medicine replacement) {
        this.replacement = replacement;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
}
