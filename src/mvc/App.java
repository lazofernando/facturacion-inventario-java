package mvc;

import controller.*;
import model.*;
import view.*;

public class App {
    
    public static void main(String[] args) {
        
        // intancia modelo
        Cliente cliente = new Cliente();
        
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
                                                            vRepuestoLista,vRepuestoRegistro);
        
//        ControladorCliente ctrlCliente = new ControladorCliente(vClienteLista,cliente);
        
        ctrl.iniciar();
        
        
        
        
        
    }   
    
}
    