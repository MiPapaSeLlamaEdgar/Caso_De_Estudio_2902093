package com.eric.citas.java.entities;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;
    
    public Medico(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, Especialidad e, Long r) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.especialidad = e;
        this.registroMedico = r;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    
}
