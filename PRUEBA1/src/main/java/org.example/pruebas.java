import java.util.Scanner;

public class pruebas {
    static void main() {
        Scanner telca = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println(" INTRODUZCA ISBM PARA VALIDAR ");
        System.out.println("------------------------------");
         String validar = telca.next();
        String validar_mayus=validar.toUpperCase();
        int tamanyo = validar_mayus.length();
        if (tamanyo == 10) {

            int suma = 0;

            for (int i = 0; i < 10; i++) {
                char c = validar_mayus.charAt(i);
                int valor;

                // Si el último carácter es X → vale 10
                if (i == 9 && c == 'X') {
                    valor = 10;
                } else if (Character.isDigit(c)) {
                    valor = c - '0';
                } else {
                    System.out.println("Carácter inválido en la posición " + (i + 1));
                    return;
                }

                int resta = 10 - i;
                int resultado = valor * resta;
                suma += resultado;


            }

            System.out.println("Suma total: " + suma);

            if (suma % 11 == 0) {
                System.out.println(" El ISBN es válido.");
            } else {
                System.out.println("El ISBN no es válido.");
            }

        } else {
            System.out.println("TU NÚMERO NO ES CORRECTO. DEBE TENER 10 CARACTERES.");
        }




    }
}
