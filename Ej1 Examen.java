package examenud3;
import java.util.Scanner;

class DNIInvalidoException extends Exception {
  public DNIInvalidoException(String mensaje) {
   super(mensaje);
    		}
}

public class Ej1 {
	
	public static String leerDNI() throws DNIInvalidoException {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Introduce el DNI (8 números y una letra): ");
	    String dni = sc.nextLine().trim();
       // valida el dni
	    if (!dni.matches("^\\d{8}[a-zA-Z]$")) {
	        throw new DNIInvalidoException("Formato de DNI invalido,  debe ser 8 números y una letra");
	    		}
	    
	    return dni;
}
	
	public static String cambiarDigito(String dni, int posicion, char nuevoValor)
	        throws DNIInvalidoException {
		
		if (posicion < 1 || posicion > 8) 
	        throw new DNIInvalidoException("La posición debe estar entre 1 y 8");
	
		if (!Character.isDigit(nuevoValor)) 
	        throw new DNIInvalidoException("El nuevo valor debe ser un numero");
		
		char[] caracteres = dni.toCharArray();
		caracteres[posicion - 1] = nuevoValor;   
		
		 caracteres[8] = Character.toUpperCase(caracteres[8]);

		    return new String(caracteres);

	}
	
	public static void main(String[] args) {
		
		try { //verifica si los datos de las funciones son correctos sino lanza excepcion
			 String dni = leerDNI();
	            System.out.println("DNI válido: " + dni.toUpperCase());
	            String nuevo = cambiarDigito(dni, 3, '9');
	            System.out.println("DNI modificado: " + nuevo); 
		} catch(DNIInvalidoException e) {
			System.out.println("Error: " + e.getMessage());
		}
           
	}
}
