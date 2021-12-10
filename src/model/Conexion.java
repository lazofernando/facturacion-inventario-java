/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fer
 */
public class Conexion {
    static String db ="facturacion_inventario";
    static String password = "root";    
    static String user = "root";
    static String url ="jdbc:mysql://localhost:3306/"+db+"?characterEncoding=latin1";
    Connection conn = null;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            if (conn != null) {
                System.out.println("Conexion a base de datos "+db+" OK");
            }
            //JOptionPane.showMessageDialog(null, "Conexion exitosa", "Conexion",JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
        //    JOptionPane.showMessageDialog(null, "Sin conexion "+e, "Conexion",JOptionPane.ERROR_MESSAGE);
            System.out.println("Sin conexion "+e+" Conexion");
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        conn=null;
    }
    
}   
