package com.example.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data@AllArgsConstructor @NoArgsConstructor
public class Composant {
    @EmbeddedId
    private LogiKey key;
@ManyToOne
    private Logiciel logiciel;
@ManyToMany
    private List<Licence> licences;

}
