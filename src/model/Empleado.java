package model;

import java.sql.ResultSet;

/**
 *
 * @author fer
 */
public class Empleado extends Persona {
    
    private String usuario;
    private String cargo;
    private String tienda;
    
    public Empleado(){
        
    }
    
    public Empleado(String tipoDocumento, 
                    String numeroDocumento, 
                    String nombre, 
                    String apellidos, 
                    String telefono, 
                    String correo, 
                    String ciudad, 
                    String direccion
    ) {
        super(  tipoDocumento, 
                numeroDocumento, 
                nombre, 
                apellidos,  
                telefono, 
                correo, 
                ciudad, 
                direccion);
        this.usuario=usuario;
        this.cargo = cargo;
        this.tienda = tienda;
    }

    @Override
    public void registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTienda() {
        return this.tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    @Override
    public String[] mostrarPorItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
