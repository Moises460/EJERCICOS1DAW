import java.util.Scanner;

public class Actividad4 {
     static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);



           int num1 = 0;
           int num2 = 0;
           int num3 = 0;

        try {
            System.out.println("Introduce un numero:");
            num1 = teclas.nextInt();
            System.out.println("Introduce otro numero:");
            num2 = teclas.nextInt();
            System.out.println("Introduce otro numero:");
             num3 = teclas.nextInt();

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("ERROR");
            } else {
                if (num1 >= num2 && num1 >= num3) {
                    System.out.println("El número mayor es: " + num1);
                } else {
                    if (num2 >= num1 && num2 >= num3) {
                        System.out.println("El número mayor es: " + num2);
                    } else {
                        System.out.println("El número mayor es: " + num3);
                    }
                }

            }
                }catch(Exception err){
                System.out.println("INTRODUCE NUMERO!!!NO LETRAS,GRACIAS<3");
            }

    }
}
