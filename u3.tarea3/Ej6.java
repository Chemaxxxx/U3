package u3.tarea3;

import java.util.Arrays;
import java.util.Scanner;
public class Ej6 {
	
public  static int []sinRepetidos (int[]t){
	
Arrays.sort(t);
	
	int cont = 1;
	
	for(int i= 1; i<t.length; i++) {
		if(t[i] != t[i-1]) 
			cont ++;
		
			
		}
	
	
	int []sinRep = new int [cont];
	
	sinRep[0] = t[0];
	int k = 1;
	
	for(int i= 1; i<t.length ; i++) {
		if(t[i] != t[i-1]) {
			sinRep[k] = t[i];
			k++;
		}
		
			
		}
	
	return sinRep;
	
	}

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.print("Introduce cantidad de numeros:");
	int  numeros = sc.nextInt();
	
	int []t = new int [numeros];
	
	for(int i = 0; i < t.length;i++) {
		System.out.print("Introduce numero:");
		t[i] = sc.nextInt();
	}
	
	 int resultado[] = sinRepetidos(t);
	 
	 System.out.println("Sin repetir: " + Arrays.toString(resultado));
	
	}


	
	
}


