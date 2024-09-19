package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Miembro;
import co.edu.uniquindio.model.Prestamo;

import java.util.ArrayList;

public class MiembroBuilder {

    protected String nombre;
    protected String idMiembro;
    protected ArrayList<Prestamo> prestamos;

    public Miembro build(){
        return new Miembro(nombre, idMiembro, prestamos);
    }

    public MiembroBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public MiembroBuilder idMiembro(String idMiembro){
        this.idMiembro = idMiembro;
        return this;
    }

    public MiembroBuilder prestamos(ArrayList<Prestamo> prestamos){
        this.prestamos = prestamos;
        return this;
    }

}
