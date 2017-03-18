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
    public boolean meterDinero(String pin, double saldo) {
        if (pin.equals(this.pin)) {
            this.saldo = this.saldo + saldo;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean extraerDinero(String pin, double saldo) {
       if (pin.equals(this.pin)) {
        this.saldo = this.saldo - saldo;
        if (this.saldo < saldo) {
            return false;
        } else {
            return true;
        }}else{
           return false;
       }
    }

    @Override
    public boolean imprimirOperaciones(String pin) {
        if (pin.equals(this.pin)) {
        System.out.println("Queda por hacer");
        return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean verSaldo(String pin) {
        if (pin.equals(this.pin)) {
            System.out.println("Saldo: "+this.saldo);
            return true;}else{
            return false;
        }
    }

    @Override
    public boolean realizarTransferencia(String pin, Cuenta cuenta, double saldo) {
        if (pin.equals(this.pin)) {
        if (this.saldo < saldo) {
            return false;
        } else {
            cuenta.setSaldo(cuenta.getSaldo()+saldo);
            this.saldo = this.saldo - saldo;
            return true;
        }}else{
            return false;
        }
    }

}
