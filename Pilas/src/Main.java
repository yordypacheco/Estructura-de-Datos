import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Navegacion historial = new Navegacion();

        int opcion;

        do {
            System.out.println("\n--- NAVEGADOR ---");
            System.out.println("1. Visitar página");
            System.out.println("2. Ir atrás");
            System.out.println("3. Página actual");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese URL: ");
                    String pagina = sc.nextLine();
                    historial.push(pagina);
                    break;

                case 2:
                    historial.pop();
                    break;

                case 3:
                    historial.peek();
                    break;

                case 4:
                    historial.mostrar();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 5);
    }
}