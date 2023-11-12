/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Generar un algoritmo que permita calcular y mostrar el costos de una 
        computadora de escritorio. La misma es comprada por partes;CPU, teclado,
        pantalla, ratón.
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double costo_total;
        
        System.out.println("Ingrese el costo por la cpu");
        cpu= entrada.nextDouble();
        System.out.println("Ingrese el costo por el teclado");
        teclado= entrada.nextDouble();
        System.out.println("Ingrese el costo por la pantalla");
        pantalla= entrada.nextDouble();
        System.out.println("Ingrese el costo por el raton ");
        raton= entrada.nextDouble();
        costo_total= cpu+teclado+pantalla+raton;
        System.out.println("El costo total por la computadora de escritorio es "
                + "de " + costo_total);
        
    }
    
}
