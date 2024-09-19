package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.ICrudBibliotecario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ModelFactory implements ICrudBibliotecario {
    private static ModelFactory instance;
    private static Biblioteca biblioteca;

    private ModelFactory(){
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    public boolean verificarPrestamo(Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        return biblioteca.verificarPrestamo(libroPrestamo, miembroPrestamo, fechaPrestamo, fechaDevolucion);
    }

    @Override
    public boolean crearPrestamo(Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        return biblioteca.crearPrestamo(libroPrestamo, miembroPrestamo, fechaPrestamo, fechaDevolucion);
    }

    @Override
    public boolean eliminarPrestamo(Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        return biblioteca.eliminarPrestamo(libroPrestamo, miembroPrestamo, fechaPrestamo, fechaDevolucion);
    }

    @Override
    public boolean modificarPrestamo(Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        return biblioteca.modificarPrestamo(libroPrestamo, miembroPrestamo, fechaPrestamo, fechaDevolucion);
    }

    @Override
    public boolean leerPrestamo(Libro libroPrestamo) {
        return biblioteca.leerPrestamo(libroPrestamo);
    }

    private void inicializarDatos() {

        Libro libro1 = new Libro("El hombre en busca de sentido", "Viktor Frankl", "13729");
        Libro libro2 = new Libro("Lo que nunca te dije", "Antonio Ortiz", "27278");
        Libro libro3 = new Libro("Satanás", "Mario Mendoza", "39282");

        Bibliotecario bibliotecario1 = new Bibliotecario("Vanesa", "82929");
        Bibliotecario bibliotecario2 = new Bibliotecario("Juan jose", "92002");

        Miembro miembro1 = new Miembro("Raquel", "29929", new ArrayList<>());
        Miembro miembro2 = new Miembro("Sofia", "93020", new ArrayList<>());

        Prestamo prestamo1 = new Prestamo("8172383", libro1, miembro1, LocalDate.of(2024, 2, 28), LocalDate.of(2024, 3, 7));
        Prestamo prestamo2 = new Prestamo("1623545",libro2, miembro2, LocalDate.of(2024, 8, 19), LocalDate.of(2024, 8, 30));

        biblioteca = new Biblioteca("Biblioteca Comfenalco");
        biblioteca.setListLibros(Arrays.asList(libro1, libro2, libro3));
        biblioteca.setListEmpleados(Arrays.asList(bibliotecario1, bibliotecario2));
        biblioteca.setListMiembros(Arrays.asList(miembro1, miembro2));
        biblioteca.setListPrestamos(Arrays.asList(prestamo1, prestamo2));

    }
}
