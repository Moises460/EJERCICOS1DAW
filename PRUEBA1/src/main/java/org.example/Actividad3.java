import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        String num1 = teclas.next();

        // Convertimos el String a int
        int numero = Integer.parseInt(num1);

        // Ahora sí podemos compararlo
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo o cero.");
        }
    }
}











