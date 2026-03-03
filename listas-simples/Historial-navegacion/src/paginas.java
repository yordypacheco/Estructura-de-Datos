import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class paginas {
    private String nombre;
    private URL url;
    private LocalDateTime Fechahora;

    public paginas(String nombre, URL url) {
        this.nombre = nombre;
        this.url = url;
        this.Fechahora = LocalDateTime.now();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public LocalDateTime getFechahora() {
        return Fechahora;
    }

    public void setFechahora(LocalDateTime fechahora) {
        Fechahora = fechahora;
    }
}
