/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willard_cerna;

import java.util.Scanner;

/**
 *
 * @author WillardCerna
 */
public class Willard_cerna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        do {
            //El menú
            System.out.println("Menú:");
            System.out.println("1 - Piramide");
            System.out.println("2 - el mayor");
            System.out.println("3 - cliente");
            System.out.println("4 - caracters vocales");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
    
             switch(opcion){
                 case 1:
                    System.out.println("piramide");
                    System.out.println("Ingrese una cantidad de filas: ");
                    numeroFilas= entrada.nextInt();
                    
                    for (int filas = 1; filas <=numeroFilas; filas++) {
                    int sumaLinea=0;
                     int numero=0;   
                        for (int espacio = 0; espacio < filas; espacio++) {
                            System.out.print(numero +" ");
                            sumaLinea + = numero;
                            numero + =2;
                        }
                        System.out.println("= "+sumaLinea);

                 case 2:
                     System.out.println("ingrese numeros enteros");
             
                     {
                     case 3:
                     
                     int nombre;
                     
                     
                    }
                     
             
             
             
             
             
        
    

    

