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
public interface Operaciones {
    public boolean meterDinero(String ping, double saldo);
    public boolean extraerDinero(String ping, double saldo);
    public boolean imprimirOperaciones(String ping);
    public boolean realizarTransferencia(String ping, Cuenta cuenta, double saldo);
    public boolean verSaldo(String ping);
}
