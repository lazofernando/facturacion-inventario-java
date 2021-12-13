package model;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public abstract class Persona {
    protected String tipoDocumento;
    protected String numeroDocumento;
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected String correo;
    protected String ciudad;
    protected String direccion;
    protected DefaultTableModel tablalistar;
    
    public Persona(){
        
    }
    
    public Persona(DefaultTableModel tablalistar){
        this.tablalistar= tablalistar;
    }
    public Persona( String tipoDocumento, 
                    String numeroDocumento, 
                    String nombre, 
                    String apellidos, 
                    String telefono, 
                    String correo, 
                    String ciudad, 
                    String direccion,
                    DefaultTableModel tablalistar
    ){
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tablalistar = tablalistar;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    


    public DefaultTableModel getTablalistar() {
        return tablalistar;
    }

    public void setTablalistar(DefaultTableModel tablalistar) {
        this.tablalistar = tablalistar;
    }
    public void cargarEncabezado(String encabezado[]){
        for (int i = 0; i < encabezado.length; i++) {
            getTablalistar().addColumn(encabezado[i]);
        }
    }
    public abstract void registrar();
    public abstract void actualizarRegistro();
}
