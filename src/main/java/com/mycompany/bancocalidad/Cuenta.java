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
public class Cuenta implements Operaciones {

    private Cliente cliente;
    private double saldo;
    private String pin, numCuenta;

    public Cuenta(Cliente cliente, double saldo, String pin, String numCuenta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.pin = pin;
        this.numCuenta = numCuenta;
    }

    public Cuenta() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public boolean pinCorrecto(String pin) {
        if (this.pin.equals(pin)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double sacarDinero(double dinero) {
        if (this.saldo < dinero){
            return 0;
        }else{
            this.saldo = this.saldo - dinero;
            return dinero;
        }
    }

}