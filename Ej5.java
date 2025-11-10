package u3;

public class Ej5 {
	
public static int numero (int num1, int num2, int num3) {
		
		int mayor;
		
		if(num1 > num2)
			mayor = num1;
		else
			mayor = num2;
		
		if(num3> mayor)
			mayor = num3;
		
		return mayor;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int comparacion = numero(10, 5,22);
		System.out.println("El número mayor es: " + comparacion);
		
		
	}
}



