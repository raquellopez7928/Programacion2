package co.edu.uniquindio.model;

import co.edu.uniquindio.services.IGestionInventario;

public class Bibliotecario extends Empleado implements IGestionInventario {

    public Bibliotecario(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

@Override
    public void gestionarItem(){}
}
