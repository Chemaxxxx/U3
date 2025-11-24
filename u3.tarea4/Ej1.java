package u3.tarea4;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		Random r = new Random ();
		Scanner sc = new Scanner (System.in);
		
		int [] destacado = new int [100];
		int menor = 0;
		for( int i = 0; i< destacado.length; i++) {
			destacado [i] = r.nextInt(500) + 1;
		}
		
		menor = destacado[0];
		
		for(int i = 0; i<destacado.length; i++) {
			if(destacado[i] < menor)
				menor = destacado [i];
		}
		
		
		System.out.println(Arrays.toString(destacado));
	
		System.out.println("¿Qué quieres detacar? 1.Minimo 2.Máximo:");
		char opcion = sc.next().charAt(0);
		
		if(opcion =='1') {
			for(  int i = 0; i<destacado.length; i++) {
				if(destacado [i] == menor )
					System.out.print("** " + destacado[i] + " **");
				else
					System.out.print(destacado [i] + " ");
			}
		}
		
			
			
	}

	}

