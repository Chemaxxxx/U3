package u3.tarea3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Ej9 {

    
    public static int primitiva(int[] ganadores, int[] apuesta) {

        int premiados = 0;

        for (int i = 0; i < apuesta.length; i++) { 
            for (int j = 0; j < ganadores.length; j++) { 
                if (apuesta[i] == ganadores[j]) { 
                    premiados++;
                }
            }
        }

        return premiados;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ganadores = new int[6];
        for (int j = 0; j < ganadores.length; j++) {
            ganadores[j] = (int) (Math.random() * 50);
        }
        
        System.out.println("Numeros ganadores: " + Arrays.toString(ganadores));

        int[] apuesta = new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            apuesta[i] = (int) (Math.random() * 50);
        }
        System.out.println("Numeros comprados: " + Arrays.toString(apuesta));


        int premio = primitiva(ganadores, apuesta);

        System.out.println("Número de premiados: " + premio);

        
    }
}

