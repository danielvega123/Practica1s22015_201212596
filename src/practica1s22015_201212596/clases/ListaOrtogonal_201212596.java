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
public class ListaOrtogonal_201212596 {
    private NodoOrtogonal_201212596 arriba = new NodoOrtogonal_201212596();
    private NodoOrtogonal_201212596 abajo = new NodoOrtogonal_201212596();
    private NodoOrtogonal_201212596 izquierda = new NodoOrtogonal_201212596();
    private NodoOrtogonal_201212596 derecha = new NodoOrtogonal_201212596();

    public ListaOrtogonal_201212596() {
        this.arriba = null;
        this.abajo = null;
        this.izquierda = null;
        this.derecha = null;
        
    }

    /**
     * @return the arriba
     */
    public NodoOrtogonal_201212596 getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoOrtogonal_201212596 arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public NodoOrtogonal_201212596 getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoOrtogonal_201212596 abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the izquierda
     */
    public NodoOrtogonal_201212596 getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoOrtogonal_201212596 izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public NodoOrtogonal_201212596 getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoOrtogonal_201212596 derecha) {
        this.derecha = derecha;
    }
    
    public void Vacia(){
        ListaOrtogonal_201212596 lo = new ListaOrtogonal_201212596();
        if(lo.getDerecha() == null){
            System.out.println("lista vacia");
        }else
            System.out.println("esta llena");
        }
    }
            




