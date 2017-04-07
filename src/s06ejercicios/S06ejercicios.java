/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06ejercicios;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S06ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO S06");
        System.out.println("");
        
        // Producto 01         
        String nombre01 = "";        
        int cantidad01 = 0;
        double precio01 = 0;                 
        // Producto 02
        String nombre02 = "";
        int cantidad02 = 0;
        double precio02 = 0;         
        // Producto 03 
        String nombre03 = "";
        int cantidad03 = 0;
        double precio03 = 0;                 
        
        // Declarando e inicializando variable tipo Scanner 
        Scanner sc = new Scanner(System.in);
        
        /* 
         * PRODUCTO 01
        */        
        // Producto 01 -> nombre        
        System.out.println("Ingrese \"nombre\" producto 01: " );        
        nombre01 = sc.next();        
        // Producto 01 -> cantidad
        System.out.println("Ingrese \"cantidad\" producto 01: " );        
        cantidad01 = sc.nextInt();        
        // Producto 01 -> precio
        System.out.println("Ingrese \"precio\" producto 01: " );        
        precio01 = sc.nextDouble();
        
        /* 
         * PRODUCTO 02
        */        
        // Producto 02 -> nombre        
        System.out.println("Ingrese \"nombre\" producto 02: " );        
        nombre02 = sc.next();        
        // Producto 02 -> cantidad
        System.out.println("Ingrese \"cantidad\" producto 02: " );        
        cantidad02 = sc.nextInt();        
        // Producto 02 -> precio
        System.out.println("Ingrese \"precio\" producto 02: " );        
        precio02 = sc.nextDouble();
        
        /*
         * PRODUCTO 03
        */        
        // Producto 03 -> nombre        
        System.out.println("Ingrese \"nombre\" producto 03: " );        
        nombre03 = sc.next();                
        // Producto 03 -> cantidad
        System.out.println("Ingrese \"cantidad\" producto 03: " );        
        cantidad03 = sc.nextInt();        
        // Producto 03 -> precio
        System.out.println("Ingrese \"precio\" producto 03: " );        
        precio03 = sc.nextDouble();
        
        // subtotal
        double subtotal = 0;
        subtotal += cantidad01 * precio01;
        subtotal += cantidad02 * precio02;
        subtotal += cantidad03 * precio03;        
        // impuesto
        double impuesto = subtotal * 0.18;        
        // total
        double total = subtotal + impuesto;        
        
        System.out.println("El total es: " + total);
        
        
        
        
    }
    
}
