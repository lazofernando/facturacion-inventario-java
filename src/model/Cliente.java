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
    public void actualizarRegistro() {
        String sentencia_SQL="UPDATE t_cliente set cli_tipo_doc =?, cli_num_doc =?, cli_nomb_comercial =?, cli_nomb =?, cli_ape =?, cli_telef =?, cli_mail =?, cli_nomb_ciudad =?, cli_direc =? WHERE cli_num_doc =?";
        Conexion conexion =new Conexion();
        try {
            PreparedStatement personaConexion = conexion.getConnection().prepareStatement(sentencia_SQL);
	    personaConexion.setString(1, getTipoDocumento());
            personaConexion.setString(2, getNumeroDocumento());
	    personaConexion.setString(3, getNombreComercial());
	    personaConexion.setString(4, getNombre());
	    personaConexion.setString(5, getApellidos());
	    personaConexion.setString(6, getTelefono());
	    personaConexion.setString(7, getCorreo());
	    personaConexion.setString(8, getCiudad());
	    personaConexion.setString(9, getDireccion());
	    personaConexion.setString(10, getNumeroDocumento());
            personaConexion.executeUpdate();
            JOptionPane.showMessageDialog(null, " Se ha Modificado el Registro del cliente de manera correcta","Confirmación",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo Actualizar registro", "Cliente-registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String getNombreComercial() {
        return this.nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    
}