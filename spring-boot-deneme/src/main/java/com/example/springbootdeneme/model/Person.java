package com.example.springbootdeneme.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.time.LocalDate;

public class Person {
    private LocalDate birthDate;

        
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
