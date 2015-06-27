package pe.uni.fiis.dirigida.bean;

/**
 * Created by User on 13/06/2015.
 */
public class Categoria {
    private Integer codigo;
    private String descripcion;

    public Categoria(){

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
