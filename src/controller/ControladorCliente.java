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
    private InterfazClienteRegistro vistaRegistroCliente;
    private Cliente cliente;

    public ControladorCliente(InterfazClienteRegistro vistaRegistroCliente, Cliente cliente) {
        this.vistaRegistroCliente = vistaRegistroCliente;
        this.cliente = cliente;
        this.vistaRegistroCliente.btnClienteRegistroGuardar.addActionListener(this);
    }  
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        cliente.setTipoDocumento(vistaRegistroCliente.cBoxClienteRegistroTipoDocumento.getSelectedItem().toString());
        cliente.setNumeroDocumento(vistaRegistroCliente.txtClienteRegistroNumDocumento.getText());
        cliente.setNombreComercial(vistaRegistroCliente.txtClienteRegistroNombreComercial.getText());
        cliente.setNombre(vistaRegistroCliente.txtClienteRegistroNombre.getText());
        cliente.setApellidos(vistaRegistroCliente.txtClienteRegistroApellidos.getText());
        cliente.setTelefono(vistaRegistroCliente.txtClienteRegistroTelefono.getText());
        cliente.setCorreo(vistaRegistroCliente.txtClienteRegistroEmail.getText());
        cliente.setCiudad(vistaRegistroCliente.txtClienteRegistroCiudad.getText());
        cliente.setDireccion(vistaRegistroCliente.txtClienteRegistroDireccion.getText());
        
        if (ae.getSource()== this.vistaRegistroCliente.btnClienteRegistroGuardar) {
            cliente.registrar();
            vistaRegistroCliente.cBoxClienteRegistroTipoDocumento.setSelectedIndex(0);
            vistaRegistroCliente.txtClienteRegistroNumDocumento.setText("");
            vistaRegistroCliente.txtClienteRegistroNombreComercial.setText("");
            vistaRegistroCliente.txtClienteRegistroNombre.setText("");
            vistaRegistroCliente.txtClienteRegistroApellidos.setText("");
            vistaRegistroCliente.txtClienteRegistroTelefono.setText("");
            vistaRegistroCliente.txtClienteRegistroEmail.setText("");
            vistaRegistroCliente.txtClienteRegistroCiudad.setText("");
            vistaRegistroCliente.txtClienteRegistroDireccion.setText("");
        }
//        if (ae.getSource()== this.vistaRegistroCliente.btnClienteRegistroGuardar) {
//            cliente.mostrarLista();
//            vistaRegistroCliente.cBoxClienteRegistroTipoDocumento.setSelectedIndex(0);
//            vistaRegistroCliente.txtClienteRegistroNumDocumento.setText("");
//            vistaRegistroCliente.txtClienteRegistroNombreComercial.setText("");
//            vistaRegistroCliente.txtClienteRegistroNombre.setText("");
//            vistaRegistroCliente.txtClienteRegistroApellidos.setText("");
//            vistaRegistroCliente.txtClienteRegistroTelefono.setText("");
//            vistaRegistroCliente.txtClienteRegistroEmail.setText("");
//            vistaRegistroCliente.txtClienteRegistroCiudad.setText("");
//            vistaRegistroCliente.txtClienteRegistroDireccion.setText("");
//        }
    }

    
}
