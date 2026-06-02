public class Main {

    public static void main(String[] args) {

        MinHeap heap = new MinHeap();

        heap.insertar(50);
        heap.insertar(30);
        heap.insertar(40);
        heap.insertar(10);
        heap.insertar(20);

        System.out.println("\nHeap construido:");
        heap.mostrarHeap();

        System.out.println("\nMínimo actual:");
        System.out.println(heap.obtenerMinimo());

        System.out.println("\nEliminando mínimo...");
        System.out.println("Valor eliminado: " + heap.eliminarMinimo());

        System.out.println("\nHeap después de eliminar:");
        heap.mostrarHeap();
    }
}