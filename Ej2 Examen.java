package examenud3;

import java.util.Scanner;

public class Ej2 {

    // Función para rellenar la encuesta
    static void rellenaEncuesta(String[][] encuesta) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean fin = false;

        while (i < encuesta.length && !fin) {
            System.out.print("Introduce código postal (o fin para terminar): ");
            String codigoPostal = sc.nextLine();

            if (codigoPostal.equalsIgnoreCase("fin")) {
                fin = true;
            } else {
                System.out.print("Introduce edad: ");
                String edad = sc.nextLine();

                System.out.print("Introduce sexo (M/F): ");
                String sexo = sc.nextLine();

                encuesta[i][0] = codigoPostal;
                encuesta[i][1] = edad;
                encuesta[i][2] = sexo;

                i++;
            }
        }
    }

    // Función para mostrar los resultados
    static void muestraResultados(String[][] encuesta) {
        System.out.println("--- Resultados de la encuesta ---");
        for (int i = 0; i < encuesta.length; i++) {
            if (encuesta[i][0] != null) { // solo se muestra las filas 
                System.out.println("Código Postal: " + encuesta[i][0] + ", Edad: " + encuesta[i][1] +  ", Sexo: " + encuesta[i][2]);
                                   
            }
        }
    }
    
    public static void main(String[] args) {
		
    	String[][] encuesta = new String[500][3];

        // Rellenar encuesta
        rellenaEncuesta(encuesta);
        // Mostrar resultados
        muestraResultados(encuesta);
	}
}
