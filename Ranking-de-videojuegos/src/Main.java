public class Main {
    public static void main(String[] args) {

        ListaRanking lista = new ListaRanking();


        lista.insertarFinal(new Jugador("rallador de queso", "batle royale", 2));
        lista.insertarFinal(new Jugador("juan12p", "batle royale", 8));
        lista.insertarFinal(new Jugador("rallador de queso dos", "batle royale", 23));
        lista.insertarFinal(new Jugador("rallador de queso top 1", "batle royale", 99));
        lista.insertarFinal(new Jugador("sebastian", "batle royale", 1));



        //registrar puntaje
        //buscar jugador
        //ordenar ranking








        System.out.println("lista actual \n");
        lista.listar();

        System.out.println("\nBuscar juan12p :");
        System.out.println(lista.buscar("juan12p" ));



        System.out.println("\n lista actual :");

        lista.listar();
    }
}