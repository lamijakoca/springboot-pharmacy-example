package com.example.apoteka.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private String jwttoken;

    public JwtResponse() {
    }

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return jwttoken;
    }
}
