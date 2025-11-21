package u3.tarea3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Ej4 {
	
	public static boolean acierto (int [] intento, int [] clave) {
		
		
		if (intento.length != clave.length) {
	        return false; 
	    }
		for(int i = 0; i<intento.length; i++) {
			if(intento [i] != clave [i] )
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Random rand = new Random ();
		
		System.out.print("¿Cuántos dígitos tiene tu clave?");
		int cantidad = sc.nextInt();
		
		int [] clave = new int [cantidad];
		
		for(int i = 0; i< clave.length; i++) {
			clave [i] = rand.nextInt(5) + 1;
		}
		
		System.out.println("Clave: " + Arrays.toString(clave));
		
		System.out.print("Jugador 2, introduce tu intento:");
		
		String  prueba = sc.next();
		int[]intento = new int  [prueba.length()];
		
		for(int i = 0; i< prueba.length(); i++) {
			intento [i] = Character.getNumericValue(prueba.charAt(i));
		}
		
		while (intento.length != clave.length) {
			System.out.println("La clave debe de ser de " +  clave.length + " dígitos" );
			System.out.print("Introduzca de nuevo la contraseña:");
			 prueba = sc.next();
			  intento = new int [prueba.length()];
			for(int i = 0; i< prueba.length(); i++) {
			intento [i] = Character.getNumericValue(prueba.charAt(i));
		
			}
				
		}
		
		while (!acierto(intento, clave)) {
			
			System.out.println("\n\n Pistas Usuario");
			
			for (int i = 0; i<intento.length;i++)
			if(intento [i] < clave [i])
				System.out.println(intento [i] + " es menor que el número correcto");
			else if (intento [i] > clave [i])
				System.out.println(intento[i] + " es mayor que el número correcto");
			else
				System.out.println("Los números coinciden");
			
			System.out.print("Introduzca de nuevo la contraseña:");
			 prueba = sc.next();
			  intento = new int [prueba.length()];
			for(int i = 0; i< prueba.length(); i++) {
			intento [i] = Character.getNumericValue(prueba.charAt(i));
		
			}
			
			
			
			
			while (intento.length != clave.length) {
				System.out.println("La clave debe de ser de " +  clave.length + "dígitos" );
				System.out.print("Introduzca de nuevo la contraseña:");
				 prueba = sc.next();
				  intento = new int [prueba.length()];
				for(int i = 0; i< prueba.length(); i++) {
				intento [i] = Character.getNumericValue(prueba.charAt(i));
			
				}
					
			}
			
			
			
		}
		
		System.out.println("Acertaste!!");
		
	}

	

}
