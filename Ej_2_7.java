package u3;

import java.util.Scanner;
public class Ej_2_7 {
	
	
	public static boolean acierto (String clave1, String clave2) {
		
	if (clave1.equals(clave2))
		return true;
		else
			return false;
		
		
	}
	
	public static void(String clave1, String clave2) {
		
		
		String mayor = "";
		if (clave1.length() > clave2.length()) {
			System.out.println("La contraseña correcta es mas larga!");
			  mayor = clave1;
		}else if(clave1.length() < clave2.length()) {
			System.out.println("La contraseña correcta es mas corta!");
			mayor = clave2;
		}else
			System.out.println("Las contraseñas tienen la misma longitud!");
		
	}
	
	public static void main(String[] args) {
		
		Scanner Ej_7 = new Scanner (System.in);
		
		String clave1 = "";
		String clave2 = "";
		
		System.out.print("Usuario 1 introduce la contraseña:");
		clave1 = Ej_7.nextLine();
		
System.out.println("\n\nPistas para usuario 2:");
		
		
		System.out.println( "Numero de caracteres: " + clave1.length());
		System.out.println("Primera letra: " + clave1.charAt(0));
		System.out.println("Ultima letra: " + clave1.charAt(clave1.length()-1));
		
		System.out.print("Usuario 2 ¿Cual crees que es la contraseña?:");
		clave2 = Ej_7.nextLine();
		System.out.println("\n\n");
		
		
		while(!acierto(clave1, clave2)) {
		
		System.out.println("Fallaste!");
		longitud(clave1,clave2);
		System.out.println("\n Pistas para usuario 2:");
		System.out.println( "Numero de caracteres: " + clave1.length());
		System.out.println("Primera letra: " + clave1.charAt(0));
		System.out.println("Ultima letra: " + clave1.charAt(clave1.length()-1));
		
		System.out.print("Usuario 2 ¿Cual crees que es la contraseña?:");
		clave2 = Ej_7.nextLine();
		}
		
		System.out.println("Acertaste!");
		
	}

}


