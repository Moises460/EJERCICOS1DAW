import java.util.Scanner;

public class Practica4_tema2 {
    static void main() {
        Scanner teclas= new Scanner(System.in);



        String texto="Hola mundo,benvendio al mundo,viva este mundo  mundo mundo";
        String palabra="mundo";

        texto=texto.toUpperCase();
        palabra=palabra.toUpperCase();



        int Contadar_mundo=texto.length();
        int Contar_palabra=palabra.length();
        texto=texto.replace(palabra,"");
        int texto_nuevo=texto.length();
        int veces=(Contadar_mundo-texto_nuevo)/(Contar_palabra);
        System.out.println(veces);

    }
}
