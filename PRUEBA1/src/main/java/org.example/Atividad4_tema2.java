import java.time.LocalDateTime;
import java.util.Scanner;

public class Atividad4_tema2 {
    static void main() {
        Scanner teclas = new Scanner(System.in);
        int modo = 0;
        final int AÑO_MIENTO = 1900;

        LocalDateTime fecha = LocalDateTime.now();
        int año_actual = fecha.getYear();
        int anyo_nacimiento_int = 0;

        System.out.println("ELIGE UN MODO");
        System.out.println("[1] + Año de naciemiento");
        System.out.println("[2] + EDAD");
        System.out.println("-----------------------------");

        if (teclas.hasNextInt()) {
            modo = teclas.nextInt();
        } else {
            System.out.println("INTODUCE UN VALOR NUMERICO<3");
        }

        switch (modo) {

            case 1:

                System.out.println("Introduce tu año de nacimiento...");
                String anyo_nacimiento = teclas.next();

                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                } catch (Exception e) {
                    System.out.println("El formato introducido para el año no es correcto.");
                    return;
                }
                break;
            case 2:
                int edad = 0;
                System.out.println("Introduce tu edad...");
                if (teclas.hasNextInt()) {
                    edad = teclas.nextInt();
                } else {
                    System.out.println("Formato incorrecto. No es numérico.");
                    return;
                }
                break;

            default:
                System.out.println("El modo no existe!");
                return;

        }

           if (anyo_nacimiento_int >= AÑO_MIENTO && anyo_nacimiento_int <= año_actual) {

            if (anyo_nacimiento_int <= 1927) {
                System.out.println("Generacion no bautizada");
            } else if (anyo_nacimiento_int <= 1928 && anyo_nacimiento_int <= 1944) {
                System.out.println("Generación Silent");
            } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                System.out.println("Baby Boomer");
            } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                System.out.println("Generación X");
            } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                System.out.println("Millenials la mejor");
            } else {
                System.out.println("Generación Z");
            }

        }

    }
}

