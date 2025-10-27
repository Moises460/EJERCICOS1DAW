import java.util.Scanner;

public class pruebas {
    static void main() {
        Scanner telca = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println(" INTRODUZCA ISBN PARA REPARAR ");
        System.out.println("------------------------------");
        String reparar = telca.next();
        String aceptar_mayus = reparar.toUpperCase();

        if (aceptar_mayus.length() != 10) {
            System.out.println("El ISBN debe tener 10 caracteres");
            return;
        }

        int suma = 0;
        int posSigno = -1; // posición del '?' si existe

        for (int i = 0; i < 10; i++) {
            char x = aceptar_mayus.charAt(i);
            int valor = 0;

            if (x == '?') {
                posSigno = i; // guardamos la posición a reparar
                continue; // dejamos para calcular después
            }

            if (i == 9 && x == 'X') {
                valor = 10;
            } else if (x >= '0' && x <= '9') {
                valor = x - '0';
            } else {
                System.out.println("Carácter inválido en la posición " + (i + 1));
                return;
            }

            int resta = 10 - i;
            suma += valor * resta;
        }

// Si hay un '?' se calcula el dígito faltante
        if (posSigno != -1) {
            for (int i = 0; i <= 10; i++) {
                int test = suma + i * (10 - posSigno);
                if (test % 11 == 0) {
                    System.out.println("El dígito correcto en la posición " + (posSigno + 1) + " es: " + (i == 10 ? "X" : i));
                    return;
                }
            }
            System.out.println("No se pudo reparar el ISBN");
        }
    }
}
