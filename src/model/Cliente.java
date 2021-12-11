/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fer
 */
public class Cliente {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String ciudad;
    private String direccion;
    
    
    
    public void registrarCliente(){
        Conexion conexion =new Conexion();
        try {
            Statement personaConexion =conexion.getConnection().createStatement();
            personaConexion.executeUpdate("INSERT INTO t_cliente VALUES (NULL, '"+
                                                                         this.tipoDocumento+"', '"+
                                                                         this.numeroDocumento+"', '"+
                                                                         this.nombre+"', '"+
                                                                         this.apellidos+"', '"+
                                                                         this.telefono+"', '"+
                                                                         this.correo+"', '"+
                                                                         this.ciudad+"', '"+
                                                                         this.direccion+"'");
            JOptionPane.showMessageDialog(null, "Se ha registrado el cliente exitosamente", "Cliente-registro",JOptionPane.INFORMATION_MESSAGE);
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo registrar", "Cliente-registro",JOptionPane.INFORMATION_MESSAGE);
        }
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
}
