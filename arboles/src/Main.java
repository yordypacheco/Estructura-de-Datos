public class Main {
    public static void main(String[] args) {

        NodoBinario raiz = new NodoBinario(192550);

        raiz.izquierda = new NodoBinario(191830);
        raiz.derecha = new NodoBinario(191070);

        raiz.izquierda.izquierda = new NodoBinario(191820);
        raiz.izquierda.derecha = new NodoBinario(191840);

        System.out.println("Recorrido Preorden:");
        preorden(raiz);

        System.out.println("\n\nRecorrido Inorden:");
        inorden(raiz);

        System.out.println("\n\nRecorrido Postorden:");
        postorden(raiz);
    }
    public static void preorden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }
    public static void inorden(NodoBinario nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecha);
        }
    }
    public static void postorden(NodoBinario nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }
}