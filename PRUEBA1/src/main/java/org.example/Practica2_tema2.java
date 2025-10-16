import java.util.Scanner;

public class Practica2_tema2 {
    static void main() {
        Scanner teclas= new Scanner(System.in);
        boolean repetir;
        String fecha;

        do {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
            fecha = teclas.nextLine();

            if (fecha.matches("\\d{2}[/-]\\d{2}[/-]\\d{4}")) {
                fecha = fecha.replace("/", "+").replace("-","+");
                repetir = false;
            } else {
                System.out.println(" PORFAVOR COMO DICE ARRIBA<3");
                repetir = true;
            }
        } while (repetir);

        fecha = fecha.replace("/", "+").replace("-","+");



      int  dia=Integer.parseInt(fecha.substring(0,2));
      int  mes=Integer.parseInt(fecha.substring(3,5));
      int  año=Integer.parseInt(fecha.substring(6,10));

      int total=dia+mes+año;

      System.out.println(fecha+" = "+total);

      String Suerte=Integer.toString(total);

      int cifra1 =Integer.parseInt(Suerte.substring(0,1));
      int cifra2 =Integer.parseInt(Suerte.substring(1,2));
      int cifra3 =Integer.parseInt(Suerte.substring(2,3));
      int cifra4 =Integer.parseInt(Suerte.substring(3,4));



      int total2=cifra1+cifra2+cifra3+cifra4;

      System.out.println(cifra1+"+"+ cifra2+"+"+cifra3+"+"+cifra4+" = "+total2 );
      System.out.println("Tu numero de la suerte es "+total2);





















    }
}
