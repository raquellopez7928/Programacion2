package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Miembro;
import co.edu.uniquindio.model.Prestamo;

import java.time.LocalDate;

public class PrestamoBuilder {

    protected Libro libroPrestamo;
    protected Miembro miembroPrestamo;
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaDevolucion;

    public Prestamo build(){
        return new Prestamo(libroPrestamo, miembroPrestamo, fechaPrestamo, fechaDevolucion);
    }

    public PrestamoBuilder libroPrestamo(Libro libro){
        this.libroPrestamo = libro;
        return this;
    }

    public PrestamoBuilder miembroPrestamo(Miembro miembro){
        this.miembroPrestamo = miembro;
        return this;
    }

    public PrestamoBuilder fechaPrestamo(LocalDate fecha){
        this.fechaPrestamo = fecha;
        return this;
    }

    public PrestamoBuilder fechaDevolucion(LocalDate fecha){
        this.fechaDevolucion = fecha;
        return this;
    }
}
