public class Main {

    public static void main(String[] args) {

        NodoBinario raiz = new NodoBinario(10);

        raiz.izquierda = new NodoBinario(5);
        raiz.derecha = new NodoBinario(20);

        raiz.izquierda.izquierda = new NodoBinario(3);
        raiz.izquierda.derecha = new NodoBinario(7);


        System.out.println("Cantidad de nodos: "
                + contarNodos(raiz));


        System.out.println("Altura del árbol: "
                + altura(raiz));
    }

    public static int contarNodos(NodoBinario nodo) {

        if (nodo == null) {
            return 0;
        }

        return 1
                + contarNodos(nodo.izquierda)
                + contarNodos(nodo.derecha);
    }


    public static int altura(NodoBinario nodo) {

        if (nodo == null) {
            return -1;
        }

        return 1 + Math.max(
                altura(nodo.izquierda),
                altura(nodo.derecha)
        );
    }
}