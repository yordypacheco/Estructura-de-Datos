import java.util.Scanner;

public class Main {

    static String[] pila = new String[5];
    static int tope = -1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- PILA CON ARRAY ---");
            System.out.println("1. Visitar página");
            System.out.println("2. Ir atrás");
            System.out.println("3. Página actual");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese página: ");
                    String pagina = sc.nextLine();
                    push(pagina);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    mostrar();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 5);
    }

    public static void push(String dato) {

        if (tope == pila.length - 1) {
            System.out.println("Pila llena");
        } else {

            tope++;
            pila[tope] = dato;

            System.out.println("Página agregada");
        }
    }


    public static void pop() {

        if (tope == -1) {
            System.out.println("Pila vacía");
        } else {

            System.out.println("Eliminando: " + pila[tope]);

            tope--;
        }
    }

    public static void peek() {

        if (tope == -1) {
            System.out.println("Pila vacía");
        } else {

            System.out.println("Página actual: " + pila[tope]);
        }
    }


    public static void mostrar() {

        if (tope == -1) {
            System.out.println("Pila vacía");
        } else {

            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }
    }
}