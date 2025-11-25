package reto;


import java.util.Scanner;


//COMPLETAR JMGT
class GordoException extends Exception {
	public GordoException (String mensaje) {
		super (mensaje);
	}
}

public class LoteriaEquipo3 {	
	
	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
		//COMPLETAR
	}
	
	//devuelve un array de tamaño numPremios con todos los premios del sorteo
	public static String[] creaBomboPremios(int numPremios) {
		String[] bomboPremios = new String[numPremios];
		
		bomboPremios[0]="PRIMER PREMIO";  // gordo de navidad
		bomboPremios[1]="SEGUNDO PREMIO";	// un segundo premio
		
		//COMPLETAR
		
		// un tercer premio
		// dos cuartos premios

		// 8 quintos premios

		// el resto hasta completar 1.807 premios son "pedrea"
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		
		int numAgraciado = (int) (Math.random()*bombo.length);

		// si el número ya había salido, generamos otro al azar

		//COMPLETAR
		
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		bombo[numAgraciado]=-1;
		
		//COMPLETAR
	}
	
	//devuelve un premio al azar del bombo de premios
	//Si un premio ya ha salido, no debe volver a salir
	public static String damePremio(String[] bombo) {
		
		String premio;
		
		int indicePremiado = (int) (Math.random()*bombo.length);

		// si el premio ya había salido, generamos otro al azar
		//COMPLETAR
		
		// marcamos el premio que ha salido 
		//COMPLETAR
 				
		return premio;
	}
	
	
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado"; //valor por defecto
			
		//COMPLETAR

	}
	
	
	//Implementa un bucle para comprobar, haciendo uso del método heSidoAgraciado, si nuestro décimo tiene o no premio
	// Debe comprobar que se introducen exactamente 5 dígitos entre el 0 y el 9, por ejemplo 04544
	// Al introducir fin, finaliza la comprobación de décimos
	public static void compruebaDecimos(String[] numerosSorteo, String[] premiosSorteo) throws GordoException{
		Scanner sc=new Scanner(System.in);	
		String miDecimo;
		String miPremio="";
		boolean terminarDeComprobar=false;
		boolean numeroValido=false;
		
		System.out.println("\nCOMPROBACION DE DECIMOS:");
		
		//Compruebo si me ha tocado la lotería
		//JMGT
		System.out.println("Introduce un décimo (fin para terminar):");
		miDecimo = sc.nextLine();
		
		numeroValido = false;
		while(!terminarDeComprobar) {
			
			if(miDecimo.equals("fin"))
				terminarDeComprobar = true;
			while(!numeroValido) {
				char [] decimo = miDecimo.toCharArray();
				while(!numeroValido) {
				if(decimo.length == 5)
					numeroValido = true;
				else {
					System.out.println("El numero debe de tener 5 cifras!");
					System.out.println("Introduce un décimo (fin para terminar):");
					miDecimo = sc.nextLine();
				}
				
				if(numeroValido) {
					for (int i = 0; i< decimo.length; i++) {
						char p = decimo [i];
						if (p >= '0' && p <= '9')
							numeroValido = true;
						else {
							numeroValido = false;
							 System.out.println("Los dígitos deben estar entre 0 y 9!");
		                        System.out.print("Introduce un decimo(fin para terminar): ");
		                        miDecimo = sc.next();
						}
					}
				}
			}
				
			}
			
			miPremio = heSidoAgraciado(numerosSorteo, premiosSorteo, miDecimo);
			if(miPremio != "") {
				System.out.println("¡Enhorabuena! Tu décimo " + miDecimo + " tiene premio: " + miPremio);
				throw new GordoException ("Disfruta del premio!");
			}
			else
				System.out.println("Tu decimo " + miDecimo + " no ha sido premiado ");
			
			System.out.println("Introduce un decimo(fin para terminar: ");
			 miDecimo = sc.next();
		}
		System.out.println("Fin de la comprobación");
		
	}
				

	public static void main(String[] args) {
		
		final int MAX_NUMEROS=100000; // números del sorteo
		final int MAX_PREMIOS=1807;   // premios del sorteo
		
		int numeroAgraciado; //número que sale del bombo
		String premio=""; //premio que sale del bombo
		
				
		int[] bomboBolas = new int[MAX_NUMEROS];
		String[] bomboPremios = new String[MAX_PREMIOS];

		String[] listaNumerosSorteo = new String[MAX_PREMIOS]; // lista oficial de números que han salido en el sorteo
		String[] listaPremiosSorteo = new String[MAX_PREMIOS]; // lista oficial de premios que han salido en el sorteo
		
		try {
		
			//Creamos los bombos con sus bolas
			bomboBolas=creaBomboNumeros(MAX_NUMEROS);		
			bomboPremios=creaBomboPremios(MAX_PREMIOS);
			
			//Mostramos el listado completo de números premiados
			System.out.println("\nLISTADO OFICIAL DE PREMIOS:\n");
		
			int j=0;
			for (int i=0;i<MAX_PREMIOS;i++) {
				//Sacamos un número del bombo y lo rellenamos con ceros a la izquierda
				numeroAgraciado=dameNumero(bomboBolas);
				String numeroFormateado=String.format("%05d",numeroAgraciado);
			
				//Sacamos un premio del bombo
				premio=damePremio(bomboPremios);
				
				//Añado el número a la lista oficial del sorteo en la posición j
				listaNumerosSorteo[j]=numeroFormateado;
				
				//Añado el premio a la lista oficial del sorteo en la posición j
				//COMPLETAR
				
				j++;
				
				System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
			}
		
			compruebaDecimos(listaNumerosSorteo, listaPremiosSorteo);
				
			
		} 	//JMGT (capturar excepción propia)
		
		catch (GordoException e) {
				System.out.println("Error:"+e.getMessage());
				} finally {
					System.out.println("\nSorteo finalizado");			
				}		
	}
}