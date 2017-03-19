/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancocalidad;

/**
 *
 * @author jesus
 */
public class BancoCalidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente pepe = new Cliente("Pepe","García","mi calle ");
        Cuenta cuentaPepe = new Cuenta(pepe,50,"1234","1");
    }
    
}
