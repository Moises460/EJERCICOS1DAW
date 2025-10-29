package TEMA_1;

import java.util.Scanner;

public class Actividad5 {

    static void main() {
        Scanner teclas= new Scanner(System.in);

        int num1=0;
        int num2=0;

        try{
        System.out.println("Introduce numero para divir");
            num1 = teclas.nextInt();
            num2 = teclas.nextInt();
        }catch (Exception err){
            System.out.println("INTRODUCE NUMERO!!!NO LETRAS,GRACIAS<3");
        }
       if(num2==0){
           System.out.println("NO PUEDES DIVIR ENTRE 0!!!!");
       }
        int resultado = num1 / num2;
       System.out.println("el resltado es " + resultado);
    }
}
