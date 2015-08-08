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
public class ListaColumna_201212596 {
    
   // Nodocolumna_201212596 primera;
    Nodocolumna_201212596 izquierda;
    Nodocolumna_201212596 derecha;
    NodoCabeza_201212596 raiz  = new NodoCabeza_201212596();
    int Posx;
    int Posy;
    
   // NodoOrtogonal_201212596 cabeza;
    

    public ListaColumna_201212596() {
    //this.primera = null;
    this.izquierda = null;
    this.derecha = null;
   
    }
   
    
    
        public void insertarnodocolumna(int i, int j){
        Nodocolumna_201212596 nuevo = new Nodocolumna_201212596();
        NodoOrtogonal_201212596 nuevoOr = new NodoOrtogonal_201212596();
        // si el siguiente de la referencia de la cabeza es nulo, insertar nuevo
        nuevo.setPosx(i);
        nuevo.setPosy(j);
         if (getRaiz().getDerecha() == null) {
            getRaiz().setDerecha(nuevo);
            nuevo.setIzquierda(izquierda);
             // nuevo.izquierda = raiz;
             System.out.println("Se agrego nuevo dato" + nuevo.getPosx() + "," + nuevo.getPosy());
         } else {
             // si el siguiente de la referencia ya existe, entonces el siguienet de ese nodo es el nuevo
            Nodocolumna_201212596 aux = new Nodocolumna_201212596();
            aux = getRaiz().getDerecha();
           
            aux.setDerecha(nuevo);
            nuevo.setIzquierda(aux);
            System.out.println("se agrego un nuevo dato");
             System.out.println("nodo anterior" + nuevo.getIzquierda().getPosx() + "" + nuevo.getIzquierda().getPosy() + "nodo nuevo" + nuevo.getPosx() + "," + nuevo.getPosy());
             
             
         }
     }
        
        
        public void ColumnaVacia (){
       Nodocolumna_201212596 aux = new Nodocolumna_201212596();
       //aux = getRaiz();
       if(aux == null){
           System.out.println("la lista esta vacia");
       }else{
           System.out.println("la lista no esta vacia");
       }
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
    

    /**
     * @return the raiz
     */
   
    /**
     * @return the raiz
     */

}
