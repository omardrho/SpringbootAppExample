package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Librairie extends Logiciel{
    @ManyToMany

    List<Librairie> librairies;


}
