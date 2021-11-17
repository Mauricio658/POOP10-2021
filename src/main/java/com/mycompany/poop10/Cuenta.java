/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop10;

/**
 *
 * @author Daniel Medrano, Angel Jimenez, Ariana Alvarez, Melisa Matias
 */
public class Cuenta {
    private double saldo;
    private int retiros;

    /**
     * Constructor Cuenta con atributos "saldo" y "retiros" inicializados en 0
     */
    public Cuenta() {
        saldo = 0;
        retiros = 0;
    }
    
    /**
     * 
     * @param monto es la variable que da el usuario para realizar movimientos
     * @throws CapacidadMaximaException para cuando se quiera depositar mas de 20,000
     */
    public void depositar(double monto) throws CapacidadMaximaException{
        System.out.println("Depositando "+monto);
        double suma = saldo + monto;
        if(suma <= 20_000){
            saldo+=monto;
        } else {
            throw new CapacidadMaximaException();
        }
    }
    
    /**
     * 
     * @param monto es la variable que da el usuario para realizar movimientos
     * @throws SaldoInsuficienteException para cuando se quieran retirar dinero que no se tiene
     * @throws RetirosMaximosException para cuando se quieran hacer mas de tres retiros
     */
    public void retirar(double monto) throws SaldoInsuficienteException, RetirosMaximosException{
        if(retiros < 3){
            System.out.println("Retirando "+monto);
            if(saldo<monto){
                throw new SaldoInsuficienteException();
            }
            retiros++;
            saldo-=monto;
        } else{
            throw new RetirosMaximosException();
        }
    }
    
    /**
     * Función que permite hacer la consulta del saldo de la cuenta
     */
    public void consultaSaldo(){
        System.out.println("Tu saldo es de " +saldo);
    }
}
