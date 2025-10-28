import java.util.Scanner;

public class ISBM {
    static void main() {
        Scanner tecla = new Scanner(System.in);
        int resultado=0;
        int tamanyo = 0;
        int seleccion = 0;
        String validar;
        String reparar;
        String aceptar_mayus;
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
                System.out.println(" INTRODUZCA ISBM PARA REPARAR ");
                System.out.println("------------------------------");
                System.out.println("  ");
                reparar = tecla.next();
                aceptar_mayus=reparar.toUpperCase();
                int suma = 0;
                int posicion = -1;

                for (int i = 0; i < 10; i++) {
                    char x = reparar.charAt(i);

                    if (x == '?') {
                        posicion = i;
                        continue;
                    }

                    int valor;
                    if (i == 9 && x == 'X') {
                        valor = 10;
                    } else if (x >= '0' && x <= '9') {
                        valor = x - '0';
                    } else {
                        System.out.println("Carácter inválido en la posición " + (i + 1));
                        return;
                    }

                    suma += valor * (10 - i);
                }

                if (posicion == -1) {
                    System.out.println("No hay carácter '?' para reparar.");
                    return;
                }

                // Calcular el valor que falta
                for (int j = 0; j <= 10; j++) {
                    int total = suma + j * (10 - posicion);
                    if (total % 11 == 0) {
                        char repararando = (j == 10) ? 'X' : (char) ('0' + j);
                        System.out.println("El ISBN reparado es: " +
                                reparar.substring(0, posicion) + repararando + reparar.substring(posicion + 1));
                        return;
                    }
                }

                System.out.println("No se pudo reparar el ISBN.");

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