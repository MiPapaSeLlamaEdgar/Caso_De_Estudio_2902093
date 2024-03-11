package com.eric.citas.java.entities;

import java.time.LocalDateTime;

public class Paciente extends Usuario {
    private String correoElectronico;
    private Long celular;
    private LocalDateTime fechaNacimiento;
    private double altura;
    private double peso;
    private TipoDeSangre tipoDeSangre;
    private char factorRH;
    
    public Paciente(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String correoElectronico, Long celular, LocalDateTime fechaNacimiento,
            double altura, double peso, TipoDeSangre tipoDeSangre, char factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoDeSangre = tipoDeSangre;
        this.factorRH = factorRH;
    }
    

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public TipoDeSangre getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(TipoDeSangre tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    
}
