
import java.util.Random;
import java.util.Scanner;

public class Prueba_randm {
    static void main() {
        Scanner teclas= new Scanner(System.in);

        Random rnd=new Random();

        int aleatorio=rnd.nextInt();
        System.out.println(aleatorio);

        aleatorio=rnd.nextInt(100);
        System.out.println(aleatorio);

        float ale=rnd.nextFloat();
        System.out.println(ale);

        double ale2=rnd.nextDouble();
        System.out.println(ale2);

        long ale3=rnd.nextLong();
        System.out.println(ale3);

        boolean ale4=rnd.nextBoolean();
        System.out.println(ale4);

        aleatorio = rnd.nextInt(100) + 1;
        System.out.println(aleatorio);

        aleatorio = (int) rnd.nextFloat()*100 + 1;
        System.out.println(aleatorio);

        ale2 = Math.random();
        System.out.println(ale2);

        aleatorio = (int) Math.random()*10 + 1 ;
        System.out.println(aleatorio);


         String random= String.valueOf(rnd.nextFloat());
        System.out.println( random);
    }
}
