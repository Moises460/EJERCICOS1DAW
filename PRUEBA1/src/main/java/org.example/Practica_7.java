import java.util.Scanner;

public class Practica_7 {
    static void main(){
        Scanner teclas= new Scanner(System.in);
        boolean repetir=false;
        int num1=0;
        int num2=0;

            num1= teclas.nextInt();
            num2= teclas.nextInt();

        String num_string= Integer.toString(num1);
        String num_izquierda = num_string.substring(0,1);
        String num_central = num_string.substring(1,2);
        String num_derecha = num_string.substring(2,3);

        int num_izquierda_int= Integer.parseInt(num_izquierda);
        int num_central_int= Integer.parseInt(num_central);
        int num_derecha_int= Integer.parseInt(num_derecha);

        String num_string2 = Integer.toString(num2);
        String num_izquierda2 = num_string2.substring(0,1);
        String num_central2 = num_string2.substring(1,2);
        String num_derecha2= num_string2.substring(2,3);

        int num_izquierda_int2= Integer.parseInt(num_izquierda2);
        int num_central_int2= Integer.parseInt(num_central2);
        int num_derecha_int2= Integer.parseInt(num_derecha2);

        int resulado= num2*num1;

        System.out.println(num_izquierda_int*123);
        System.out.println(num_izquierda_int);
        System.out.println(num_izquierda_int2);




    }
}
