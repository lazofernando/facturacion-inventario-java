package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Proveedor;
import view.InterfazProveedorRegistro;

/**
 *
 * @author fer
 */
public class ControladorProveedor implements ActionListener {
    private InterfazProveedorRegistro  vistaRegistroProveedor;
    private Proveedor proveedor;    

    public ControladorProveedor(InterfazProveedorRegistro vistaRegistroProveedor, Proveedor proveedor) {
        this.vistaRegistroProveedor = vistaRegistroProveedor;
        this.proveedor = proveedor;
        this.vistaRegistroProveedor.btnProveedorRegistroGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        proveedor.setTipoDocumento("RUT");
        proveedor.setNumeroDocumento(vistaRegistroProveedor.txtProveedorRegistroNumeroRut.getText());
        proveedor.setNombreComercial(vistaRegistroProveedor.txtProveedorRegistroNombreComercial.getText());
        proveedor.setNombre(vistaRegistroProveedor.txtProveedorRegistroNombre.getText());
        proveedor.setApellidos(vistaRegistroProveedor.txtProveedorRegistroApellido.getText());
        proveedor.setTelefono(vistaRegistroProveedor.txtProveedorRegistroTelefono.getText());
        proveedor.setCorreo(vistaRegistroProveedor.txtProveedorRegistroEmail.getText());
        proveedor.setCiudad(vistaRegistroProveedor.txtProveedorRegistroCiudad.getText());
        proveedor.setDireccion(vistaRegistroProveedor.txtProveedorRegistroDireccion.getText());
        
        if (ae.getSource()== this.vistaRegistroProveedor.btnProveedorRegistroGuardar) {
            proveedor.registrar();
            vistaRegistroProveedor.txtProveedorRegistroNumeroRut.setText("");
            vistaRegistroProveedor.txtProveedorRegistroNombreComercial.setText("");
            vistaRegistroProveedor.txtProveedorRegistroNombre.setText("");
            vistaRegistroProveedor.txtProveedorRegistroApellido.setText("");
            vistaRegistroProveedor.txtProveedorRegistroTelefono.setText("");
            vistaRegistroProveedor.txtProveedorRegistroEmail.setText("");
            vistaRegistroProveedor.txtProveedorRegistroCiudad.setText("");
            vistaRegistroProveedor.txtProveedorRegistroDireccion.setText("");
        }
    }
}
