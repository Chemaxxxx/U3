package u3.tarea3;
import java.util.Scanner;
public class Ej3 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
	
	int sumaPositivos = 0;
	int sumaNegativos = 0;
	int positivos = 0;
	int negativos = 0;
	int ceros = 0;
	
	System.out.print("¿Cuantos numeros quieres introducir?:");
	int numeros = sc.nextInt();
	
	int cantidad [] = new int [numeros];
	
	for(int i = 0; i<cantidad.length; i++){
		System.out.print("Introduce numero:");
		cantidad[i] = sc.nextInt();
		if(cantidad[i] > 0) {
			sumaPositivos+=cantidad[i];
			positivos++;
		}
		else if(cantidad [i] < 0) {
			sumaNegativos += cantidad[i];
			negativos++;
		}else
			ceros++;
	}
	

	
	double mediaPositivos = (positivos > 0) ? sumaPositivos / positivos : 0.0;
	double mediaNegativos = (negativos > 0) ? sumaNegativos / negativos : 0.0;
	
	System.out.println("La media de los numeros positivos es " + mediaPositivos);
	System.out.println("La media de los numeros negativos  es " + mediaNegativos);
	System.out.println("Numero de ceros: "+ ceros);

}
}
