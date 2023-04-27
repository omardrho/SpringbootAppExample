package com.example.test.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Embeddable
public class LogiKey implements Serializable {

    private String nom;
    private Version version;


}
