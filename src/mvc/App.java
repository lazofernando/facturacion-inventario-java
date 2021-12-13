package mvc;

import controller.*;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;

public class App {
    
    public static void main(String[] args) {
        
        //variables para configurar las tablas
 
        
        // intancia modelo
        Cliente cliente = new Cliente();
        Empleado empleado = new Empleado();
        Proveedor proveedor = new Proveedor();
        
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
                                                            cliente
        );
        ControladorCliente ctrlCliente = new ControladorCliente(vClienteRegistro,cliente);
        ControladorProveedor ctrlproveedor = new ControladorProveedor(vProveedorRegistro,proveedor);
        
        

        
        
        ctrl.iniciar();
        
        
        
        
        
    }   
    
}
    