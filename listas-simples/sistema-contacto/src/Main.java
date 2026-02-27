public class Main {
    public static void main(String[] args) {
listaContacto lista = new listaContacto();

lista.insertarFinal(new contacto(  "ana",  "3233241234", "ana@gmail.com"));
lista.insertarFinal(new contacto(  "juan",  "3243248834", "juan@gmail.com"));
lista.insertarFinal(new contacto(  "pedro",  "3253241234", "pedro@gmail.com"));
lista.insertarFinal(new contacto(  "peppa",  "3263241234", "peppa@gmail.com"));

System.out.println("lista actual \n");
lista.listar();

System.out.println("\nBuscar ana :");
System.out.println(lista.buscar("ana" ));


        System.out.println("\neliminar andres :");
        System.out.println(lista.eliminar("andres" ));


        System.out.println("\n lista actual :");

        lista.listar();
    }
}
