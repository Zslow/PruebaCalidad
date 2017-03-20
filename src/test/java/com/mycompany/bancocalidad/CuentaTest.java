/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancocalidad;

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
    
    private Cliente cliente = new Cliente("Jesus", "Dapena", "Gomez");
    
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

    
    @Test
    public void testSacarDinero() {
        System.out.println("sacarDinero 1");
        double dinero = 100.0;
        Cuenta c = new Cuenta(cliente, 200, "1234", "112344");
        boolean expResult = false;
        boolean result = c.pinCorrecto("12334");
        assertEquals(expResult, result);
    }
     @Test
    public void testSacarDinero2() {
        System.out.println("sacarDinero 2");
        double dinero = 100.0;
        Cuenta c = new Cuenta(cliente, 50, "1234", "112344");
        double expResult = 0;
        double result = c.sacarDinero(dinero);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testSacarDinero3() {
        System.out.println("sacarDinero 3");
        Cuenta c = new Cuenta(cliente, 200, "1234", "112344");
        double expResult = 100;
        double result = c.sacarDinero(100);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSacarDinero4() {
        System.out.println("sacarDinero 3");
        Cuenta c = new Cuenta(cliente, 200, "1234", "112344");
        double expResult = 0;
        double result = c.sacarDinero(-100);
        assertEquals(expResult, result, 0.0);
    }
}
