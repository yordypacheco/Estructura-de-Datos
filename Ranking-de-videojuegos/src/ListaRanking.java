public class ListaRanking {

    private Nodo cabeza;

    public ListaRanking() {
        cabeza = null;

    }

    public void insertarFinal(Jugador contacto) {
        Nodo nuevo = new Nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Jugador buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }



    public  void listar(){
        Nodo actual=cabeza;
        while (actual !=null){
            System.out.println(actual.getDato());
            actual= actual.getSiguiente();

        }
    }

    public Jugador  lobby (){
if (cabeza == null){
    return null;
}
Nodo actual = cabeza;
Jugador mayor = cabeza.getDato();
while ( actual != null){
    if (actual.getDato().getRanking()> mayor.getRanking()){
        mayor = actual.getDato();
    }
    actual = actual.getSiguiente();
}



return mayor;
    }
public int contar(){

        int contador =0;
        Nodo actual = cabeza;
        while(actual !=null ){
contador++;
            actual= actual.getSiguiente();
        }

    return contador;
}

public  int top(){
    int aleatorio = (int)(Math.random() * 100) + 1;

    return aleatorio;
}




 public void ordenarNodos (){

    }

}
