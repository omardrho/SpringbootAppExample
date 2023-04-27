package com.example.test.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;

import java.io.Serializable;
@Embeddable
public class LicKey implements Serializable {
    private String nom;
    private Version version;
    private String langue;
}
