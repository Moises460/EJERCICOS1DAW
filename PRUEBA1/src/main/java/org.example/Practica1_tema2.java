

import java.util.Scanner;

public class Practica1_tema2 {
    static void main() {
        Scanner teclas = new Scanner(System.in);
        boolean repetir = false;
        int num1 = 0;
        int num2 = 0;

        do {
            repetir = false;
            try {
                System.out.println( " Introduce un nuemro que quieras multiplicar (3 cifras): ");
                num1 = teclas.nextInt();

                System.out.println( " Introduce un numero por el que lo quieras multiplicar (3 cifras): ");
                num2 = teclas.nextInt();

                if (num1 > 999 || num1 < 100 || num1 < 0 || num2 > 999 || num2 < 100 || num2 < 0){
                    System.out.println( " ERROR: Los numeros deben de ser positivos y de 3 cifras <3");
                    repetir = true;
                }

            }catch (Exception error){
                System.out.println(" ERROR: Introduce un formato correcto");
                teclas.nextLine();
                repetir = true;
            }
        }while (repetir);


        String num1mult = Integer.toString(num1);
        String num2multi = Integer.toString(num2);

        int cifra1 = Integer.parseInt(num2multi.substring(2,3));
        int cifra2 = Integer.parseInt(num2multi.substring(1,2));        // Sacar las cifras del multiplicador
        int cifra3 = Integer.parseInt(num2multi.substring(0,1));

        int parcial1 = num1 * cifra1; // UNIDADES
        int parcial2 = num1 * cifra2; // DECENAS
        int parcial3 = num1 * cifra3; // CENTENAS

        int total = num1 * num2;            // TOTAL

        // CADENA DE SYSTEM PARA MOSTRAR EL SEULTADO DE LA MULTIPLICACION
        System.out.println();
        System.out.println("   " + num1);
        System.out.println(" x " + num2);
        System.out.println("_______");
        System.out.println("   " +""+ parcial1); // UNIDADES
        System.out.println("  " +"" +parcial2); // DECENAS
        System.out.println("+" +""+ parcial3); // CENTENAS
        System.out.println("________");
        System.out.println("" + total);  //ESTO ES ES EL RESULTADO FINAL

    }
}
