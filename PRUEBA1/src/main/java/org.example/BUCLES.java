

import java.util.Scanner;

public class BUCLES {
    static void main() {
        Scanner teclas= new Scanner(System.in);

        int j;
        for (j=10  ; j>4 ; j-=2){
            System.out.println("traza " +j);
        }
            System.out.println("valor final"+j);




//        do{
//            String contraseña="admin1234";
//            System.out.println("Introduce una contraseña");
//            String respuesta= teclas.next();
//            if(respuesta.equals(contraseña)){
//                System.out.println("Contraseña correcta");
//                break;
//            }
//            System.out.println("Contarseña incorrecta");
//        }while (true);
//
//
 //        while (true){
//            System.out.println("Introde salir en caso de quere salir");
//            String recoger=teclas.next();
//
//            if(recoger.equals("salir")){
//                System.out.println("Saliendo.....");
//                break;
//            }
//            if(recoger.equals("anulado")){
//                continue;
//            }
//
//                System.out.println(recoger+" GOL");
//
//        }


        for(int i=0;i<20;i++){

            if(i % 5==0){
                continue;
            }
            System.out.println(i);



        }













    }
}
