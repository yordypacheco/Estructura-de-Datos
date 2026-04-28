public class Navegacion {
    Nodo alto;

    public Navegacion() {
        alto = null;
    }

    // PUSH → agregar página
    public void push(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = alto;
        alto = nuevo;
    }

    // POP → ir atrás
    public void pop() {
        if (alto == null) {
            System.out.println("No hay páginas");
        } else {
            alto = alto.siguiente;
        }
    }

    // PEEK → ver página actual
    public void peek() {
        if (alto == null) {
            System.out.println("No hay páginas abiertas");
        } else {
            System.out.println("Página actual: " + alto.dato);
        }
    }

    // Ver historial
    public void mostrar() {
        Nodo actual = alto;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

}
