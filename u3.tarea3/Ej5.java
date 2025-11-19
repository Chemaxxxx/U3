package u3.tarea3;
import java.util.Arrays;
public class Ej5 {
	public static void main(String[] args) {
		int []cantidad = new int [6];
		
		cantidad [0] = 5;
		cantidad [1] = 3;
		cantidad [2] = 12;
		cantidad [3] = 4;
		cantidad [4] = 8;
		cantidad [5] = 1;
		
		Arrays.sort(cantidad);
		System.out.println(Arrays.toString(cantidad));
		
		
int []cantidad1 = new int [6];
		
		cantidad1 [0] = 90;
		cantidad1 [1] = 56;
		cantidad1 [2] = 24;
		cantidad1 [3] = 38;
		cantidad1 [4] = 98;
		cantidad1 [5] = 6;
		
		Arrays.sort(cantidad1);
		System.out.println(Arrays.toString(cantidad1));
		
		
		int[] fusion = new int[cantidad.length + cantidad1.length];

		for (int i = 0; i < cantidad.length; i++) {
		    fusion[i] = cantidad[i];
		}

		for (int i = 0; i < cantidad1.length; i++) {
		    fusion[cantidad.length + i] = cantidad1[i];
		}
		Arrays.sort(fusion);
		System.out.println(Arrays.toString(fusion));

	}

}
