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
public class CapacidadMaximaException extends Exception {

    /**
     * Excepción para indicar que no se puede tener un monto mayor a 20,000
     * en la cuenta
     */
    public CapacidadMaximaException() {
        super("No puedes tener mas de $20_000 en la cuenta");
    }
    
}
