public class nodo {
    private contacto dato;
   private  nodo siguiente;


    public contacto getDato() {
        return dato;
    }

    public void setDato(contacto dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public nodo(contacto dato ){
        this.dato= dato;
    }
}



