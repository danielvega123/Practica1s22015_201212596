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
public class NodoOrtogonal_201212596 {
    Nodofila_201212596 abajofila;
    Nodocolumna_201212596 izquierdacolumna;
    NodoCabeza_201212596 raizcabeza;
    
    
    NodoOrtogonal_201212596 arriba;
    NodoOrtogonal_201212596 abajo;
    NodoOrtogonal_201212596 derecha;
    NodoOrtogonal_201212596 izquierda;
    NodoOrtogonal_201212596 raiz;

    public NodoOrtogonal_201212596(int x, int y) {
    this.derecha = null;
    this.izquierda = null;
    this.arriba = null;
    this.abajo = null;
    this.raiz = null;
    this.abajofila = null;
    this.izquierdacolumna = null;
    
            }
    
    public NodoOrtogonal_201212596() {
    this.derecha = null;
    this.izquierda = null;
    this.arriba = null;
    this.abajo = null;
    this.raiz = null;
    this.abajofila = null;
    this.izquierdacolumna = null;
    
            }
    
    public void InsertarNodo(int filas, int columna){
        NodoOrtogonal_201212596 aux1 = new NodoOrtogonal_201212596();
        NodoOrtogonal_201212596 aux2 = new NodoOrtogonal_201212596();
        NodoOrtogonal_201212596 aux3 = new NodoOrtogonal_201212596();
        NodoOrtogonal_201212596 aux4 = new NodoOrtogonal_201212596();
        NodoOrtogonal_201212596 nuevo = new NodoOrtogonal_201212596();
       
       // Nodocolumna_201212596 col1 = new Nodocolumna_201212596();
        ListaColumna_201212596 col = new ListaColumna_201212596();
        ListaFila_201212596 fil = new ListaFila_201212596();
        NodoCabeza_201212596 raizCa  = new NodoCabeza_201212596();
        Nodocolumna_201212596 nuevoC = new Nodocolumna_201212596();
         Nodocolumna_201212596 auxC = new Nodocolumna_201212596();
         Nodocolumna_201212596 aux1C = new Nodocolumna_201212596();
         
                 Nodofila_201212596 nuevoF = new Nodofila_201212596();
         Nodofila_201212596 auxF = new Nodofila_201212596();
        // si el siguiente de la referencia de la cabeza es nulo, insertar nuevo
       for (int i = 0; i<filas; i++){
                   for (int j = 0; j<columna; j++){
        
        NodoOrtogonal_201212596 nuevoOr = new NodoOrtogonal_201212596();
        // si el siguiente de la referencia de la cabeza es nulo, insertar nuevo
        nuevoC.setPosx(i);
        nuevoC.setPosy(j);
         if (col.getRaiz().getDerecha() == null) {
            col.getRaiz().setDerecha(nuevoC);
            nuevo.setIzquierda(izquierda);
             // nuevo.izquierda = raiz;
             System.out.println("Se agrego nuevo dato" + nuevoC.getPosx() + "," + nuevoC.getPosy());
         } else {
        
             // si el siguiente de la referencia ya existe, entonces el siguienet de ese nodo es el nuevo
             auxC = col.getRaiz().getDerecha();
             aux1C = auxC;
            //aux = col.getRaiz().getDerecha();
            auxC.setDerecha(nuevoC);
            nuevoC.setIzquierda(nuevoC.getIzquierda());
            System.out.println("se agrego un nuevo dato");
             //System.out.println("nodo anterior" + nuevoC.getIzquierda().getPosx() + "," + nuevoC.getIzquierda().getPosy() + "nodo nuevo" + nuevoC.getPosx() + "," + nuevoC.getPosy());
             System.out.println(nuevoC.getPosx() + "," +nuevoC.getPosy());
             auxC = auxC.getDerecha();
             aux1C = auxC.getDerecha();
         }
          nuevoF.setPosx(i);
nuevoF.setPosy(j);
 if (fil.getRaiz().getArriba() == null) {
            fil.getRaiz().setArriba(nuevoF);
            //nuevo.abajo = cabeza;
            System.out.println("Se agrego nuevo dato" + nuevoF.getPosx()+ "," + nuevoF.getPosy());
              
        } else {
             // si el siguiente de la referencia ya existe, entonces el siguienet de ese nodo es el nuevo
      
             auxF = fil.getRaiz().getArriba();
             auxF.setArriba(nuevoF);
             nuevoF.setAbajo(auxF);
            
             
             System.out.println("se agrego un nuevo dato"  + nuevoF.getPosx() + "," + nuevoF.getPosy());
            //  System.out.println("nodo anterior es" + nuevo.getAbajo().getPosx() + "," + nuevo.getAbajo().getPosy() + "nodo nuevo" + nuevo.getPosx() + "," + nuevo.getPosy());
            
             
         }
 
       
      
         if(raiz == null){
            nuevo.setIzquierdacolumna(izquierdacolumna);
            nuevo.setAbajofila(abajofila);
           
        
    }
         else if (filas >  1 && columna ==1){
             NodoOrtogonal_201212596 actual;
             nuevo = new NodoOrtogonal_201212596();
             actual = raiz;
             while (actual.getArriba() != null){
                 actual = actual.getArriba();
                 
             }
             actual.setArriba(nuevo);
             nuevo.setAbajo(actual);
         }
        }
        }
              }
        //En caso que la raiz sea nula se le asigna punteros de tipo NodoFila y nodoColumna
        

    /**
     * @return the abajofila
     */
    public Nodofila_201212596 getAbajofila() {
        return abajofila;
    }

    /**
     * @param abajofila the abajofila to set
     */
    public void setAbajofila(Nodofila_201212596 abajofila) {
        this.abajofila = abajofila;
    }

    /**
     * @return the izquierdacolumna
     */
    public Nodocolumna_201212596 getIzquierdacolumna() {
        return izquierdacolumna;
    }

    /**
     * @param izquierdacolumna the izquierdacolumna to set
     */
    public void setIzquierdacolumna(Nodocolumna_201212596 izquierdacolumna) {
        this.izquierdacolumna = izquierdacolumna;
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
     
  
        
   }

    
    


