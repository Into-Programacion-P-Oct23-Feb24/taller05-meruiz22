/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Generar un algoritmo y diagrama de flujo que permita calcular y 
        mostrar el valor de la planilla de teléfono de un casa. Se debe ingresar
        el costo por minutos, el número de minutos consumidos en el mes.
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_minutos;
        double minutos_consu;
        double valor_planilla;
        
        System.out.println("Ingrese el costo por minuto del telefono");
        costo_minutos= entrada.nextDouble();
        System.out.println("Ingrese los minuros consumidos en el telefono");
        minutos_consu= entrada.nextDouble();
        valor_planilla= costo_minutos*minutos_consu;
        System.out.println("El valor de la planilla es del telefono es  " + 
                valor_planilla);
        
    }
    
}
