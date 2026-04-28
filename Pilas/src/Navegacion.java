public class Navegacion {
    Nodo alto;

    public Navegacion() {
        alto = null;
    }


    public void push(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = alto;
        alto = nuevo;
    }


    public void pop() {
        if (alto == null) {
            System.out.println("No hay páginas");
        } else {
            alto = alto.siguiente;
        }
    }


    public void peek() {
        if (alto == null) {
            System.out.println("No hay páginas abiertas");
        } else {
            System.out.println("Página actual: " + alto.dato);
        }
    }


    public void mostrar() {
        Nodo actual = alto;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

}
