import java.util.Scanner;

public class Practica2_tema2 {
    static void main() {
        Scanner teclas= new Scanner(System.in);

      System.out.println("Introduce tu fecha de nacimineto (dd/mm/aaaa)");
      String fecha=teclas.nextLine();
      String barra="/";






        fecha=fecha.replace(barra,"+");
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
