
import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }


    public void insertar(int valor) {

        heap.add(valor);

        System.out.println("Insertando: " + valor);

        heapifyUp(heap.size() - 1);
    }


    private void heapifyUp(int indice) {

        while (indice > 0) {

            int padre = (indice - 1) / 2;

            if (heap.get(indice) < heap.get(padre)) {

                int temporal = heap.get(indice);

                heap.set(indice, heap.get(padre));
                heap.set(padre, temporal);

                indice = padre;

            } else {
                break;
            }
        }
    }


    public void mostrarHeap() {
        System.out.println("Heap actual: " + heap);
    }
    public int obtenerMinimo() {

        if (heap.isEmpty()) {
            throw new RuntimeException("El heap está vacío");
        }

        return heap.get(0);
    }
    private void heapifyDown(int indice) {

        int menor = indice;

        while (true) {

            int hijoIzquierdo = 2 * indice + 1;
            int hijoDerecho = 2 * indice + 2;

            if (hijoIzquierdo < heap.size()
                    && heap.get(hijoIzquierdo) < heap.get(menor)) {

                menor = hijoIzquierdo;
            }

            if (hijoDerecho < heap.size()
                    && heap.get(hijoDerecho) < heap.get(menor)) {

                menor = hijoDerecho;
            }

            if (menor != indice) {

                int temporal = heap.get(indice);

                heap.set(indice, heap.get(menor));
                heap.set(menor, temporal);

                indice = menor;

            } else {
                break;
            }
        }
    }
    public int eliminarMinimo() {

        if (heap.isEmpty()) {
            throw new RuntimeException("El heap está vacío");
        }

        int minimo = heap.get(0);

        int ultimo = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {

            heap.set(0, ultimo);

            heapifyDown(0);
        }

        return minimo;
    }

}


