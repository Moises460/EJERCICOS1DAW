import java.util.Scanner;

public class Prueba1 {



    static void main(){


        int a = 1;
        int b = 3;
        int c = 5;
        int resultado = a++ == 3 && a > b++ ? a += b :
                            a > 0 && a == b ? a += c :
                                   b == c ? a-- : a++; //resultado=2;

        System.out.println(resultado);


        Scanner teclas= new Scanner(System.in);

        String frase="Viva españa y su gente<3";

        int tamanyo= frase.length();
        System.out.println(tamanyo);

        System.out.println(frase.charAt(17));

        String trozo=frase.substring(14,24);
        System.out.println(trozo);

        String trozo2 =frase.substring(5);
        System.out.println(trozo2);

        int posicion_españa=frase.indexOf("españa");
        System.out.println(posicion_españa);

        String frase_mayus= frase.toUpperCase();
        System.out.println(frase_mayus);
        String frase_minus = frase.toLowerCase();
        System.out.println(frase_minus);


        String nombre="Moises             ";
        System.out.println(nombre.trim() + " - " + nombre + "*");
        String nombre_mayus=nombre.toUpperCase();

        boolean iguales= nombre_mayus.trim().equals("MOISES");

        System.out.println(iguales);

        boolean iguales2=nombre.trim().equalsIgnoreCase("Moises");

        System.out.println(iguales2);


        String cambiado= frase.replace("españa","España");
        System.out.println(cambiado);




        if(teclas.hasNextInt()) {
            int numero = teclas.nextInt();
            System.out.println(numero);
        }

             System.out.println("elige dia de la seman");
             int dia_de_la_seman = teclas.nextInt();

               switch (dia_de_la_seman){

                   case 1:
                          System.out.println("Lunes");
                          break;
                   case 2:
                           System.out.println("Martes");
                          break;
                   case 3:
                          System.out.println("Miercoles");
                          break;
                   case 4:
                       System.out.println("Jueves");
                       break;
                   case 5:
                       System.out.println("Viernes");
                       break;
                   case 6:
                       System.out.println("Sabado");
                       break;
                   case 7:
                       System.out.println("Domingo");
                       break;

                   default:
                       System.out.println("intoduce un valor bueno del 1 al 7");
                             break;



               }





    }
}
