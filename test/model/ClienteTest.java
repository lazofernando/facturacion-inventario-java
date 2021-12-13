/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fer
 */
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of registrarCliente method, of class Cliente.
     */
    @Test
    public void testRegistrarCliente() {
        System.out.println("registrarCliente");
        Cliente instance = new Cliente();
        instance.registrarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrar method, of class Cliente.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        Cliente instance = new Cliente();
        instance.registrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarRegistro method, of class Cliente.
     */
    @Test
    public void testActualizarRegistro() {
        System.out.println("actualizarRegistro");
        Cliente instance = new Cliente();
        instance.actualizarRegistro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreComercial method, of class Cliente.
     */
    @Test
    public void testGetNombreComercial() {
        System.out.println("getNombreComercial");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombreComercial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreComercial method, of class Cliente.
     */
    @Test
    public void testSetNombreComercial() {
        System.out.println("setNombreComercial");
        String nombreComercial = "";
        Cliente instance = new Cliente();
        instance.setNombreComercial(nombreComercial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
