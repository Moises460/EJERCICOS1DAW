import java.util.Random;
import java.util.Scanner;

public class Practic_aleatrio2 {
    static void main() {
        Scanner teclas= new Scanner(System.in);

        Random rnd= new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contrasenya = "";

        for (int i=0;i<12;i++){
            contrasenya += caracteres.charAt(rnd.nextInt(caracteres.length()-1));

        }

        System.out.println(contrasenya);
    }
}
