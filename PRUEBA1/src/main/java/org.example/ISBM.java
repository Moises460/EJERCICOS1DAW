package org.example;

import java.util.Scanner;

public class ISBM {
    static void main() {
        Scanner tecla = new Scanner(System.in);
        int resultado=0;
        int tamanyo = 0;
        int seleccion = 0;
        String validar;


        String validar_mayus;

        System.out.println("--------------------");
        System.out.println("   VALIDAROR ISBM   ");
        System.out.println("--------------------");
        System.out.println("  [1]-VALIDAR ISBM  ");
        System.out.println("  [2]-REPARAR ISBM  ");
        System.out.println("  [3]-SALIR         ");
        System.out.println("--------------------");

        if (tecla.hasNextInt()) {
            seleccion = tecla.nextInt();
        } else {
            System.out.println("EL PRIMER VALOR NO ES UN NÚMERO ");
            return;
        }

        switch (seleccion) {

            case 1:
                System.out.println("------------------------------");
                System.out.println(" INTRODUZCA ISBM PARA VALIDAR ");
                System.out.println("------------------------------");
                validar = tecla.next();
                validar_mayus = validar.toUpperCase();
                tamanyo = validar_mayus.length();

                if (tamanyo == 10) {
                    int suma = 0;

                    for (int i = 0; i < 10; i++) {
                        char x = validar_mayus.charAt(i);
                        int valor;

                        if (i == 9 && x == 'X') {
                            valor = 10;
                        } else if (x >= '0' && x <= '9') {
                            valor = x - '0';
                        } else {
                            System.out.println("Carácter inválido en la posición " + (i + 1));
                            return;
                        }
                        int resta = 10 - i;
                        resultado = valor * resta;
                        suma += resultado;
                    }


                    System.out.println("Total suma1: " + suma);


                    if (suma % 11 == 0) {

                        System.out.println("El ISBN ES VALIDO.");
                    } else {
                        System.out.println("El ISBN NO ES VALIDO.");
                    }

                } else {
                    System.out.println("TU NUMERO NO ES CORRECTO. SUPERA LAS CIFRAS MAXIMAS ACEPTADAS (10)");
                }
                break;

            case 2:
                System.out.println("------------------------------");
                System.out.println(" INTRODUZCA ISBN PARA REPARAR ");
                System.out.println("------------------------------");
                String reparar = tecla.next();
                String aceptar_mayus = reparar.toUpperCase();

                if (aceptar_mayus.length() != 10) {
                    System.out.println("El ISBN debe tener 10 caracteres");
                    return;
                }

                int suma = 0;
                int posSigno = -1; 

                for (int i = 0; i < 10; i++) {
                    char x = aceptar_mayus.charAt(i);
                    int valor = 0;

                    if (x == '?') {
                        posSigno = i;
                        continue;
                    }

                    if (i == 9 && x == 'X') {
                        valor = 10;
                    } else if (x >= '0' && x <= '9') {
                        valor = x - '0';
                    } else {
                        System.out.println("Carácter inválido en la posición " + (i + 1));
                        return;
                    }

                    int resta = 10 - i;
                    suma += valor * resta;
                }


                if (posSigno != -1) {
                    for (int i = 0; i <= 10; i++) {
                        int test = suma + i * (10 - posSigno);
                        if (test % 11 == 0) {
<<<<<<< HEAD
                            int arreglado=(i == 10 ? Integer.parseInt("X") : i);
                            System.out.println("El dígito correcto en la posición " + (posicion + 1) + " es: " + (i == 10 ? "X" : i));
=======
                            System.out.println("El dígito correcto en la posición " + (posSigno + 1) + " es: " + (i == 10 ? "X" : i));
>>>>>>> e922a316a710df009bb7ca526d5a02df0d372a1b
                            return;
                        }
                    }
                    System.out.println("No se pudo reparar el ISBN");
                }


                break;

            case 3:
                System.out.println("Saliendo...");
                System.out.println("GRACIAS POR SU VISITA A SU CONSULTADOR DE ISBM");
                break;

            default:
                System.out.println("OPCION NO VALIDA, SELECIONE UNA OPCION (1-3)");
        }
    }
}