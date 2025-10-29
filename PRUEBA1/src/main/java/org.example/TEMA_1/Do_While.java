package TEMA_1;

import java.util.Scanner;

public class Do_While {
     static void main(){
         Scanner teclas = new Scanner(System.in);

         int num=0;

         boolean repetir= false;

         do{
             try{
                 System.out.println("introduce nuer0s");
                 num= teclas.nextInt();
                 repetir= false;

             }catch(Exception err){
                 System.out.println("INTRODUCE NUMERO!!!NO LETRAS,GRACIAS<3");
                 repetir= true;
             }
             teclas.nextLine();
         }while (repetir=true);
         System.out.println("estas bien");
     }
}
