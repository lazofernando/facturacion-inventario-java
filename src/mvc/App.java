package mvc;

import controller.*;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;

public class App {
    
    public static void main(String[] args) {
        
        //variables para configurar las tablas
        String encabezadoClienteLista[]= {"tipo de Documento","Numero de documento","Nombre","Apellidos","Telefono","Email","Ciufaf","Direccion"};
        String encabezadoProveedorLista[]= {"tipo de Documento","Numero de documento","Nombre comercial","Nombre","Apellidos","Telefono","Email","Ciufaf","Direccion"};

        DefaultTableModel tablaClientelista = new DefaultTableModel();
        DefaultTableModel tablaProveedorlista = new DefaultTableModel();

        // intancia modelo
        Cliente cliente = new Cliente(tablaClientelista);
        Empleado empleado = new Empleado();
        Proveedor proveedor = new Proveedor(tablaProveedorlista);
        
        cliente.cargarEncabezado(encabezadoClienteLista);
        proveedor.cargarEncabezado(encabezadoProveedorLista);
        
        //instancia vista
        PanelPrincipal Interfaz = new PanelPrincipal();
        InterfazClienteLista vClienteLista = new InterfazClienteLista();
        InterfazClienteRegistro vClienteRegistro = new InterfazClienteRegistro();
        InterfazFacturacionVentaLista vVentaLista = new InterfazFacturacionVentaLista();
        InterfazFacturacionVentaRegistro vVentaRegistro = new InterfazFacturacionVentaRegistro();
        InterfazProveedorLista vProveedorLista = new InterfazProveedorLista();
        InterfazProveedorRegistro vProveedorRegistro = new InterfazProveedorRegistro();
        InterfazRepuestoLista vRepuestoLista = new InterfazRepuestoLista();
        InterfazRepuestoRegistro vRepuestoRegistro = new InterfazRepuestoRegistro();
        
        //instancia controlador
        ControladorInterfaz ctrl = new ControladorInterfaz( Interfaz,
                                                            vClienteLista,vClienteRegistro,
                                                            vVentaLista,vVentaRegistro,
                                                            vProveedorLista,vProveedorRegistro,
                                                            vRepuestoLista,vRepuestoRegistro,
                                                            cliente, proveedor
        );
        
        ControladorCliente ctrlCliente = new ControladorCliente(vClienteRegistro,cliente);
        ControladorProveedor ctrlproveedor = new ControladorProveedor(vProveedorRegistro,proveedor);
        
        
        
        
        
        ctrl.iniciar();
        
        
        
        
        
    }   
    
}
    