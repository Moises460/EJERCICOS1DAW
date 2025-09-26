
import java.util.Scanner;


class Bateriadepoblemas {

    static void main() {

         final int jornada_sin_extras=40;
         final double plus_tarifa=1.5;

        Scanner teclas = new Scanner(System.in);

        System.out.println("Pon tu NicKname");//esto es el esrcibir
        String NOMBRE= teclas.next();

        System.out.println("escribe las horas");
        double HORAS = teclas.nextDouble();

        System.out.println("escribe la tarifa");
        double TARIFA = teclas.nextDouble();

        double SALARIO;

        if (HORAS > jornada_sin_extras) {
            double horasExtras = HORAS - jornada_sin_extras;
            SALARIO = jornada_sin_extras * TARIFA + horasExtras * TARIFA * plus_tarifa;
        } else {
            SALARIO  = HORAS * TARIFA;
        }


        System.out.println( NOMBRE + " tu salario es "+ SALARIO+"€");




    }

}