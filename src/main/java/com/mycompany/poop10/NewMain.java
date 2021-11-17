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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("###### ARREGLOS ######");
        try{
            String mensajes[] = {"Mensaje uno", "Mensaje dos", "Mensaje tres"};
            for( int i=0; i<=3; i++ ){
                System.out.println(mensajes[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera del arreglo.");
            System.out.println(e);
        }
        finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
        
        System.out.println("\n###### ARITMETICA ######");
        try{
            Integer denominador = null;
            float equis = 5/denominador;
            System.out.println(equis);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera del arreglo.");
            System.out.println(e);
        } catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            System.out.println(e);
        } catch(NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        } catch(Exception e){
            System.out.println("Error general: "+e.getMessage());
        }
        
        System.out.println("\n###### PROPAGACIÓN #######");
        try{
            int division = division(10,0);
            System.out.println(division);
        } catch(ArithmeticException e){
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        
        System.out.println("\n###### PROPAGACIÓN 2 #######");
        int div2 = division2(4,0);
        System.out.println(div2);
        
        System.out.println("\n###### THROW - THROWS #######");
        try{   
            int div3 = division3(6,0);
            System.out.println(div3);
        } catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        System.out.println("\n###### CREA NUEVAS EXCEPSIONES ######");
        Cuenta miCuenta  = new Cuenta();
        Cuenta miCuenta2 = new Cuenta();
        Cuenta miCuenta3 = new Cuenta();
        try{
            System.out.println("~~~ Caso Saldo Insuficiente ~~~");
            miCuenta.depositar(2_000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1_500);
            miCuenta.consultaSaldo();
            miCuenta.retirar(650);
            miCuenta.consultaSaldo();
        } catch(SaldoInsuficienteException | CapacidadMaximaException | 
                RetirosMaximosException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("\n~~~ Caso Capacidad Maxima ~~~");
            miCuenta2.depositar(15_000);
            miCuenta2.consultaSaldo();
            miCuenta2.retirar(500);
            miCuenta2.consultaSaldo();
            miCuenta2.depositar(8_000);
            miCuenta2.consultaSaldo();  
        } catch(SaldoInsuficienteException | CapacidadMaximaException | 
                RetirosMaximosException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("\n~~~ Caso Retiros Maximos ~~~");
            miCuenta3.depositar(15_000);
            miCuenta3.consultaSaldo();
            miCuenta3.retirar(6_000);
            miCuenta3.consultaSaldo();
            miCuenta3.retirar(1_200);
            miCuenta3.consultaSaldo();
            miCuenta3.retirar(2_000);
            miCuenta3.consultaSaldo();
            miCuenta3.retirar(3_250);
            miCuenta3.consultaSaldo();
        } catch(SaldoInsuficienteException | CapacidadMaximaException | 
                RetirosMaximosException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    /**
     * Función de división 2
     * @param a como valor del numerados
     * @param b como valor del denominador
     * @return el resultado de la división
     */
    private static int division2(int a, int b) {
        int c = 0;
        try{
            c = a/b;
        } catch(ArithmeticException e){
            System.out.println("Error: "+e);
        }
        return c;
    }

    /**
     * Funcion de división
     * @param a como valor del numerador
     * @param b como valor del denominador
     * @return el resultado de la división
     */
    private static int division(int a, int b) {
        int c = a/b;
        return c;
    }

    /**
     * Función de división 3
     * @param a como valor del numerados
     * @param b como valor del denominador
     * @return el resultado de la división
     * @throws ArithmeticException para cuando sea división entre 0
     */
    private static int division3(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("División entre cero, no lo vuelvas "
                    + " a hacer"); 
        }
        int c = a/b;
        return c;
    }   
}
