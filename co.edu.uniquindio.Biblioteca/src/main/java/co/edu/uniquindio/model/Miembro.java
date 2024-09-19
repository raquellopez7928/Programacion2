package co.edu.uniquindio.model;

import java.util.ArrayList;

public class Miembro {
    private String nombre;
    private String idMiembro;
    private ArrayList<Prestamo> prestamos;

    public Miembro(String nombre, String idMiembro, ArrayList<Prestamo> prestamos) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
        this.prestamos = prestamos;
    }
    public Miembro(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
