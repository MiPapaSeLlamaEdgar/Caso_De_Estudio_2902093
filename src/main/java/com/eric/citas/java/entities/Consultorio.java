package com.eric.citas.java.entities;

import java.math.BigInteger;

public class Consultorio {
    private BigInteger id;

    public Consultorio(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
    
}
