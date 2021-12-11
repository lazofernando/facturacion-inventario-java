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
        InterfazClienteRegistro vClienteLista = new InterfazClienteRegistro();
//        InterfazFacturacionRegistroVenta vClienteRegistro = new InterfazFacturacionRegistroVenta();
        
        //instancia controlador
        ControladorInterfaz ctrl = new ControladorInterfaz(Interfaz);
        ControladorCliente ctrlCliente = new ControladorCliente(vClienteLista,cliente);
        
        ctrl.iniciar();
        
    }   
    
}
    