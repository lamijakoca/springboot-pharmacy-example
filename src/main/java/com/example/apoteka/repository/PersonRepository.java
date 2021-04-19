package com.example.apoteka.repository;

import com.example.apoteka.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Person", path = "Person")
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(@Param("name") String name);
    List<Person> findByPosition(@Param("position") String position);
    List<Person> findBySurname(@Param("surname") String surname);
    List<Person> findByNameOrSurname(@Param("name") String name, @Param("surname") String surname);

}
