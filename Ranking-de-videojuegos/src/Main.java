import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaRanking lista = new ListaRanking();


        System.out.println("Ranking de jugadores de Fornite suerte");


        System.out.print("ingrese el nombre del primer jugador  : ");
        String nombre =sc.nextLine();
        lista.insertarFinal(new Jugador(nombre, "batle royale", lista.top()));
        System.out.print("ingrese el nombre del segundo jugador  : ");
        String nombre2 =sc.nextLine();
        lista.insertarFinal(new Jugador(nombre2, "batle royale", lista.top()));




        lista.insertarFinal(new Jugador("armando casas de bareque", "batle royale", 1));
        lista.insertarFinal(new Jugador("rallador de queso top 1", "batle royale", 1  ));
        lista.insertarFinal(new Jugador("sebastian", "batle royale", 23));

        //registrar puntaje
        //buscar jugador
        //ordenar ranking


        System.out.println();


        System.out.println("el jugador que perdio al inicio de la partida  es  " + lista.lobby());


        System.out.println();

        System.out.println("la cantidad de nodos es : " + lista.contar());


        System.out.println("\nBuscar jugador :");
        System.out.println(lista.buscar(nombre ));

/*

        System.out.println("lista actual \n");
        lista.listar();
        System.out.println("\n lista actual :");

        lista.listar();

        */
    }
}