package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Bibliotecario;
import co.edu.uniquindio.model.Empleado;

public class BibliotecarioBuilder extends EmpleadoBuilder<BibliotecarioBuilder> {

    public BibliotecarioBuilder() {
        super();
    }

    @Override
    public Bibliotecario build(){
        return new Bibliotecario(nombre, idEmpleado);
    }

    @Override
    public BibliotecarioBuilder self(){
        return this;
    }
}
