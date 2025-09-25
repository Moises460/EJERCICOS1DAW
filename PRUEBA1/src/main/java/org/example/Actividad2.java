package org.example;
import java.util.Scanner;

public class Actividad2 {

     static void main() {

         Scanner teclas = new Scanner(System.in);
         System.out.println("Pon tu NicKname"); //esto es el esrcibir

         String nombre = teclas.nextLine();


         System.out.println("¿Cual es tu curso?"); //esto es el esrcibir


         String curso= teclas.next();

          System.out.println("hola"+nombre+"Bienvenido a "+curso);


    }
}
