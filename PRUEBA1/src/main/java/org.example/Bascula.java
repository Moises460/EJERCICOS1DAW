import java.util.Scanner;

public class Bascula {

    static void main(String[] args) {
        Scanner teclas = new Scanner(System.in); //sacener de teclas

        final double peso_max = 120;      //Eston son las variables /constantes
        final double altura_max = 210;
        final double altura_min = 140;
        double altura = 0;
        double peso = 0;

        boolean repetir = false;       //funcionamiento para el {Do {While
        do {

            try {                                                          //Linea de try catch- aki se comprueba que se ecriban valores numericos
                System.out.println("BIENVENIDO AL RATON JUGUETON");
                System.out.println("Leyendo altura  (cm)");
                altura = teclas.nextInt();
                repetir = false;
            } catch (Exception err) {
                System.out.println("porfavor NUMEORS NO LETRAS");
                repetir = true;
            }
            teclas.nextLine();

        } while (repetir == true);

        double resultado1 = altura_min - altura;                                     //Calculo de la altura minima
        if (altura < altura_min) {                                                    // estas son las lineas para hacer la comprobacion de altura
            System.out.println("Lo sineto,no cumples la altura minima:( Te faltan " + resultado1 + "cm");
        } else {
            if (altura > altura_max) {
                System.out.println("Lo sineto,superas la altura MAX");
            } else {
                do {
                    try {
                        System.out.println("Leyendo Peso (Kg)");
                        peso = teclas.nextInt();
                        repetir = false;
                    } catch (Exception err) {
                        System.out.println("porfavor NUMEORS NO LETRAS");
                        repetir = true;
                    }
                    teclas.nextLine();
                } while (repetir == true);

                double peso_min = altura * 2 / 8;                                               // Calculo del peso minimo
                double resltado2 = peso - peso_max;


                if (peso < peso_min) {

                    if (peso < peso_min) {                                                             //estan lineas son para hacer la comprobacion de peso
                        System.out.println("No puedes subir porque pesas menos de " + peso_min);
                    } else {
                        if (peso > peso_max) {
                            System.out.println("No puedes subir porque sobrepas  " + resltado2 + "kg el limite de la atraccíon");
                        } else {
                            System.out.println("Pesas " + peso + " kg .El peso minimo calculado: " + peso_min);
                            System.out.println("¡¡PUDES SUBIRTE!!");
                        }
                    }


                }
            }


        }
    }
}0