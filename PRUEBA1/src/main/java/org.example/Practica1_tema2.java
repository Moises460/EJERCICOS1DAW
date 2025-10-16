import java.util.Scanner;

public class Practica1_tema2 {
    static void main() {
        Scanner teclas = new Scanner(System.in);
        boolean repetir = false;
        int num1 = 0;
        int num2 = 0;

        do {
            repetir = false;
            try {
                System.out.println( " Introduce el Multiplicando (3 cifras): ");
                num1 = teclas.nextInt();

                System.out.println( " Introduce el Multiplicador (3 cifras): ");
                num2 = teclas.nextInt();

                if (num1 > 999 || num1 < 100 || num1 < 0 || num2 > 999 || num2 < 100 || num2 < 0){
                    System.out.println( " ERROR: Los numeros deben de ser positivos y de exactamente 3 cifras ");
                    repetir = true;
                }

            }catch (Exception error){
                System.out.println(" ERROR: Introduce un formato correcto");
                teclas.nextLine();
                repetir = true;
            }


        }while (repetir);

        // Convertir a string
        String multiplicanding = Integer.toString(num1);
        String multiplicadoring = Integer.toString(num2);

        // Sacar las cifras del multiplicador
        int cifra1 = Integer.parseInt(multiplicadoring.substring(2,3));
        int cifra2 = Integer.parseInt(multiplicadoring.substring(1,2));
        int cifra3 = Integer.parseInt(multiplicadoring.substring(0,1));

        // Productos parciales
        int parcial1 = num1 * cifra1; // Unidades
        int parcial2 = num1 * cifra2; // Decenas
        int parcial3 = num1 * cifra3; // Centenas

        // Total
        int total = num1 * num2; // El Total final

        // Mostrar los resultados
        System.out.println();
        System.out.println("  " + num1);
        System.out.println(" x " + num2);
        System.out.println("_______");
        System.out.println("    " +""+ parcial1); // Unidades
        System.out.println("   " +"" +parcial2); // Decenas
        System.out.println("+ " +""+ parcial3); // Centenas
        System.out.println("________");
        System.out.println(" " + total); // El Total final

    }
}
