/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212596.clases;

import javax.swing.JLabel;

/**
 *
 * @author danielvega
 */
public class Nodoobjetos_201212596 extends JLabel implements Runnable{
 String nombre;
 String imagen;
Nodoobjetos_201212596 siguiente;
int correlativo;

 public Nodoobjetos_201212596()
    {
        
        imagen="";
        nombre="";
        siguiente=null;
        correlativo=0;
        
    }

 
 public Nodoobjetos_201212596(String imagen, String nombre, int correlativo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.siguiente = null;
        this.correlativo = 0;
        
    }
 

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the siguiente
     */
    public Nodoobjetos_201212596 getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodoobjetos_201212596 siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the diseño
     */
    public int getCorrelativo() {
        return correlativo;
    }

    /**
     * @param correlativo the diseño to set
     */
    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    
   
    
}
