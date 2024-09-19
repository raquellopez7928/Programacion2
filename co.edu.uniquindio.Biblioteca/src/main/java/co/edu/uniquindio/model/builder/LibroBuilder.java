package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Libro;

public class LibroBuilder {

    protected String titulo;
    protected String autor;
    protected String isbn;

    public Libro build(){
        return new Libro(titulo, autor, isbn);
    }

    public LibroBuilder titulo(String titulo){
        this.titulo = titulo;
        return this;
    }

    public LibroBuilder autor(String autor){
        this.autor = autor;
        return this;
    }

    public LibroBuilder isbn(String isbn){
        this.isbn = isbn;
        return this;
    }
}

