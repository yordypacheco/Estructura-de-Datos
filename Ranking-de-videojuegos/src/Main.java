import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaRanking lista = new ListaRanking();


        System.out.println("Ranking de jugadores de Fornite suerte");

        System.out.print("ingrese el nombre del primer jugador  : ");
        String nombre =sc.nextLine();
        lista.insertarFinal(new Jugador(nombre,"su top en batle royale", lista.top()));
        System.out.print("ingrese el nombre del segundo jugador  : ");
        String nombre2 =sc.nextLine();
        lista.insertarFinal(new Jugador(nombre2, " su top enbatle royale", lista.top()));
        System.out.print("ingrese el nombre del tercer jugador  : ");
        String nombre3 =sc.nextLine();
        lista.insertarFinal(new Jugador(nombre3, "su top en batle royale", lista.top()));
        System.out.print("ingrese el nombre del cuarto jugador  : ");
        String nombre4 =sc.nextLine();
        lista.insertarFinal(new Jugador(nombre4, "su top en batle royale", lista.top()));

        System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n");

        System.out.print("lista actual de jugadores y su puesto en partida \n");
        lista.listar();


        System.out.println("\n////////////////////////////////////////////////////////////////////////////////\n");


        System.out.println("el jugador que perdio mas rapido  de la partida  es:  " + lista.lobby());

        System.out.println("el jugador que se acerco mas a una victoria magistrar  es:  " + lista.victoriaMagistral());

        System.out.println();

        System.out.println("la cantidad de nodos es : " + lista.contar());






/*


        lista.insertarFinal(new Jugador("armando casas de bareque", "batle royale", 1));
        lista.insertarFinal(new Jugador("rallador de queso top 1", "batle royale", 1  ));
        lista.insertarFinal(new Jugador("sebastian", "batle royale", 23));
        System.out.println("\n lista actual :");

        lista.listar();
      System.out.println("\nBuscar jugador :");
        System.out.println(lista.buscar(nombre ));
        */
    }
}