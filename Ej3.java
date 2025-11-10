package u3;

import java.util.Scanner;

public class Ej3 {
	
	public static void area (float radio, float altura, int opcion ) {
		
		final float PI = 3.14f;
		
		if (opcion == 1) {
			float area = 2* PI * radio *  (altura + radio);
			System.out.println("El area es " + area);
			
		} else if (opcion == 2) {
			float volumen = PI * radio * radio * altura;
			System.out.println("El volumen es " + volumen);
			
		}else
			System.out.println("Opción inválida, utiliza 1 para calcular el área y 2 para calcular el volúmen");
		
	}
	
	public static void main(String[] args) {
		Scanner Ej3 = new Scanner (System.in);
		
		System.out.print("Introduce el radio:");
		float radio = Ej3.nextFloat();
		
		System.out.print("Introduce la altura:");
		float altura = Ej3.nextFloat();
		
		System.out.print("¿Qué prefieres calcular? 1. Área 2. Volúmen:");
		int opcion = Ej3.nextInt();
		
		area (radio, altura, opcion);
	}

}
