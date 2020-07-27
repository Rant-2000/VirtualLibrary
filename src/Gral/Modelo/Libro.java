/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gral.Modelo;

/**
 *
 * @author Rant AA
 */
public class Libro {
    private String titulo, autor, anho, editorial,isbn;
private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Libro(String titulo, String autor, String anho, String editorial, String isbn, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.anho = anho;
        this.editorial = editorial;
        this.isbn=isbn;
        this.id=id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return titulo + "%" + autor + "%" + anho + "%" + editorial + '%'+isbn;
    }
    
}
