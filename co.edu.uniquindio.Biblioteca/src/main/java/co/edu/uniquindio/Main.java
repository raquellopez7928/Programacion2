package co.edu.uniquindio;


import co.edu.uniquindio.factory.ModelFactory;
import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Miembro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudBibliotecario(modelFactory);
    }

    public static void crudBibliotecario(ModelFactory modelFactory) {

        verificarPrestamo(modelFactory);
        crearPrestamo(modelFactory);
        eliminarPrestamo(modelFactory);
        modificarPrestamo(modelFactory);
        leerPrestamo(modelFactory);
    }

    public static void crearPrestamo(ModelFactory modelFactory) {

        boolean creado= modelFactory.crearPrestamo(new Libro(), new Miembro(), LocalDate.of(2024,3,21), LocalDate.of(2024,5, 7));
        System.out.println("Intento de crear préstamo.");
    }

    public static void verificarPrestamo(ModelFactory modelFactory) {
        modelFactory.verificarPrestamo(new Libro(), new Miembro(), LocalDate.of(2024, 3, 25), LocalDate.of(2024, 5, 2));
        System.out.println("Verificación de préstamo.");
    }

    public static void eliminarPrestamo(ModelFactory modelFactory) {
        modelFactory.eliminarPrestamo(new Libro(), new Miembro(), LocalDate.of(2024, 3, 25), LocalDate.of(2024, 5, 2));
        System.out.println("Intento de eliminar préstamo.");
    }

    public static void modificarPrestamo(ModelFactory modelFactory) {
        modelFactory.modificarPrestamo(new Libro(), new Miembro(), LocalDate.of(2024, 3, 25), LocalDate.of(2024, 5, 5));
        System.out.println("Intento de modificar préstamo.");
    }

    public static void leerPrestamo(ModelFactory modelFactory) {
        modelFactory.leerPrestamo(new Libro());
        System.out.println("Intento de leer préstamo.");
    }
}