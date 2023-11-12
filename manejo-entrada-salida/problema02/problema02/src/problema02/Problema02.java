/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Generar un algoritmo que permite ingresar los gastos de tres hijos de un
        padre de familia; calcular y mostrar el total de gastos de los hijos del
        padre de familia.
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double hijo1;
        double hijo2;
        double hijo3;
        double total_gastos;
        
        System.out.println("Ingrese los gastos del primer hijo");
        hijo1= entrada.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo");
        hijo2= entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo");
        hijo3= entrada.nextDouble();
        total_gastos= hijo1+hijo2+hijo3;
        
        System.out.println("El total de gastos de los hijos es de " +
                total_gastos);
    }
        
                
    }
    

