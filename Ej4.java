package u3;

public class Ej4 {

	public static int numero (int num1, int num2) {
		
		int mayor;
		
		if(num1 > num2)
			mayor = num1;
		else
			mayor = num2;
		
		return mayor;
		
	}
	
	public static void main(String[] args) {
		
		int comparacion = numero(10, 8);
		System.out.println("El número mayor es: " + comparacion);
		
		
	}
}
