package co.edu.uniquindio.model;

import java.time.LocalDate;

public class Prestamo {
    private String codigo;
    private Libro libroPrestamo;
    private Miembro miembroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(String codigo, Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.codigo = codigo;
        this.libroPrestamo = libroPrestamo;
        this.miembroPrestamo = miembroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Libro getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(Libro libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    public Miembro getMiembroPrestamo() {
        return miembroPrestamo;
    }

    public void setMiembroPrestamo(Miembro miembroPrestamo) {
        this.miembroPrestamo = miembroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
