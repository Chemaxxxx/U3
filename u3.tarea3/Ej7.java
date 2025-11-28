package u3.tarea3;
import java.util.Scanner;
public class Ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int trimestre = 3;
		int alumnos = 5;
		
		double[][] notas = new double [trimestre] [alumnos];
		
		
		for(int i=0; i<trimestre; i++) {
			for(int j = 0; j<alumnos; j++) {
				System.out.print("Introduce las notas del trimestre:");
				double nota = sc.nextDouble();
				notas[i][j] = nota;
			}
		}
		
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		for(int i = 0; i<alumnos; i++) {
			suma1+= notas[0] [i];
			suma2+= notas[1] [i];
			suma3+= notas[2] [i];
		}
		
		 int sumaAlumno1 = 0;
		 int sumaAlumno2= 0;
		 int sumaAlumno3= 0;
		 int sumaAlumno4 = 0;
		 int sumaAlumno5 = 0;
		for(int i = 0; i<trimestre;i++) {
			sumaAlumno1 += notas [i] [0];
			sumaAlumno2 += notas [i] [1];
			sumaAlumno3 += notas [i] [2];
			sumaAlumno4 += notas [i] [3];
			sumaAlumno5 += notas [i] [4];
			
			
			
		}
		
		 double media1 =  suma1/5;
		 double media2= suma2/5;
		 double media3 = suma3/5;
		 
		double  mediaAlumno1 = sumaAlumno1/3;
		double  mediaAlumno2 = sumaAlumno2/3;
		double  mediaAlumno3 = sumaAlumno3/3;
		double  mediaAlumno4 = sumaAlumno4/3;
		double  mediaAlumno5 = sumaAlumno5/3;
		 
		 System.out.println("La media del grupo en el  primer trimestre es de: " + media1);
		 System.out.println("La media del grupo en el  segundo trimestre es de: " + media2);
		 System.out.println("La media del grupo en el  tercer trimestre es de: " + media3);
		 
		 System.out.print("¿A cuál alumno le quieres calcular la media? (1-5): ");
		 int opcion = sc.nextInt();
		 
		   double mediaAlumno = (opcion == 1) ? mediaAlumno1 :
		        			    (opcion == 2) ? mediaAlumno2 :
		        				(opcion == 3) ? mediaAlumno3 :
		        				(opcion == 4) ? mediaAlumno4 :
		        			    (opcion == 5) ? mediaAlumno5 :
		                                            0.0;
		 
		while(mediaAlumno == 0.0) {
			System.out.print("Elige una opción válida(1-5):");
			  opcion = sc.nextInt();
			  
			   mediaAlumno = (opcion == 1) ? mediaAlumno1 :
				   			(opcion == 2) ? mediaAlumno2 :
				   			(opcion == 3) ? mediaAlumno3 :
				   			(opcion == 4) ? mediaAlumno4 :
				   			(opcion == 5) ? mediaAlumno5 :
				   								0.0;
			
		}
		System.out.println("La media del alumno elegido es de " + mediaAlumno);
	
	}

}
