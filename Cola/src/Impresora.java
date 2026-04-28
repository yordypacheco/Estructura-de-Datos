public class Impresora {

    Nodo frente;
    Nodo fin;

    public Impresora() {
        frente = null;
        fin = null;
    }

    // ENQUEUE → agregar documento
    public void enqueue(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // DEQUEUE → procesar documento
    public void dequeue() {
        if (frente == null) {
            System.out.println("No hay documentos en cola");
        } else {
            System.out.println("Imprimiendo: " + frente.dato);
            frente = frente.siguiente;

            if (frente == null) {
                fin = null;
            }
        }
    }

    // PEEK → ver siguiente documento
    public void peek() {
        if (frente == null) {
            System.out.println("No hay documentos");
        } else {
            System.out.println("Siguiente: " + frente.dato);
        }
    }

    // Mostrar cola
    public void mostrar() {
        Nodo actual = frente;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
