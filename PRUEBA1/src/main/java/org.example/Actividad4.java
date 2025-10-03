import java.util.Scanner;

public class Actividad4 {
     static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);

        try {
            System.out.println("Introduce un numero:");
            int num1 = teclas.nextInt();
            System.out.println("Introduce otro numero:");
            int num2 = teclas.nextInt();
            System.out.println("Introduce otro numero:");
            int num3 = teclas.nextInt();

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
