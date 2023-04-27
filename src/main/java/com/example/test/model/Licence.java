package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Clob;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Licence {
    @EmbeddedId
    private LicKey key;
@ManyToMany
@JsonIgnore
List<Logiciel> logiciels;
@ManyToMany
List<Composant > composants;


}
