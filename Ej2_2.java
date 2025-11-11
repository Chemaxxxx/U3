package u3;
import java.util.Scanner;

public class Ej2_2 {
    public static void main(String[] args) {
        Scanner Ej2_2 = new Scanner(System.in);
        String frase = "";
        String palabra = "";

        System.out.print("Escribe una palabra (o 'fin' para terminar): ");
        palabra = Ej2_2.nextLine();

        while (!palabra.equals("fin")) {
            frase = frase + palabra + " " ;
            System.out.print("Escribe otra palabra (o 'fin' para terminar): ");
            palabra = Ej2_2.nextLine();
        }

        System.out.println("La frase completa es: " + frase);
       
    }
}
