/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fer
 */
public class Proveedor extends Persona{
    
    private String nombreComercial;
    
    public Proveedor(DefaultTableModel tablalistar){
        this.tablalistar=tablalistar;
    }
  
    public Proveedor(   String tipoDocumento, 
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

    @Override
    public void registrar() {
        Conexion conexion =new Conexion();
        try {
            Statement proveedorConexion =conexion.getConnection().createStatement();
            proveedorConexion.executeUpdate("INSERT INTO t_proveedor VALUES (NULL, '"+
                                                                                getTipoDocumento()+"', '"+
                                                                                getNumeroDocumento()+"', '"+
                                                                                getNombreComercial()+"', '"+
                                                                                getNombre()+"', '"+
                                                                                getApellidos()+"', '"+
                                                                                getTelefono()+"', '"+
                                                                                getCorreo()+"', '"+
                                                                                getCiudad()+"', '"+
                                                                                getDireccion()+"')");
                
            JOptionPane.showMessageDialog(null, "Se ha registrado el proveedor exitosamente", "Proveedor-registro",JOptionPane.INFORMATION_MESSAGE);
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo registrar", "Proveedor-registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String getNombreComercial() {
        return this.nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public void actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
