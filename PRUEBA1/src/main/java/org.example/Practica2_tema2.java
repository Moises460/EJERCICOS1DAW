import java.util.Scanner;

public class Practica2_tema2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String fecha = teclado.nextLine();


        if (fecha.length() == 10 &&
                // ACEPTA TANGTO '/' COMO '-'
                ((fecha.charAt(2) == '/' && fecha.charAt(5) == '/') || (fecha.charAt(2) == '-' && fecha.charAt(5) == '-'))) {

            try {
                int dia = Integer.parseInt(fecha.substring(0, 2));
                int mes = Integer.parseInt(fecha.substring(3, 5));             //SEPARA LS FRCHS RN DIA MES Y AÑO
                int anyo = Integer.parseInt(fecha.substring(6, 10));

                if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
                    int total = dia + mes + anyo;

                    System.out.println(fecha + " = " + total);

                    String Suerte = Integer.toString(total);

                    int cifra1 = Integer.parseInt(Suerte.substring(0, 1));
                    int cifra2 = Integer.parseInt(Suerte.substring(1, 2));
                    int cifra3 = Integer.parseInt(Suerte.substring(2, 3));      //LEE CADA CIFRA DE LA SUMA TOTAL PARA HACER LA SUMA
                    int cifra4 = Integer.parseInt(Suerte.substring(3, 4));

                    int total2 = cifra1 + cifra2 + cifra3 + cifra4;

                    System.out.println(cifra1 + "+" + cifra2 + "+" + cifra3 + "+" + cifra4 + " = " + total2);
                    System.out.println("Tu número de la suerte es el " + total2);
                } else {
                    System.out.println("ERROR: Introduce una fecha válida...");
                }

            } catch (Exception err) {
                System.out.println("ERROR: Introduce el formato correctamente...");
            }

        } else {
            System.out.println("ERROR: Introduce el formato correctamente...");
        }
    }
}
