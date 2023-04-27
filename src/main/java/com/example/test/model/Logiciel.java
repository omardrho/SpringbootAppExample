package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.net.URL;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance
public class Logiciel {

        @EmbeddedId

        private LogiKey key;
        @NotNull
        private String description;
        private URL url;

        @ManyToMany(mappedBy = "logiciels_secondaires")
        List<Categorie> categories;
        @ManyToOne

        Categorie  categorie;

        @OneToMany
         private List<Composant> composants;
        @ManyToMany
          private List<Application> applications;
        @ManyToMany(mappedBy = "logiciels")
            List<Licence> licences;






}
