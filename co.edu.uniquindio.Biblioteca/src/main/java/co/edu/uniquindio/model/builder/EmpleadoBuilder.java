package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Empleado;

public abstract class EmpleadoBuilder<T extends EmpleadoBuilder<T>> {
    protected String nombre;
    protected String idEmpleado;

    public abstract Empleado build();

    public T nombre(String nombre) {
        this.nombre = nombre;
        return (T) this;
    }

    public T idEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }
}