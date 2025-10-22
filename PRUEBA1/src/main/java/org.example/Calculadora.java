import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner teclas= new Scanner(System.in);
        int modo;
        double num1=0;
        double num2=0;


        System.out.println("----CALCULADORA----");
        System.out.println("INTRODUZCA UN NUEMRO   ");
        if (teclas.hasNextDouble()) {
            num1 = teclas.nextDouble();
        } else {
            System.out.println("EL PRIMER VALOR NO ES UN NÚMERO ");
        }

        System.out.println("---------------------------");
        System.out.println("SELECCIONE QUE QUIERE HACER");
        System.out.println("-----------------------------");
        System.out.println("[+] - 1");
        System.out.println("[-] - 2");
        System.out.println("[x] - 3");
        System.out.println("[/] - 4");
        System.out.println("[√] - 5");
        System.out.println("[salir] - 6");
        System.out.println("-----------------------------");

        if (teclas.hasNextInt()) {
            modo = teclas.nextInt();
        } else {
            System.out.println(" INTRODUCE UN NÚMERO, NO LETRAS <3");
            return;
        }
        if(modo<5){
            System.out.println("INTRODUCE OTRO NUMERO   ");
            if (teclas.hasNextDouble()){
                num2 = teclas.nextDouble();
            }else {
                System.out.println("EL SEGUNDO VALOR NO ES UN NUEMRO ");
            }
        }



        switch (modo) {
            case 1:
                System.out.println("HAS ELEGIDO LA SUMA");
                double suma = num1 + num2;
                System.out.println("LA SUMA DE " + num1 + " + " + num2 + " = " + suma);

                break;
            case 2:
                System.out.println("HAS ELEGIDO LA RESTA");
                double resta = num1 - num2;
                System.out.println("LA RESTA DE " + num1 + " - " + num2 + " = " + resta);

                break;
            case 3:
                System.out.println("HAS ELEGIDO LA MULTIPLICACIÓN");
                double multi = num1 * num2;
                System.out.println("LA MULTIPLICACION DE " + num1 + " x " + num2 + " = " + multi);

                break;
            case 4:
                System.out.println("HAS ELEGIDO LA DIVISIÓN");
                if (num2==0) {
                    System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
                    return;
                } else {
                    double division = num1/num2;
                    System.out.println("LA DIVISION DE "+num1+" / "+num2+" = "+division);
                }
                break;
            case 5:
                System.out.println("HAS ELEGIDO LA RAÍZ");
                if(num1<0){
                    System.out.println("NO SE PUEDE HACER RAICES DE NUMEROS NEGATIVOS");
                }else {
                    double raiz = Math.sqrt(num1);
                    System.out.println("LA RAIZ CUADRADA DE  " + num1 + " ES " + raiz);
                }

                break;
            case 6:
                System.out.println("Saliendo...");
                System.out.println("GRACIAS POR SU VISITA A LA MEJOR CALCULADORA");
                break;

            default:
                System.out.println("ELIGE UNA OPCION VALIDA (1-6) <3");


        }




    }
}