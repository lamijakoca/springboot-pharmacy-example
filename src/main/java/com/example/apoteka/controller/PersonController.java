package com.example.apoteka.controller;

import com.example.apoteka.model.Message;
import com.example.apoteka.model.Person;
import com.example.apoteka.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/req")
    public String index(){
        return "Hello World!";
    }

    @PostMapping("/new/person")
    public Message newPerson(@RequestBody Person person){
        personRepository.save(person);
        return new Message("Created!");
    }
    @PutMapping("/person/{id}")
    public Message updatePerson(@RequestBody Person reqPerson, @PathVariable Integer id){
        personRepository.findById(id)
                .map(person -> {
                    person.setName(reqPerson.getName());
                    person.setSurname(reqPerson.getSurname());
                    person.setPosition(reqPerson.getPosition());
                    return personRepository.save(person);
                })
                .orElseGet(() -> {
                    reqPerson.setId(id);
                    return personRepository.save(reqPerson);
                });
        return new Message("Updated successfully!");
    }
    @DeleteMapping("/person")
    public Message deletePerson(@RequestBody Person person){
        personRepository.deleteById(person.getId());
        return new Message("Deleted!");
    }
    @GetMapping("/all")
    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
