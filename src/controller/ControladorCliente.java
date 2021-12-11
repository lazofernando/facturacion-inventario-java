/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import view.InterfazClienteRegistro;
//import view.PanelPrincipal;

/**
 *
 * @author fer
 */
public class ControladorCliente implements ActionListener{
//    private PanelPrincipal vistaPrincipal
    private InterfazClienteRegistro vistaRegistroCliente;
    private Cliente cliente;

    public ControladorCliente(InterfazClienteRegistro vistaRegistroCliente, Cliente cliente) {
        this.vistaRegistroCliente = vistaRegistroCliente;
        this.cliente = cliente;
//        this.vistaRegistroCliente.btnClienteRegistroGuardar.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        cliente.setTipoDocumento(vistaRegistroCliente.cBoxClienteRegistroTipoDocumento.getSelectedItem().toString());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroNumDocumento.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroNombre.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroApellidos.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroTelefono.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroTelefono.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroEmail.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroCiudad.getText());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroDireccion.getText());
        
        if (ae.getSource()== this.vistaRegistroCliente.btnClienteRegistroGuardar) {
            cliente.registrarCliente();
            vistaRegistroCliente.cBoxClienteRegistroTipoDocumento.setSelectedIndex(0);
            vistaRegistroCliente.txtClienteRegistroNumDocumento.setText("");
            vistaRegistroCliente.txtClienteRegistroNombre.setText("");
            vistaRegistroCliente.txtClienteRegistroApellidos.setText("");
            vistaRegistroCliente.txtClienteRegistroTelefono.setText("");
            vistaRegistroCliente.txtClienteRegistroTelefono.setText("");
            vistaRegistroCliente.txtClienteRegistroEmail.setText("");
            vistaRegistroCliente.txtClienteRegistroCiudad.setText("");
            vistaRegistroCliente.txtClienteRegistroDireccion.setText("");
        }
    }

    
}
