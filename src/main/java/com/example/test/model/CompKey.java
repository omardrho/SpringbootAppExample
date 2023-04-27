package com.example.test.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;

import java.io.Serializable;
@Embeddable
public class CompKey implements Serializable {

    private int code;
    private Version version;
}
