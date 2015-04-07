/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroLibro {

    private ArrayList<Libro> listaLibros;

    public RegistroLibro() {
        listaLibros = new ArrayList<Libro>();
    }
/*
    public String addBook(Libro libro) {
        if (libro != null) {
            if (verificacionID(libro.getiD())) {
                listaLibros.add(libro);
                return "El libro se registro corectamente";
            }
        } else {
            return "el objeto es null";
        }

        return "";
    }

    public boolean verificacionID(String id) {
        if (!id.equalsIgnoreCase("")) {
            if (listaLibros.size() != 0) {
                for (Libro libroE : listaLibros) {
                    if (listaLibros.get(i).getiD().equalsIgnoreCase(id)) {
                        return false;
                    }
                }
            }
        }
        return 


,
    }
    */
}
