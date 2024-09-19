package co.edu.uniquindio.model;

import co.edu.uniquindio.services.ICrudBibliotecario;
import co.edu.uniquindio.services.IPrototypeLibro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements ICrudBibliotecario {

    private String nombre;
    private List<Empleado> listEmpleados = new ArrayList<Empleado>();
    private List<Libro> listLibros = new ArrayList<Libro>();
    private List<Miembro> listMiembros = new ArrayList();
    private List<Prestamo> listPrestamos = new ArrayList();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Prestamo verificarPrestamo(String codigo) {
        Prestamo prestamoExistente = null;
        for (Prestamo prestamo : listPrestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                prestamoExistente = prestamo;
                break;
            }
        }
        return prestamoExistente;
    }

    @Override
    public boolean crearPrestamo(String codigo, Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        Prestamo prestamo = verificarPrestamo(codigo);
    }

    @Override
    public boolean eliminarPrestamo(Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        Prestamo prestamoAEliminar = null;
        for (Prestamo prestamo : listPrestamos) {
            if (prestamo.getLibroPrestamo().equals(libroPrestamo) &&
                    prestamo.getMiembroPrestamo().equals(miembroPrestamo) &&
                    prestamo.getFechaPrestamo().equals(fechaPrestamo) &&
                    prestamo.getFechaDevolucion().equals(fechaDevolucion)) {
                prestamoAEliminar = prestamo;
                break;
            }
        }
        if (prestamoAEliminar != null) {
            listPrestamos.remove(prestamoAEliminar);
            miembroPrestamo.getPrestamos().remove(prestamoAEliminar); // Eliminar de la lista de préstamos del miembro
            return true;
        }
        return false;
    }

    /**
     * 
     * @param libroPrestamo
     * @param miembroPrestamo
     * @param fechaPrestamo
     * @param fechaDevolucion
     * @return
     */
    @Override
    public boolean modificarPrestamo(Libro libroPrestamo, Miembro miembroPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        for (Prestamo prestamo : listPrestamos) {
            if (prestamo.getLibroPrestamo().equals(libroPrestamo) &&
                    prestamo.getMiembroPrestamo().equals(miembroPrestamo) &&
                    prestamo.getFechaPrestamo().equals(fechaPrestamo)) {

                prestamo.setFechaDevolucion(fechaDevolucion);

                return true;
            }
        }
        return false;
    }

    @Override
    public boolean leerPrestamo(Libro libroPrestamo) {
        for (Prestamo prestamo : listPrestamos) {
            if (prestamo.getLibroPrestamo().equals(libroPrestamo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public IPrototypeLibro clone(){
        Libro libro = null;

        try {
            libro = (Libro) super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (IPrototypeLibro) libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(List<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public List<Libro> getListLibros() {
        return listLibros;
    }

    public void setListLibros(List<Libro> listLibros) {
        this.listLibros = listLibros;
    }

    public List<Miembro> getListMiembros() {
        return listMiembros;
    }

    public void setListMiembros(List<Miembro> listMiembros) {
        this.listMiembros = listMiembros;
    }

    public List<Prestamo> getListPrestamos() {
        return listPrestamos;
    }

    public void setListPrestamos(List<Prestamo> listPrestamos) {
        this.listPrestamos = listPrestamos;
    }

}
