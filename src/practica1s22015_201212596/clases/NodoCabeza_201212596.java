/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_201212596.clases;

/**
 *
 * @author danielvega
 */
public class NodoCabeza_201212596 {
    private Nodofila_201212596 arriba;
    private Nodocolumna_201212596 derecha;
    

    public NodoCabeza_201212596() {
    this.arriba = null;
    this.derecha = null;
    
    
    }

    /**
     * @return the arriba
     */
    public Nodofila_201212596 getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(Nodofila_201212596 arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the derecha
     */
    public Nodocolumna_201212596 getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(Nodocolumna_201212596 derecha) {
        this.derecha = derecha;
    }

   
   
}
