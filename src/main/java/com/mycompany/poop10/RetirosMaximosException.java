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
public class RetirosMaximosException extends Exception {

    /**
     * Excepción para indicar que no se pueden hacer mas de tres retiros
     */
    public RetirosMaximosException() {
        super("No puedes hacer mas de tres retiros");
    }    
}
