public class contacto {
    private String nombre;
    private String contacto;
    private String correo;

    public contacto(String nombre, String contacto, String correo) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "contacto{" +
                "nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
