package practicaXML.libro;

import practicaXML.autor.Autor;
import practicaXML.enumerado.Editorial;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Libro implements Serializable {
    private String titulo;
    private Set<Autor> autor;
    private Editorial editorial;
    private String isbn;
    private int anyoPublicacion;
    private double precio;

    public Libro(String titulo, Set<Autor> autor, Editorial editorial, String isbn, int anyoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.anyoPublicacion = anyoPublicacion;
        this.precio = precio;
    }
    public Libro() {
        this.autor = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Autor> getAutor() {
        return autor;
    }

    public void setAutor(Set<Autor> autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "-----------------------------\n" +
                "LIBRO: " + titulo + "\n" +
                "AUTOR: " + autor + "\n" +
                "EDITORIAL: " + editorial.getNombre() + "\n" +
                "ISBN: " + isbn + "\n" +
                "AÑO PUBLICACION: " + anyoPublicacion + "\n" +
                "PRECIO: " + precio +"€";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
