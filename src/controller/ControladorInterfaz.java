package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;

public class ControladorInterfaz implements ActionListener{
    
    private PanelPrincipal interfaz;
    private InterfazClienteLista clienteLista;
    private InterfazClienteRegistro clienteRegistro;
    private InterfazFacturacionVentaLista ventaLista;
    private InterfazFacturacionVentaRegistro ventaRegistro;
    private InterfazProveedorLista proveedorLista;
    private InterfazProveedorRegistro proveedorRegistro;
    private InterfazRepuestoLista repuestoLista;
    private InterfazRepuestoRegistro repuestoRegistro;

    private Cliente cliente;
    private Proveedor proveedor;
   
    //variables para la vista clientelista 
    String sentenciaSQL_obtenerClienteLista ="select cli_tipo_doc, cli_num_doc, cli_nomb, cli_ape, cli_telef, cli_mail, cli_nomb_ciudad, cli_direc from t_cliente;";
    String campoClienteLista[]= {"cli_tipo_doc","cli_num_doc","cli_nomb","cli_ape","cli_telef","cli_mail","cli_nomb_ciudad","cli_direc"};
    String messageDialogTryClienteLista = "Se ha obtenido la lista de clientes exitosamente";
    String messageDialogCathClienteLista = "No se pudo obtener la lista de clientes";
    String tituloVentanaClienteLista = "Cliente-lista";

    
    //variables para la vista proveedorlista
    String sentenciaSQL_obtenerProveedorLista ="select prov_tipo_doc, prov_num_doc, prov_nomb_comercial, prov_nomb, prov_ape, prov_telef, prov_mail, prov_nomb_ciudad, prov_direc from t_proveedor;";
    String campoProveedorLista[]= {"prov_tipo_doc", "prov_num_doc", "prov_nomb_comercial", "prov_nomb", "prov_ape", "prov_telef", "prov_mail", "prov_nomb_ciudad", "prov_direc"};
    String messageDialogTryProveedorLista = "Se ha obtenido la lista de proveedores exitosamente";
    String messageDialogCathProveedorLista = "No se pudo obtener la lista de Proveedor";
    String tituloVentanaProveedorLista = "Proveedor-lista";
 

    public ControladorInterfaz( PanelPrincipal interfaz, 
                                InterfazClienteLista clienteLista, InterfazClienteRegistro clienteRegistro, 
                                InterfazFacturacionVentaLista ventaLista, InterfazFacturacionVentaRegistro ventaRegistro, 
                                InterfazProveedorLista proveedorLista, InterfazProveedorRegistro proveedorRegistro, 
                                InterfazRepuestoLista repuestoLista, InterfazRepuestoRegistro repuestoRegistro, 
                                Cliente cliente, Proveedor proveedor
    ) {
        this.interfaz = interfaz;
        this.clienteLista = clienteLista;
        this.clienteRegistro = clienteRegistro;
        this.ventaLista = ventaLista;
        this.ventaRegistro = ventaRegistro;
        this.proveedorLista = proveedorLista;
        this.proveedorRegistro = proveedorRegistro;
        this.repuestoLista = repuestoLista;
        this.repuestoRegistro = repuestoRegistro;
        
        
        this.cliente = cliente;
        this.proveedor = proveedor; 
        
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
        if (ae.getSource() ==this.interfaz.iListarCliente) {
            MostrarInterfaz(getClienteLista());
            interfaz.setTitle("Lista de clientes");
            mostrarLista(   sentenciaSQL_obtenerClienteLista,
                            campoClienteLista, 
                            messageDialogTryClienteLista, 
                            messageDialogCathClienteLista, 
                            tituloVentanaClienteLista, 
                            getCliente().getTablalistar(),
                            getClienteLista().tbClienteLista);
        }
        if (ae.getSource() ==this.interfaz.iRegistrarCliente) {
            MostrarInterfaz(getClienteRegistro());
            interfaz.setTitle("Registrar cliente");

        }
        if (ae.getSource() ==this.interfaz.iListaProveedores) {
            MostrarInterfaz(getProveedorLista());
            interfaz.setTitle("Lista de proveedores");
            mostrarLista(   sentenciaSQL_obtenerProveedorLista,
                            campoProveedorLista, 
                            messageDialogTryProveedorLista, 
                            messageDialogCathProveedorLista, 
                            tituloVentanaProveedorLista, 
                            getProveedor().getTablalistar(),
                            getProveedorLista().tbProveedorLista);
        }    
        if (ae.getSource() ==this.interfaz.iRegistrarProveedor) {
            MostrarInterfaz(getProveedorRegistro());
            interfaz.setTitle("Registrar Proveedor");
        }    
        if (ae.getSource() ==this.interfaz.iListaRepuesto) {
            MostrarInterfaz(getRepuestoLista());
            interfaz.setTitle("Registrar repuesto");
        }
        if (ae.getSource() ==this.interfaz.iRegistrarRepuesto) {
            MostrarInterfaz(getRepuestoRegistro());
            interfaz.setTitle("Lista de repuesto");
        }  
        if (ae.getSource() ==this.interfaz.iListaVentas) {
            MostrarInterfaz(getVentaLista());
            interfaz.setTitle("Registrar repuesto");
        }
        if (ae.getSource() ==this.interfaz.iRegistrarVenta) {
            MostrarInterfaz(getVentaRegistro());
            interfaz.setTitle("Lista de repuesto");
        }      
    }
    
