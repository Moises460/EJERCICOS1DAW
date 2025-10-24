import java.util.Scanner;

public class ISBM {
    static void main() {
        Scanner tecla= new Scanner(System.in);

      int seleccion=0;
      String validar;
      String reparar;



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



        switch (seleccion){

            case 1:
                System.out.println("------------------------------");
                System.out.println(" INTRODUZCA ISBM PARA VALIDAR ");
                System.out.println("------------------------------");
                validar = tecla.next();
                int tamanyo = validar.length();
                if (tamanyo == 10) {
                    int suma = 0;

                    for (int i = 0; i < 10; i++) {
                        String digitoStr = validar.substring(i, i + 1); // Extrae el dígito como String
                        int valor = Integer.parseInt(digitoStr);        // Convierte a entero
                        int resta = 10 - i;                              // Peso decreciente
                        int validaro = valor * resta;
                        suma += validaro;

                        System.out.println(valor + " x " + resta + " = " + validaro);
                    }

                    if (suma % 11 == 0) {
                        System.out.println("El ISBN-10 es válido.");
                    } else {
                        System.out.println(" El ISBN-10 no es válido.");
                    }

                } else {
                    System.out.println("TU NUMERO NO ES CORRECTO. SUPERA LAS CIFRAS MAXIMAS ACEPTADAS");
                }
                break;
            case 2:
                System.out.println("------------------------------");
                System.out.println(" INTRODUZCA ISBM PARA REPARAR ");
                System.out.println("------------------------------");
                reparar= tecla.next();
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
