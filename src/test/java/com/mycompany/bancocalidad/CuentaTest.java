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
    /*
    @Test
    public void testSacarDinero4() {
        System.out.println("sacarDinero 4");
        Cuenta c = new Cuenta(cliente, 200, "1234", "112344");
        double expResult = 0;
        double result = c.sacarDinero(-100);
        assertEquals(expResult, result, 0.0);
    }
    */
    
    
    
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");

        Cliente expResult = new Cliente("Pepe","García","mi calle ");
        Cuenta instance  = new Cuenta(expResult,50,"1234","1");
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
    
    }


    
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        
        
        Cuenta instance  = new Cuenta(cliente,50,"1234","1");
        double expResult = 50.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);

    }

    
    @Test
    public void testGetPin() {
        System.out.println("getPin");
        
        Cuenta instance  = new Cuenta(cliente,50,"1234","1");
        String expResult = "1234";
        String result = instance.getPin();
        assertEquals(expResult, result);

    }


    @Test
    public void testGetNumCuenta() {
        System.out.println("getNumCuenta");
        
        Cuenta instance  = new Cuenta(cliente,50,"1234","1");
        String expResult = "1";
        String result = instance.getNumCuenta();
        assertEquals(expResult, result);
        
    }



    @Test
    public void testPinCorrecto() {
        System.out.println("pinCorrecto");
        String pin = "1234";
        Cuenta instance  = new Cuenta(cliente,50,"1234","1");
        boolean expResult = true;
        boolean result = instance.pinCorrecto(pin);
        assertEquals(expResult, result);
        
    }
    
    
}