    public void mouseClicked(MouseEvent ae){
        
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
    
    
    public void mostrarLista(   String sentencia_sql, 
                                String c[], 
                                String messageDialogTry, 
                                String messageDialogCath, 
                                String tituloVentana, 
                                DefaultTableModel modeloTabla,
                                JTable tablaVista) {
        Conexion conexion =new Conexion();

        String registro[] =new String[c.length] ;

        try {
            Statement listaConexion =conexion.getConnection().createStatement();
            ResultSet rs = listaConexion.executeQuery(sentencia_sql);
            
            while (rs.next()) {
                for (int i = 0; i < c.length; i++) {
                    registro[i] =rs.getString(c[i]);
                }
                modeloTabla.addRow(registro);
            }
            tablaVista.setModel(modeloTabla);
            JOptionPane.showMessageDialog(null, messageDialogTry, tituloVentana,JOptionPane.INFORMATION_MESSAGE);
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, messageDialogCath, tituloVentana,JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
    
    public PanelPrincipal getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PanelPrincipal interfaz) {
        this.interfaz = interfaz;
    }

    public InterfazClienteLista getClienteLista() {
        return clienteLista;
    }

    public void setClienteLista(InterfazClienteLista clienteLista) {
        this.clienteLista = clienteLista;
    }

    public InterfazClienteRegistro getClienteRegistro() {
        return clienteRegistro;
    }

    public void setClienteRegistro(InterfazClienteRegistro clienteRegistro) {
        this.clienteRegistro = clienteRegistro;
    }

    public InterfazFacturacionVentaLista getVentaLista() {
        return ventaLista;
    }

    public void setVentaLista(InterfazFacturacionVentaLista ventaLista) {
        this.ventaLista = ventaLista;
    }

    public InterfazFacturacionVentaRegistro getVentaRegistro() {
        return ventaRegistro;
    }

    public void setVentaRegistro(InterfazFacturacionVentaRegistro ventaRegistro) {
        this.ventaRegistro = ventaRegistro;
    }

    public InterfazProveedorLista getProveedorLista() {
        return proveedorLista;
    }

    public void setProveedorLista(InterfazProveedorLista proveedorLista) {
        this.proveedorLista = proveedorLista;
    }

    public InterfazProveedorRegistro getProveedorRegistro() {
        return proveedorRegistro;
    }

    public void setProveedorRegistro(InterfazProveedorRegistro proveedorRegistro) {
        this.proveedorRegistro = proveedorRegistro;
    }

    public InterfazRepuestoLista getRepuestoLista() {
        return repuestoLista;
    }

    public void setRepuestoLista(InterfazRepuestoLista repuestoLista) {
        this.repuestoLista = repuestoLista;
    }

    public InterfazRepuestoRegistro getRepuestoRegistro() {
        return repuestoRegistro;
    }

    public void setRepuestoRegistro(InterfazRepuestoRegistro repuestoRegistro) {
        this.repuestoRegistro = repuestoRegistro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setCliente(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
