package u3;

import java.util.Scanner;

public class Ahorcado {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final String SECRETA="Sol"; 	//Palabra secreta. Observa que es de tipo String y como tal le aplican los métodos de String
	final int MAX_INTENTOS=10;
	boolean acertado=false;
	int intentos=0;						// Total de intentos realizados
	char letra; 						// letra que introduce el usuario en cada intento
	int cuantasSinAcertar;
	boolean encontrada = false;
	// Permite controlar cuantas letras me quedan por acertar
	
	// Variable para almacenar las letras que vamos descubriendo
	// La inicializamos con el tamaño de la palabra secreta (a los arrays siempre hay que darles un tamaño inicial)
	char [] palabra=new char[SECRETA.length()];
	
	// La rellenamos con un punto por cada letra a acertar 
	for (int i=0;i<SECRETA.length();i++)
		palabra[i]='.';
		
	// Pedimos letra al usuario mientras no acierte o queden intentos
	
	do {
		
		System.out.print("Introduce una letra:");
		letra = sc.next().charAt(0);
		intentos++;
		
		if (SECRETA.equals(palabra))
			acertado = true;
		
		for (int i=0;i<SECRETA.length();i++) {
			if(letra == SECRETA.charAt(i)){
			palabra [i]  = SECRETA.charAt(i);
			encontrada = true;
			}
		}
		System.out.println(palabra);

		cuantasSinAcertar = 0;
                if (palabra[i] == '.') {
                    cuantasSinAcertar++;
                }
            
		if (!encontrada)
			System.out.println("Te quedan " + (MAX_INTENTOS - intentos) + " intentos"  );

		    if(String valueOf(palabra).equals(SECRETA)
				acertado = true;
		
	}while(!acertado && intentos < MAX_INTENTOS );
	
	
	
	
	//COMPLETAR AQUI!!
	
	
	if (acertado)
		System.out.println("Acertaste!!");
	else
		System.out.println("Te has quedado sin intentos!!");
	}

}


