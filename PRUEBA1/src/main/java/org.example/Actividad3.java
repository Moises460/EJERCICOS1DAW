import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);
        final int cero = 0;
        System.out.println("Introduce un numero:");
        int numero = teclas.nextInt();


        // Ahora sí podemos compararlo
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            if (numero > 0) {
                System.out.println("el numero es positivo");
            } else {
                System.out.println("El número es cero ");
            }
        }
    }
}











