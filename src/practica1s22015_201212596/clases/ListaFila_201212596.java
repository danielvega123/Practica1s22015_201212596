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
public class ListaFila_201212596 {
    Nodofila_201212596 arriba;
    Nodofila_201212596 abajo;
    Nodofila_201212596 primeraposfila;
    NodoCabeza_201212596 raiz = new NodoCabeza_201212596();
    int Posx ;
    int Posy;
    

    
    public void insertarnodofila(int i, int j){
        Nodofila_201212596 nuevo = new Nodofila_201212596();
         Nodofila_201212596 aux = new Nodofila_201212596();
        // si el siguiente de la referencia de la cabeza es nulo, insertar nuevo
 nuevo.setPosx(i);
nuevo.setPosy(j);
 if (getRaiz().getArriba() == null) {
            getRaiz().setArriba(nuevo);
            //nuevo.abajo = cabeza;
            System.out.println("Se agrego nuevo dato" + nuevo);
              
        } else {
             // si el siguiente de la referencia ya existe, entonces el siguienet de ese nodo es el nuevo
      
             aux = getRaiz().getArriba();
             aux.setArriba(nuevo);
             nuevo.setAbajo(aux);
             aux = aux.getArriba();
             
             System.out.println("se agrego un nuevo dato"  + nuevo.getPosx() + "," + nuevo.getPosy());
              System.out.println("nodo anterior es" + nuevo.getAbajo().getPosx() + "," + nuevo.getAbajo().getPosy() + "nodo nuevo" + nuevo.getPosx() + "," + nuevo.getPosy());
            
             
         }
    }
    
    public void FilaVacia(){
       Nodofila_201212596 aux = new Nodofila_201212596();
       aux = primeraposfila;
       if(aux== null){
           System.out.println("la lista esta vacia");
       }else{
           System.out.println("la lista no esta vacia");
       }
           
        
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
     * @return the abajo
     */
    public Nodofila_201212596 getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(Nodofila_201212596 abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the raiz
     */
   
    /**
     * @return the primeraposfila
     */
    public Nodofila_201212596 getPrimeraposfila() {
        return primeraposfila;
    }

    /**
     * @param primeraposfila the primeraposfila to set
     */
    public void setPrimeraposfila(Nodofila_201212596 primeraposfila) {
        this.primeraposfila = primeraposfila;
    }

    /**
     * @return the raiz
     */
    public NodoCabeza_201212596 getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoCabeza_201212596 raiz) {
        this.raiz = raiz;
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
