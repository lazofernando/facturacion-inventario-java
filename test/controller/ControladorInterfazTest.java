/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Proveedor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.InterfazClienteLista;
import view.InterfazClienteRegistro;
import view.InterfazFacturacionVentaLista;
import view.InterfazFacturacionVentaRegistro;
import view.InterfazProveedorLista;
import view.InterfazProveedorRegistro;
import view.InterfazRepuestoLista;
import view.InterfazRepuestoRegistro;
import view.PanelPrincipal;

/**
 *
 * @author fer
 */
public class ControladorInterfazTest {
    
    public ControladorInterfazTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class ControladorInterfaz.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        ControladorInterfaz instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciar method, of class ControladorInterfaz.
     */
    @Test
    public void testIniciar() {
        System.out.println("iniciar");
        ControladorInterfaz instance = null;
        instance.iniciar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarInterfaz method, of class ControladorInterfaz.
     */
    @Test
    public void testMostrarInterfaz() {
        System.out.println("MostrarInterfaz");
        JPanel v = null;
        ControladorInterfaz instance = null;
        instance.MostrarInterfaz(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarLista method, of class ControladorInterfaz.
     */
    @Test
    public void testMostrarLista() {
        System.out.println("mostrarLista");
        String sentencia_sql = "";
        String[] c = null;
        String messageDialogTry = "";
        String messageDialogCath = "";
        String tituloVentana = "";
        DefaultTableModel modeloTabla = null;
        JTable tablaVista = null;
        ControladorInterfaz instance = null;
        instance.mostrarLista(sentencia_sql, c, messageDialogTry, messageDialogCath, tituloVentana, modeloTabla, tablaVista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterfaz method, of class ControladorInterfaz.
     */
    @Test
    public void testGetInterfaz() {
        System.out.println("getInterfaz");
        ControladorInterfaz instance = null;
        PanelPrincipal expResult = null;
        PanelPrincipal result = instance.getInterfaz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterfaz method, of class ControladorInterfaz.
     */
    @Test
    public void testSetInterfaz() {
        System.out.println("setInterfaz");
        PanelPrincipal interfaz = null;
        ControladorInterfaz instance = null;
        instance.setInterfaz(interfaz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteLista method, of class ControladorInterfaz.
     */
    @Test
    public void testGetClienteLista() {
        System.out.println("getClienteLista");
        ControladorInterfaz instance = null;
        InterfazClienteLista expResult = null;
        InterfazClienteLista result = instance.getClienteLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClienteLista method, of class ControladorInterfaz.
     */
    @Test
    public void testSetClienteLista() {
        System.out.println("setClienteLista");
        InterfazClienteLista clienteLista = null;
        ControladorInterfaz instance = null;
        instance.setClienteLista(clienteLista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testGetClienteRegistro() {
        System.out.println("getClienteRegistro");
        ControladorInterfaz instance = null;
        InterfazClienteRegistro expResult = null;
        InterfazClienteRegistro result = instance.getClienteRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClienteRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testSetClienteRegistro() {
        System.out.println("setClienteRegistro");
        InterfazClienteRegistro clienteRegistro = null;
        ControladorInterfaz instance = null;
        instance.setClienteRegistro(clienteRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentaLista method, of class ControladorInterfaz.
     */
    @Test
    public void testGetVentaLista() {
        System.out.println("getVentaLista");
        ControladorInterfaz instance = null;
        InterfazFacturacionVentaLista expResult = null;
        InterfazFacturacionVentaLista result = instance.getVentaLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentaLista method, of class ControladorInterfaz.
     */
    @Test
    public void testSetVentaLista() {
        System.out.println("setVentaLista");
        InterfazFacturacionVentaLista ventaLista = null;
        ControladorInterfaz instance = null;
        instance.setVentaLista(ventaLista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentaRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testGetVentaRegistro() {
        System.out.println("getVentaRegistro");
        ControladorInterfaz instance = null;
        InterfazFacturacionVentaRegistro expResult = null;
        InterfazFacturacionVentaRegistro result = instance.getVentaRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentaRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testSetVentaRegistro() {
        System.out.println("setVentaRegistro");
        InterfazFacturacionVentaRegistro ventaRegistro = null;
        ControladorInterfaz instance = null;
        instance.setVentaRegistro(ventaRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProveedorLista method, of class ControladorInterfaz.
     */
    @Test
    public void testGetProveedorLista() {
        System.out.println("getProveedorLista");
        ControladorInterfaz instance = null;
        InterfazProveedorLista expResult = null;
        InterfazProveedorLista result = instance.getProveedorLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProveedorLista method, of class ControladorInterfaz.
     */
    @Test
    public void testSetProveedorLista() {
        System.out.println("setProveedorLista");
        InterfazProveedorLista proveedorLista = null;
        ControladorInterfaz instance = null;
        instance.setProveedorLista(proveedorLista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProveedorRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testGetProveedorRegistro() {
        System.out.println("getProveedorRegistro");
        ControladorInterfaz instance = null;
        InterfazProveedorRegistro expResult = null;
        InterfazProveedorRegistro result = instance.getProveedorRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProveedorRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testSetProveedorRegistro() {
        System.out.println("setProveedorRegistro");
        InterfazProveedorRegistro proveedorRegistro = null;
        ControladorInterfaz instance = null;
        instance.setProveedorRegistro(proveedorRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepuestoLista method, of class ControladorInterfaz.
     */
    @Test
    public void testGetRepuestoLista() {
        System.out.println("getRepuestoLista");
        ControladorInterfaz instance = null;
        InterfazRepuestoLista expResult = null;
        InterfazRepuestoLista result = instance.getRepuestoLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRepuestoLista method, of class ControladorInterfaz.
     */
    @Test
    public void testSetRepuestoLista() {
        System.out.println("setRepuestoLista");
        InterfazRepuestoLista repuestoLista = null;
        ControladorInterfaz instance = null;
        instance.setRepuestoLista(repuestoLista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRepuestoRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testGetRepuestoRegistro() {
        System.out.println("getRepuestoRegistro");
        ControladorInterfaz instance = null;
        InterfazRepuestoRegistro expResult = null;
        InterfazRepuestoRegistro result = instance.getRepuestoRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRepuestoRegistro method, of class ControladorInterfaz.
     */
    @Test
    public void testSetRepuestoRegistro() {
        System.out.println("setRepuestoRegistro");
        InterfazRepuestoRegistro repuestoRegistro = null;
        ControladorInterfaz instance = null;
        instance.setRepuestoRegistro(repuestoRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class ControladorInterfaz.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        ControladorInterfaz instance = null;
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class ControladorInterfaz.
     */
    @Test
    public void testSetCliente_Cliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        ControladorInterfaz instance = null;
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProveedor method, of class ControladorInterfaz.
     */
    @Test
    public void testGetProveedor() {
        System.out.println("getProveedor");
        ControladorInterfaz instance = null;
        Proveedor expResult = null;
        Proveedor result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class ControladorInterfaz.
     */
    @Test
    public void testSetCliente_Proveedor() {
        System.out.println("setCliente");
        Proveedor proveedor = null;
        ControladorInterfaz instance = null;
        instance.setCliente(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
