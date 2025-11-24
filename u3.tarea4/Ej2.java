package u3.tarea4;
import java.util.Scanner;
import java.util.Arrays;
public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String []palabra = new String [8];
		String []colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro","blanco"};
		String []encontrado = new String [8];
		String [] noEncontrado = new String [8];
		
		int k = 0;
		int m = 0;
		for(int i = 0; i<palabra.length; i++) {
			boolean esEncontrado = false;
			System.out.print("Introduce una palabra:");
			palabra [i] = sc.next();
			for(int j = 0; j<colores.length; j++) {
				if(palabra[i].equalsIgnoreCase(colores[j])) {
					encontrado[k] = palabra[i];
					k++;
					 esEncontrado = true;
				}
			}
			
			if(!esEncontrado) {
				noEncontrado [m] = palabra [i];
				m++;
				
			}
		}
		
		String []completo = new String [m+ k];
		int l = 0;
		
		for( int i = 0; i<k; i++) {
			completo [l]= encontrado [i];
			l++;
		}
		
		for (int i = 0; i< m; i++) {
			completo [l] = noEncontrado [i];
			l++;
		}
		
		System.out.println(Arrays.toString(completo));
	}
	

}
