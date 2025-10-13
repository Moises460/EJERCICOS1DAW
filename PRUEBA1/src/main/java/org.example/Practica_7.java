import java.util.Scanner;

public class Practica_7 {
    static void main(){
        Scanner teclas= new Scanner(System.in);
        int num1=433;


        String num_string= Integer.toString(num1);
        String num_izquierda = num_string.substring(0,1);
        int num_izquierda_int= Integer.parseInt(num_izquierda);

        
        System.out.println(num_izquierda_int*123);


    }
}
