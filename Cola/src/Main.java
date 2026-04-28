import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Impresora impresora = new Impresora();

                int opcion;

                do {
                    System.out.println("\n--- IMPRESORA ---");
                    System.out.println("1. Agregar documento");
                    System.out.println("2. Imprimir documento");
                    System.out.println("3. Ver siguiente");
                    System.out.println("4. Ver cola");
                    System.out.println("5. Salir");
                    System.out.print("Seleccione: ");

                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.print("Nombre del documento: ");
                            String doc = sc.nextLine();
                            impresora.enqueue(doc);
                            break;

                        case 2:
                            impresora.dequeue();
                            break;

                        case 3:
                            impresora.peek();
                            break;

                        case 4:
                            impresora.mostrar();
                            break;
                    }

                } while (opcion != 5);
            }
        }
