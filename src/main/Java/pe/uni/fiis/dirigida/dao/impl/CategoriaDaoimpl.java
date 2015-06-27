package pe.uni.fiis.dirigida.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.dirigida.bean.Categoria;
import pe.uni.fiis.dirigida.dao.CategoriaDao;

import javax.activation.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 13/06/2015.
 */
public class CategoriaDaoimpl implements CategoriaDao {
    private DataSource datasource;
    private JdbcTemplate jdbcTemplate;

    public DataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void insert(Customer customer){
        String sql="INSERT INTO CUSTOMER "+"(CUST_ID,NAME,AGE)VALUES(?,?,?";
        jdbcTemplate.update(sql.new Object[]{customer.})

    }

    public List<Categoria> listarCategorias(){
        List<Categoria> lista=null;
        lista=new ArrayList<Categoria>();
        Categoria categoria=new Categoria();
        categoria.setCodigo(1);
        categoria.setDescripcion("Copa america");
        lista.add(categoria);

        return lista;
    }

    public static void main(String[] args) {
        CategoriaDaoimpl dao=new CategoriaDaoimpl();
        List<Categoria> lista= dao.listarCategorias();
        lista=new ArrayList<Categoria>();


    }
}
