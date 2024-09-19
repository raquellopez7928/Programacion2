package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Miembro;
import co.edu.uniquindio.model.Prestamo;

import java.time.LocalDate;

public interface ICrudBibliotecario {

    public Prestamo verificarPrestamo(String codigo);
    public boolean crearPrestamo(String codigo, Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion);
    public boolean eliminarPrestamo(String codigo);
    public boolean modificarPrestamo(String codigo, Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion);
    public boolean leerPrestamo(String codigo);

}
