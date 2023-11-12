/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Elaborar una solución que permita leer los datos de un automóvil 
        (marca, origen y costo) imprima el impuesto por pagar y el precio de 
        venta (incluido el impuesto). Si el origen es Alemania el impuesto es 
        20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es 
        de USA, 8%
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        String marca;
        String origen;
        double costo;
        double impuesto = 0;
        double precio_venta;
                
        System.out.println("Ingrese la marca del automóvil: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del automóvil: ");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil: ");
        costo = entrada.nextDouble();
        precio_venta= costo;
        
        if(origen.equalsIgnoreCase("Alemania")) {
            impuesto = (costo*20)/100;
            precio_venta= costo+impuesto;
        } else if (origen.equalsIgnoreCase("Japon")) {
            impuesto = (costo*30)/100;
            precio_venta= costo+impuesto;
            }if (origen.equalsIgnoreCase("Italia")) {
                impuesto = (costo*15)/100;
                precio_venta= costo+impuesto;
            }else if (origen.equalsIgnoreCase("USA")){
                impuesto = (costo*8)/100;
                precio_venta= costo+impuesto;
            }
            System.out.printf("""
                El automovil  
                Marca: %s
                Origen: %s
                Costo: %.2f
                Impuesto: %.2f
                Precio de Venta %.2f""", marca,origen,costo,
                impuesto, precio_venta);
    }
}            
        
            
            
    
    

