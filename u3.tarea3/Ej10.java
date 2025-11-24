package u3.tarea3;
import java.util.Scanner;
import java.util.Arrays;
public class Ej10 {
	
	public static int rellenaPares(int []pares) {
		Scanner sc = new Scanner (System.in);
		int impar = 0;
		int i = 0;
		
		while(i<pares.length) {
			System.out.print("Introduce un numero par:");
			int numero = sc.nextInt();
			
			if(numero %2 == 0) {
				pares[i] = numero;
				i++;
			}
			else
				impar++;
		}
		
		return impar;	
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int [] pares = new int [5];
	int cantidadImpares = rellenaPares (pares);
	Arrays.sort(pares);
	System.out.println("Tabla de pares: " + Arrays.toString(pares));
	System.out.println("cantidad de impares desechados: " + cantidadImpares);
}
	
	

}
