import java.util.Scanner;

public class Practica3_tema2 {
    static void main(){
        Scanner teclas= new Scanner(System.in);

        System.out.println("Introduce un nemro");
        int num= teclas.nextInt();
        System.out.println("¿¿que nuemero quiere eliminar??");
        int cifras= teclas.nextInt();

        String num_Strings= Integer.toString(num);
        int tamnyo= num_Strings.length();

        int nuevo_tamayo=tamnyo-cifras;


        String num_cortado= num_Strings.substring(0,nuevo_tamayo);

        System.out.println(num_cortado);



































    }
}
