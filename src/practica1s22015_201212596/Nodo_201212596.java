/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212596;

import javax.swing.Icon;

/**
 *
 * @author danielvega
 */
public class Nodo_201212596 {

    String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public Icon getImagen() {
        return imagen;
    }
    Icon imagen;
    Nodo_201212596 sig;

    void Nodo_201212596() {
        nombre = "";
        imagen = null;
    }

    public Nodo_201212596 insertar() {
        return sig;
    }
}
