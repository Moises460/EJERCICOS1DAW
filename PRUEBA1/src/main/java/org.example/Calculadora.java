import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner teclas= new Scanner(System.in);
        int modo;
        double num1=0;
        double num2=0;

            System.out.println("--------CALCULADORA--------");
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
                modo = teclas.nextInt();  //  lee el número correctamente
            } else {
                System.out.println(" INTRODUCE UN NÚMERO, NO LETRAS <3");
                teclas.next(); // descarta formato inocorrecto no válida
                 return;
            }

            switch (modo) {
                case 1:    //la case 1 hace la suma del num1 y num2, tiene implementado un control de formatos incorrctos(letras)
                    System.out.println("HAS ELEGIDO LA SUMA");
                    System.out.println("INTRODUCE NÚMEROS PARA SUMAR");

                    if (teclas.hasNextDouble()) {
                        num1 = teclas.nextDouble();
                        System.out.println("INTRODUCE OTRO NUMERO PARA SUMAR");

                        if (teclas.hasNextDouble()) {
                             num2 = teclas.nextDouble();
                            double suma = num1 + num2;
                            System.out.println("LA SUMA DE " + num1 + " + " + num2 + " = " + suma);
                        } else {
                            System.out.println("EL SEGUNDO VALOR NO ES UN NÚMERO ");
                        }
                    } else {
                        System.out.println("EL PRIMER VALOR NO ES UN NÚMERO ");
                    }
                    break;
                case 2:
                    System.out.println("HAS ELEGIDO LA RESTA");
                    System.out.println("INTRODUCE NUMEROS PARA RESTAR");

                    if(teclas.hasNextDouble()){
                        num1= teclas.nextDouble();
                        System.out.println("INTRODUCE OTRO NUEMRO PARA RESTAR");
                        if (teclas.hasNextDouble()) {
                            num2 = teclas.nextDouble();
                            double resta = num1 - num2;
                            System.out.println("LA RESTA DE " + num1 + " - " + num2 + " = " + resta);
                        }else {
                            System.out.println("EL SEGUNDO VALOR NO ES UN NÚMERO");
                        }
                    }else {
                        System.out.println("EL PRIMER VALOR NO ES UN NÚMERO");
                    }
                    break;
                case 3:
                    System.out.println("HAS ELEGIDO LA MULTIPLICACIÓN");
                    System.out.println("INTRODUCE NUMEROS PARA MULTIPLICAR");

                    if(teclas.hasNextDouble()){
                        num1= teclas.nextDouble();
                        System.out.println("INTRODUCE OTRO NUEMRO PARA MULTIPLICAR");

                        if(teclas.hasNextDouble()) {
                            num2 = teclas.nextDouble();
                            double multi = num1 * num2;
                            System.out.println("LA MULTIPLICACION DE " + num1 + " x " + num2 + " = " + multi);
                        }else {
                            System.out.println("EL SEGUNDO VALOR NO ES UN NÚMERO");
                        }
                    }else {
                        System.out.println("EL PRIMER VALOR NO ES UN NÚMERO");
                    }
                    break;
                case 4:
                    System.out.println("HAS ELEGIDO LA DIVISIÓN");
                    System.out.println("INTRODUCE UN NUEMRO PARA DIVIR");

                    if(teclas.hasNextDouble()){
                        num1= teclas.nextDouble();
                        System.out.println("INTRODUCE OTRO NUMERO PARA DIVIDIR(QUE NO SEA 0)");
                        if(teclas.hasNextDouble()) {
                            num2 = teclas.nextDouble();
                        }else {
                            System.out.println("EL SEGUNDO VALOR NO ES UN NÚMERO");
                        }
                    }else {
                        System.out.println("EL PRIMER VALOR NO ES UN NÚMERO");
                    }
                    if (num1 == 0 || num2==0) {
                        System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
                        return;
                    } else {
                        double division = num1/num2;
                        System.out.println("LA DIVISION DE "+num1+" / "+num2+" = "+division);
                    }
                    break;
                case 5:
                    System.out.println("HAS ELEGIDO LA RAÍZ");
                    System.out.println("INTRODUCE UN NUMERO PARA REALIZAR LA RAIZ");

                    if(teclas.hasNextDouble()){
                        num1= teclas.nextDouble();
                        if(num1<0){
                            System.out.println("NO SE PUEDE HACER RAICES DE NUMEROS NEGATIVOS");
                        }else {
                            double raiz = Math.sqrt(num1);
                            System.out.println("LA RAIZ CUADRADA DE  " + num1 + " ES " + raiz);
                        }
                    }else {
                        System.out.println("SOLO NUMEROS<3");
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
