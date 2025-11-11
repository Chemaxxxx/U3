package u3;
import java.util.Scanner;

public class Ej2_3 {
    public static void main(String[] args) {
        Scanner Ej2_3 = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = Ej2_3.nextLine();

        int posicionCentral = frase.length() / 2;
        char caracterCentral = frase.charAt(posicionCentral);

        if (caracterCentral == ' ') 
            System.out.println("El carácter de la posición central es un espacio.");
         else 
            System.out.println("El carácter de la posición central no es un espacio.");
        

    }
}
