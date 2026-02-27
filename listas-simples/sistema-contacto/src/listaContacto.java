public class listaContacto {
    private nodo cabeza;

    public listaContacto() {
        cabeza = null;

    }

    public void insertarFinal(contacto contacto) {
        nodo nuevo = new nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public contacto buscar(String nombre) {
        nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
public  boolean eliminar(String nombre){
        if(cabeza ==null){
            return false;
        }


        //si es el primero
    if (cabeza.getDato().getNombre().equalsIgnoreCase(nombre)){
        cabeza=cabeza.getSiguiente();
        return true;

    }
    nodo actual =cabeza;

    while (actual.getSiguiente()!= null){
        if (actual.getSiguiente().getDato().getNombre().equalsIgnoreCase(nombre)){
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }
        actual.setSiguiente(actual.getSiguiente());
    }
    return  false;
}

public  void listar(){
        nodo actual=cabeza;
        while (actual !=null){
            System.out.println(actual.getDato());
            actual= actual.getSiguiente();
        }
}

}
