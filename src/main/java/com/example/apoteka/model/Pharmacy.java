package com.example.apoteka.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pharmacy {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Person owner, workers;

    @OneToMany
    private List<Medicine> medicine;

    @OneToOne
    private Person person;


    public Pharmacy() {
    }

    public Pharmacy(Long id, Person owner, Person workers, List<Medicine> medicine) {
        this.id = id;
        this.owner = owner;
        this.workers = workers;
        this.medicine = medicine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getWorkers() {
        return workers;
    }

    public void setWorkers(Person workers) {
        this.workers = workers;
    }

    public List<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(List<Medicine> medicine) {
        this.medicine = medicine;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
