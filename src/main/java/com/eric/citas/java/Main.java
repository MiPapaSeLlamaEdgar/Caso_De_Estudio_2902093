package com.eric.citas.java;

import com.eric.citas.java.entities.Especialidad;
import com.eric.citas.java.entities.Medico;
import com.eric.citas.java.entities.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {
        //crear o instanciar un Medico
        Medico medico1 = new Medico(1,"Javier","Abril Diaz",TipoIdentificacion.TI,171236271L,Especialidad.FISIOTERAPIA,234234L);
    }
}