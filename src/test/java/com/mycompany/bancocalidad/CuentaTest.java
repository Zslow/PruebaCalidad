/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancocalidad;

import com.mycompany.bancocalidad.Cliente;
import com.mycompany.bancocalidad.Cuenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesus
 */
public class CuentaTest {
    
    private Cliente cliente = new Cliente("jesus", "Dapena", "direccion 1");
    
    public CuentaTest() {
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
     * Test of meterDinero method, of class Cuenta.
     */
    @Test
    public void testMeterDinero() {
        System.out.println("meterDinero");
        String pin = "1234";
        double saldo = 50.0;
        Cuenta c = new Cuenta(cliente, saldo, "1235", "asdfg");
        boolean expResult = false;
        boolean result = c.meterDinero(pin, 100);
        assertEquals(expResult, result);
    }

    /**
     * Test of extraerDinero method, of class Cuenta.
     */
    @Test
    public void testExtraerDinero() {
        System.out.println("extraerDinero");
        String pin = "1234";
        double saldo = 100.0;
        Cuenta c = new Cuenta(cliente, saldo, "1234", "asdfg");
        boolean expResult = false;
        boolean result = c.extraerDinero(pin, 150);
        assertEquals(expResult, result);
    }

    /**
     * Test of imprimirOperaciones method, of class Cuenta.
     */
    @Test
    public void testImprimirOperaciones() {
         System.out.println("extraerDinero");
        String pin = "1234";
        double saldo = 100.0;
        Cuenta c = new Cuenta(cliente, saldo, "1234", "asdfg");
        boolean expResult = true;
        boolean result = c.imprimirOperaciones(pin);
        assertEquals(expResult, result);
    }

    /**
     * Test of verSaldo method, of class Cuenta.
     */
    @Test
    public void testVerSaldo() {
         System.out.println("extraerDinero");
        String pin = "1234";
        double saldo = 100.0;
        Cuenta c = new Cuenta(cliente, saldo, "1234", "asdfg");
        boolean expResult = true;
        boolean result = c.imprimirOperaciones(pin);
        assertEquals(expResult, result);
    }

    /**
     * Test of realizarTransferencia method, of class Cuenta.
     */
    @Test
    public void testRealizarTransferencia() {
        System.out.println("extraerDinero");
        String pin = "1234";
        double saldo = 100.0;
        Cuenta c = new Cuenta(cliente, saldo, "1234", "asdfg");
        Cuenta c2 = new Cuenta(cliente, 500, "1234", "prueba");
        boolean expResult = false;
        boolean result = c.realizarTransferencia(pin, c2, 200);
        assertEquals(expResult, result);
    }
    
}
