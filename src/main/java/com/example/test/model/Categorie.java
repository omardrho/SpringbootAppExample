package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor  @AllArgsConstructor
public class Categorie {
    @Id
    private String nom;

    @ManyToMany
    @JsonIgnore
    List<Logiciel> logiciels_secondaires;
    @OneToMany(mappedBy = "categorie")
    @JsonIgnore
    List<Logiciel> logiciels_primaires;
}
