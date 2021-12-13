package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import model.Cliente;
import view.*;
//import view.PanelPrincipal;

/**
 *
 * @author fer
 */
public class ControladorCliente implements ActionListener,MouseListener{
    private PanelPrincipal interfaz;
    private InterfazClienteRegistro vistaRegistroCliente;
    private InterfazClienteLista vistaListaCliente;
    private Cliente cliente;

    public ControladorCliente(PanelPrincipal interfaz,InterfazClienteLista vistaListaCliente, InterfazClienteRegistro vistaRegistroCliente,Cliente cliente) {
        this.interfaz = interfaz;
        this.vistaRegistroCliente = vistaRegistroCliente;
        this.vistaListaCliente = vistaListaCliente;
        this.cliente = cliente;
        this.vistaRegistroCliente.btnClienteRegistroGuardar.addActionListener(this);
        this.vistaListaCliente.tbClienteLista.addMouseListener(this);
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
//        if (ae.getSource()==this.vista.btnModificar) {
//            persona.modificarPersona();
//        } 
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int filaSeleccionada = vistaListaCliente.tbClienteLista.rowAtPoint(me.getPoint());
        vistaRegistroCliente.cBoxClienteRegistroTipoDocumento.setSelectedItem(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 0));
        vistaRegistroCliente.txtClienteRegistroNumDocumento.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 1).toString());
//        vistaRegistroCliente.txtClienteRegistroNombreComercial.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 2).toString());
        vistaRegistroCliente.txtClienteRegistroNombre.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 2).toString());
        vistaRegistroCliente.txtClienteRegistroApellidos.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 3).toString());
        vistaRegistroCliente.txtClienteRegistroTelefono.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 4).toString());
        vistaRegistroCliente.txtClienteRegistroEmail.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 5).toString());
        vistaRegistroCliente.txtClienteRegistroCiudad.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 6).toString());
        vistaRegistroCliente.txtClienteRegistroDireccion.setText(vistaListaCliente.tbClienteLista.getValueAt(filaSeleccionada, 7).toString());
        MostrarInterfaz(getVistaRegistroCliente());
        

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    public PanelPrincipal getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PanelPrincipal interfaz) {
        this.interfaz = interfaz;
    }

    public InterfazClienteLista getVistaListaCliente() {
        return vistaListaCliente;
    }

    public void setVistaListaCliente(InterfazClienteLista vistaListaCliente) {
        this.vistaListaCliente = vistaListaCliente;
    }
 
    public void MostrarInterfaz(JPanel v){
        v.setSize(1200,720);
        v.setLocation(0, 0);
        interfaz.contenido.removeAll();
        interfaz.contenido.add(v,BorderLayout.CENTER);
        interfaz.contenido.revalidate();
        interfaz.contenido.repaint();
    }

    public InterfazClienteRegistro getVistaRegistroCliente() {
        return vistaRegistroCliente;
    }

    public void setVistaRegistroCliente(InterfazClienteRegistro vistaRegistroCliente) {
        this.vistaRegistroCliente = vistaRegistroCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
