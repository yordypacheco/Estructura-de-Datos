public class nodo {
    private paginas dato;
   private  nodo siguiente;


    public paginas getDato() {
        return dato;
    }

    public void setDato(paginas dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public nodo(paginas dato ){
        this.dato= dato;
    }
}



