package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import view.PanelPrincipal;

public class ControladorInterfaz implements ActionListener{
    private PanelPrincipal interfaz;
    private Object clienteRegistro;
    private Object clienteLista;
    private Object ventaRegistro;
    private Object ventaLista;
    private Object proveedorRegistro;
    private Object proveedorLista;
    private Object repuestoRegistro;
    private Object repuestoLista;

    public ControladorInterfaz( PanelPrincipal interfaz, 
                                Object clienteLista, Object clienteRegistro, 
                                Object ventaLista, Object ventaRegistro, 
                                Object proveedorLista, Object proveedorRegistro, 
                                Object repuestoLista, Object repuestoRegistro
    ) {
        this.interfaz = interfaz;
        this.clienteRegistro = clienteRegistro;
        this.clienteLista = clienteLista;
        this.ventaRegistro = ventaRegistro;
        this.ventaLista = ventaLista;
        this.proveedorRegistro = proveedorRegistro;
        this.proveedorLista = proveedorLista;
        this.repuestoRegistro = repuestoRegistro;
        this.repuestoLista = repuestoLista;
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
        if (ae.getSource() ==this.interfaz.iListarCliente) {
            MostrarInterfaz((JPanel) getClienteLista());
            interfaz.setTitle("Lista de clientes");
        }
        if (ae.getSource() ==this.interfaz.iRegistrarCliente) {
            MostrarInterfaz((JPanel) getClienteRegistro());
            interfaz.setTitle("Registrar cliente");
        }
        if (ae.getSource() ==this.interfaz.iListaProveedores) {
            MostrarInterfaz((JPanel) getProveedorLista());
            interfaz.setTitle("Lista de proveedores");
        }    
        if (ae.getSource() ==this.interfaz.iRegistrarProveedor) {
            MostrarInterfaz((JPanel) getProveedorRegistro());
            interfaz.setTitle("Registrar Proveedor");
        }    
        if (ae.getSource() ==this.interfaz.iListaRepuesto) {
            MostrarInterfaz((JPanel) getRepuestoLista());
            interfaz.setTitle("Registrar repuesto");
        }
        if (ae.getSource() ==this.interfaz.iRegistrarRepuesto) {
            MostrarInterfaz((JPanel) getRepuestoRegistro());
            interfaz.setTitle("Lista de repuesto");
        }  
        if (ae.getSource() ==this.interfaz.iListaVentas) {
            MostrarInterfaz((JPanel) getVentaLista());
            interfaz.setTitle("Registrar repuesto");
        }
        if (ae.getSource() ==this.interfaz.iRegistrarVenta) {
            MostrarInterfaz((JPanel) getVentaRegistro());
            interfaz.setTitle("Lista de repuesto");
        }      
    }

    public PanelPrincipal getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PanelPrincipal interfaz) {
        this.interfaz = interfaz;
    }

    public Object getClienteRegistro() {
        return clienteRegistro;
    }

    public void setClienteRegistro(Object clienteRegistro) {
        this.clienteRegistro = clienteRegistro;
    }

    public Object getClienteLista() {
        return clienteLista;
    }

    public void setClienteLista(Object clienteLista) {
        this.clienteLista = clienteLista;
    }

    public Object getVentaRegistro() {
        return ventaRegistro;
    }

    public void setVentaRegistro(Object ventaRegistro) {
        this.ventaRegistro = ventaRegistro;
    }

    public Object getVentaLista() {
        return ventaLista;
    }

    public void setVentaLista(Object ventaLista) {
        this.ventaLista = ventaLista;
    }

    public Object getProveedorRegistro() {
        return proveedorRegistro;
    }

    public void setProveedorRegistro(Object proveedorRegistro) {
        this.proveedorRegistro = proveedorRegistro;
    }

    public Object getProveedorLista() {
        return proveedorLista;
    }

    public void setProveedorLista(Object proveedorLista) {
        this.proveedorLista = proveedorLista;
    }

    public Object getRepuestoRegistro() {
        return repuestoRegistro;
    }

    public void setRepuestoRegistro(Object repuestoRegistro) {
        this.repuestoRegistro = repuestoRegistro;
    }

    public Object getRepuestoLista() {
        return repuestoLista;
    }

    public void setRepuestoLista(Object repuestoLista) {
        this.repuestoLista = repuestoLista;
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
