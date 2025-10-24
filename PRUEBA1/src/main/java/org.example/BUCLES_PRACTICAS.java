import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BUCLES_PRACTICAS {

    static void main() {
        Scanner teclas=new Scanner(System.in);


      System.out.println("introduce numero");
       int N = teclas.nextInt();
       for (int i=N; i >=1 ; i--) {


          System.out.println(i);
       }


       System.out.println("introduce una aplabra");
       String palabra= teclas.next();
       int tamaño=palabra.length();
//     for (int i = 0; i < tamaño; i++) {
//          System.out.println(palabra.charAt(i)); //normal
//      }
        for (int i=tamaño-1; i<tamaño;i--) {
            //System.out.println(palabra.charAt(i)); //invertida
        }


        System.out.println("que tabla quieres?");
        int num2= teclas.nextInt();
        for (int j=0 ; j<11 ; j++){
           int resto=num2*j;
           System.out.println(num2+" x "+j+" = "+resto);
       }
//        int contador=0;
//         int num2=0;
//        System.out.println("cuantes veces lo quieres sumar");
//        int num= teclas.nextInt();
//        for (int i = 0; i <num ;i++) {
//
//                System.out.println("Instrduce numero "+i);
//                num2 = teclas.nextInt();
//                contador += num2;
//
//
//        }
//               System.out.println("TU RESULTADO DE LA SUMA ES "+contador);

//
//        int contador=1;
//        System.out.println("ELIGE UN NUEMRO PARA FACTORIZAR");
//         int num= teclas.nextInt();
//
//        for (int i = num; i <=0; i--) {
//
//              contador*=i;
//
//            System.out.println("TU RESULTADO ES"+i);
//
//        }
//
//        int a, b, c, d;
//
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = 0;
//        c = 1;
//
//        while(a!=0){
//            b++;
//            System.out.println(b);
//            c = c * a / b;
//            System.out.println(c);
//            a = sc.nextInt();
//        }
//
//        d = b + c;
//
//        System.out.println(d);

































    }
}
