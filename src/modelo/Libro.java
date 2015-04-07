/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Libro {

    private String titulo;
    private String autor;
    private String iD;
    private String edicion;
    private String editorial;
    private String categoria;

    public Libro(String titulo, String autor, String iD, String edicion, String editorial, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.iD = iD;
        this.edicion = edicion;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.iD = "";
        this.edicion = "";
        this.editorial = "";
        this.categoria = "";
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

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", iD=" + iD + ", edicion=" + edicion + ", editorial=" + editorial + ", categoria=" + categoria + '}';
    }
    
}
