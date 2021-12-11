package controller;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.MenuElement;
import view.*;

public class ControladorInterfaz implements ActionListener{
    private PanelPrincipal interfaz;
    
    InterfazClienteRegistro opcClienteRegistro = new InterfazClienteRegistro();
    InterfazClienteLista opcClienteLista = new InterfazClienteLista();
    
    InterfazRepuestoRegistro opcRepuestoRegistro  = new InterfazRepuestoRegistro();
    InterfazRepuestoLista opcRepuestoLista = new InterfazRepuestoLista();
    
    InterfazProveedorRegistro opcProveedorRegistro  = new InterfazProveedorRegistro();
    InterfazProveedorLista opcProveedorLista = new InterfazProveedorLista();
    
    InterfazFacturacionRegistroVenta opcFacturacionRegistroventa = new InterfazFacturacionRegistroVenta();
    InterfazFacturacionVentaLista opcFacturacionVentaLista =new InterfazFacturacionVentaLista(); 

    public ControladorInterfaz(PanelPrincipal interfaz, JMenuItem[] menuItem) {
        this.interfaz = interfaz;
//        this.menuItem = menuItem;
    }
    

    public ControladorInterfaz(PanelPrincipal interfaz) {
        this.interfaz = interfaz;
        this.interfaz.iRegistrarCliente.addActionListener(this);
        this.interfaz.iListarCliente.addActionListener(this);
        this.interfaz.iRegistrarRepuesto.addActionListener(this);
        this.interfaz.iListaRepuesto.addActionListener(this);
        this.interfaz.iRegistrarVenta.addActionListener(this);
        this.interfaz.iListaVentas.addActionListener(this);
        this.interfaz.iRegistrarProveedor.addActionListener(this);
        this.interfaz.iListaProveedores.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
//        for (int i = 0; i < arr.length; i++) {
//            Object object = arr[i];
//            
//        }
        if (ae.getSource() ==this.interfaz.iRegistrarCliente) {
            MostrarInterfaz(opcClienteRegistro);
            interfaz.setTitle("Registrar cliente");
        }
        if (ae.getSource() ==this.interfaz.iListarCliente) {
            MostrarInterfaz(opcClienteLista);
            interfaz.setTitle("Lista de clientes");
        }
        if (ae.getSource() ==this.interfaz.iRegistrarProveedor) {
            MostrarInterfaz(opcProveedorRegistro);
            interfaz.setTitle("Registrar Proveedor");
        }
        if (ae.getSource() ==this.interfaz.iListaProveedores) {
            MostrarInterfaz(opcProveedorLista);
            interfaz.setTitle("Lista de proveedores");
        }        
        if (ae.getSource() ==this.interfaz.iRegistrarRepuesto) {
            MostrarInterfaz(opcRepuestoRegistro);
            interfaz.setTitle("Registrar repuesto");
        }
        if (ae.getSource() ==this.interfaz.iListaRepuesto) {
            MostrarInterfaz(opcClienteRegistro);
            interfaz.setTitle("Lista de repuesto");
        }  
    }

    public void iniciar(){
        interfaz.setLocationRelativeTo(null);
        interfaz.setTitle("Facturacion e Inventario");
        interfaz.setVisible(true);
    }
    public void MostrarInterfaz(JPanel v){
        v.setSize(1200,720);
        v.setLocation(0, 0);
        interfaz.contenido.removeAll();
        interfaz.contenido.add(v,BorderLayout.CENTER);
        interfaz.contenido.revalidate();
        interfaz.contenido.repaint();
    }
 
    
    
}
