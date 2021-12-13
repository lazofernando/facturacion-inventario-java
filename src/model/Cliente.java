package model;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fer
 */
public class Cliente extends Persona{
    private String nombreComercial;
    
    public Cliente(){
        
    }
    
    public Cliente(DefaultTableModel tablalistar){
        this.tablalistar =tablalistar;
    }
    
    public Cliente( String tipoDocumento, 
                    String numeroDocumento, 
                    String nombre, 
                    String apellidos, 
                    String telefono, 
                    String correo, 
                    String ciudad, 
                    String direccion,
                    String nombreComercial,
                    DefaultTableModel tablalistar
    ) {
        super(  tipoDocumento, 
                numeroDocumento, 
                nombre, 
                apellidos, 
                telefono, 
                correo, 
                ciudad, 
                direccion,
                tablalistar);
        this.nombreComercial = nombreComercial;
    }
    
    
    
    public void registrarCliente(){

    }


    @Override
    public void registrar() {
        Conexion conexion =new Conexion();
        try {
            Statement personaConexion =conexion.getConnection().createStatement();
            personaConexion.executeUpdate("INSERT INTO t_cliente VALUES (NULL, '"+
                                                                         getTipoDocumento()+"', '"+
                                                                         getNumeroDocumento()+"', '"+
                                                                         getNombreComercial()+"', '"+
                                                                         getNombre()+"', '"+
                                                                         getApellidos()+"', '"+
                                                                         getTelefono()+"', '"+
                                                                         getCorreo()+"', '"+
                                                                         getCiudad()+"', '"+
                                                                         getDireccion()+"')");
                
            JOptionPane.showMessageDialog(null, "Se ha registrado el cliente exitosamente", "Cliente-registro",JOptionPane.INFORMATION_MESSAGE);
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo registrar", "Cliente-registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public String[] mostrarPorItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getNombreComercial() {
        return this.nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
}