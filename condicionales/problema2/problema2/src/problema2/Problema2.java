/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Solución que imprima el costo de un pedido de un artículo del cual 
        se tiene la descripción, la cantidad que se requiere y el precio 
        unitario.Si la cantidad pedida excede de 50 unidades, se hace un 
        descuento de 15%.
        */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        String descripcion;
        int cantidad;
        double precio_unitario;
        double costo_total;
        double descuento;
        
        System.out.println("Ingrese la descripcion del articulo");
        descripcion= entrada.nextLine();
        System.out.println("Ingrese la cantidad de articulos");
        cantidad= entrada.nextInt();
        System.out.println("Ingrese el precio del articulo");
        precio_unitario= entrada.nextDouble();
        costo_total= cantidad*precio_unitario;
        
        if (cantidad>50){
            descuento=(costo_total*15)/100;
            costo_total= costo_total-descuento;
        }
        System.out.printf("""
                          El articulo: %s
                          Cantidad: %s
                          Precio Unutario: %.2f
                          Costo Total: %.2f""", descripcion,cantidad,
                precio_unitario,costo_total);
    }
    
}
