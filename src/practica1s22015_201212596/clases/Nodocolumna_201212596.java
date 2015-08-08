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
public class Nodocolumna_201212596 {
    Nodocolumna_201212596 columna;
    Nodocolumna_201212596 izquierda;
    Nodocolumna_201212596 derecha;
    private int Posx;
    private int Posy;
    
    
    public Nodocolumna_201212596() {
        this.columna = null;
        this.izquierda = null;
        this.derecha = null;
        
    
    
    }
    
    
    

    /**
     * @return the columna
     */
    public Nodocolumna_201212596 getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(Nodocolumna_201212596 columna) {
        this.columna = columna;
    }

    /**
     * @return the izquierda
     */
    public Nodocolumna_201212596 getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Nodocolumna_201212596 izquierda) {
        this.izquierda = izquierda;
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

    /**
     * @return the Posx
     */
    public int getPosx() {
        return Posx;
    }

    /**
     * @param Posx the Posx to set
     */
    public void setPosx(int Posx) {
        this.Posx = Posx;
    }

    /**
     * @return the Posy
     */
    public int getPosy() {
        return Posy;
    }

    /**
     * @param Posy the Posy to set
     */
    public void setPosy(int Posy) {
        this.Posy = Posy;
    }

   
    
}
