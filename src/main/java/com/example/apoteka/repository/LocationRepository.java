package com.example.apoteka.repository;

import com.example.apoteka.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Location", path = "Location")
public interface LocationRepository extends JpaRepository<Location, String> {
    List<Location> findByAddress(@Param("address") String address);
    List<Location> findByCity(@Param("city") String city);
    List<Location> findByCountry(@Param("country") String country);
    List<Location> findByCityOrCountry(@Param("city") String city, @Param("country") String country);
}
