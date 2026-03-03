public class Main {
    public static void main(String[] args) {
        gestionContacto gestion = new gestionContacto();

        gestion.insertar(
                new contacto("ana", "3233241234", "ana@gmail.com")
        );
        gestion.insertar(new contacto("juan", "3243248834", "juan@gmail.com"));
        gestion.insertar(new contacto("pedro", "3253241234", "pedro@gmail.com"));
        gestion.insertar(new contacto("peppa", "3263241234", "peppa@gmail.com"));


        System.out.println("lista de contactos :");
        gestion.listar();


        System.out.println("busacr a Ana");
        gestion.buscar("ana");

        System.out.println("lista de contactos final");
        gestion.listar();


    }
}
