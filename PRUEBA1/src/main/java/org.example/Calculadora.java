import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner teclas= new Scanner(System.in);
        double modo=0;
        double num1=0;
        double num2=0;

        System.out.println("SELECIONE QUE QUIERE HACER");
        System.out.println("---------------------------");
        System.out.println("[+]-1");
        System.out.println("[-]-2");
        System.out.println("[x]-3");
        System.out.println("[/]-4");
        System.out.println("[√]-5");
        System.out.println("--------------------------");

        if (teclas.hasNext()){
            modo= teclas.nextDouble();
            return;
        }
        System.out.println(modo);
    }
}
