/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Solución que permita calcular y mostrar el valor a cancelar de una 
        planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y
        el número de kilovatios consumidos en el mes. Si el usuario tiene edad 
        mayor a 65 años, se debe descontar el 10%.
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        int edad;
        double kilo_hora;
        double kilo_consu;
        double valor_cancelar;
        double descuento;
        
        System.out.println("Ingrese su edad por favor");
        edad= entrada.nextInt();
        System.out.println("Ingrese el costo del kilovatio por hora");
        kilo_hora= entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos");
        kilo_consu= entrada.nextDouble();
        valor_cancelar = kilo_hora*kilo_consu;
        
        if (edad>65){
            descuento= (valor_cancelar*10)/100;
            valor_cancelar= (valor_cancelar-descuento);
        }
        System.out.println("El valor a cancelar es de "+ valor_cancelar); 
                    
        }
}
        
    
    

