package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Application extends Logiciel{
    @ManyToMany
    @JsonIgnore
    private List<Logiciel> logiciels;
}
