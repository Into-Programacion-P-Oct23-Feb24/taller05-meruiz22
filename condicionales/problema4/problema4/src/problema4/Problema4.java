/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*En una hosteria de la ciudad de Loja se hace un descuento del 10% si 
        el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 
        días y del 20% si se hospeda más de 15 días. Elaborar un solución que 
        pida como datos de entrada el número de días y el precio diario de la 
        habitación y luego calcule e imprima el subtotal por pagar, el descuento
        y el total por pagar.
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dias;
        double precio_dia;
        double subtotal;
        double descuento = 0;
        double total_pagar;
                
        System.out.println("Ingrese el numero de dias de hospedaje");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio de la habitacion por dia");
        precio_dia = entrada.nextDouble();
        subtotal = dias*precio_dia;
        total_pagar= subtotal;
        
        if(dias>15){
            descuento= (subtotal*20)/100;
            total_pagar= subtotal-descuento;
        }else if (dias>5){
            descuento= (subtotal*15)/100;
            total_pagar= subtotal-descuento;  
    } 
        System.out.printf("""
                        Subtotal: %.2f
                        Descuento: %.2f
                        Total a pagar: %.2f""", subtotal, descuento,
                        total_pagar);
            
        
    }
    
}
