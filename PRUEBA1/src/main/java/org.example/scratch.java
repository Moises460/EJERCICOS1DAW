package org.example;
import java.util.Scanner;


class Scratch {

    static void main() {


        Scanner teclas = new Scanner(System.in);

        System.out.println("Pon tu NicKname");//esto es el esrcibir
        String curso= teclas.next();

        System.out.println("escribe las horas");
        int num1 = teclas.nextInt();
        System.out.println("escribe la tarifa");
        int num2 = teclas.nextInt();
        System.out.println("el resultado es "+(num1*num2));




    }

}