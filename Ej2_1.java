package u3;
import java.util.Scanner;

public class Ej2_1 {
    public static void main(String[] args) {
        Scanner Ej2_1 = new Scanner(System.in);
        System.out.print("Escribe la primera palabra: ");
        String palabra1 = Ej2_1.next();
        System.out.print("Escribe la segunda palabra: ");
        String palabra2 = Ej2_1.next();

        if (palabra1.length() < palabra2.length()) {
            System.out.println("La palabra más corta es: " + palabra1);
        } else if (palabra2.length() < palabra1.length()) {
            System.out.println("La palabra más corta es: " + palabra2);
        } else {
            System.out.println("Las dos palabras tienen la misma longitud.");
        }

       
    }
}
