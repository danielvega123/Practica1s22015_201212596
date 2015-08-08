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
public class Lista_objetos_201212596 {
   public Nodoobjetos_201212596 primero;
  public Nodoobjetos_201212596 ultimo;
   
    
    public Lista_objetos_201212596(){
    primero = null;
    ultimo = null;
    
    }
    
    public void insertarnodo(String imagen, String nombre, int correlativo ){
        Nodoobjetos_201212596 nuevo = new Nodoobjetos_201212596(imagen, nombre,correlativo);
         if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            System.out.println("Se agrego nuevo dato");
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            System.out.println("Se agrego nuevo dato");
        }
    }
        public void Imprimir() {

        if (primero == null) {
            System.out.println("La lista esta vacia");
        } else {
            Nodoobjetos_201212596 temporal = new Nodoobjetos_201212596();
            temporal = primero;
            while (temporal != null) {
                System.out.println("Nombre: "+temporal.getNombre()+ "Imagen "+temporal.getImagen());
                temporal = temporal.siguiente;
            }
        }

    }
           public void eliminar(int d){
        Nodoobjetos_201212596 aux=getPrimero();
        
        while(aux!=null){
            if(getPrimero().getCorrelativo()==d)
            {
                setPrimero(getPrimero().getSiguiente());
                break;
            }else if(aux.getSiguiente().getCorrelativo()==d)
            {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                break;
            }
            aux=aux.getSiguiente();
        }
    }

    /**
     * @return the primero
     */
    public Nodoobjetos_201212596 getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodoobjetos_201212596 primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public Nodoobjetos_201212596 getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodoobjetos_201212596 ultimo) {
        this.ultimo = ultimo;
    }
        

    /**
     * @return the cabeza
     */
   
    
}
