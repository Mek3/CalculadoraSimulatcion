/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author mek3
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
       
       Scanner sc = new Scanner(System.in);
        System.out.println("**** Bienvendio al sumador **** \nIntroduce el primer numero a sumar: ");
       //String cadena = sc.nextLine();
        String cadena;
        cadena = br.readLine();
       int numero = Integer.parseInt (cadena);
       
       Scanner sc2 = new Scanner(System.in);
       System.out.println("Introduce el segundo numero a sumar: " );
       //String cadena = sc.nextLine();
        String cadena2;
        cadena2 = br.readLine();
       int numero2 = Integer.parseInt (cadena2);
       System.out.println("El resultdao es: "+ (numero  +  numero2));
       

    }
    
}

