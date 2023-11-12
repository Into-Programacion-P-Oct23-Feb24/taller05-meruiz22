/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int edad;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double descuento;
        double valor_total;
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el costo de netflix");
        netflix= entrada.nextDouble();
        System.out.println("Ingrese el costo de youtobe premiun");
        youtube= entrada.nextDouble();
        System.out.println("Ingrese el costo de dropbox");
        dropbox= entrada.nextDouble();
        System.out.println("Ingrese el costo de spotify");
        spotify= entrada.nextDouble();
        valor_total=netflix+youtube+dropbox+spotify;
        if (edad<30){
            descuento=(valor_total*20)/100;
            valor_total= valor_total-descuento;
                    
        }
        
        System.out.println("El valor total a pagar es " +valor_total);

    }
    
}
