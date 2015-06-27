package pe.uni.fiis.dirigida.bean;

/**
 * Created by User on 13/06/2015.
 */
public class Video {
    private Integer id;
    private String nombre;
    private String imagen;
    private String url;
    private Categoria categoria;

    public Video(){

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video(Integer id, String imagen, String nombre, String url, Categoria categoria) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.url = url;
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
