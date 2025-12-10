package retoud3.parte2;
import java.util.Random;
import java.util.Scanner;

public class QuienEsQuien {
    
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    
    // Objetos del juego
    String [] objetos = {"perro", "gato", "pez", "oso"};
    
    // Características de cada objeto (mismo índice que objetos)
    String [][] caracteristicas = {
            {"ladra", "corre", "bosteza"},   // perro
            {"maulla", "rasca"},             // gato
            {"nada", "canta"},               // pez
            {"gruñe", "corre"}               // oso
    };
    
    // Elige un objeto secreto al azar
    public  int elegirObjetoSecreto() {
        return rand.nextInt(objetos.length);
    }
    
    public  boolean tieneCaracteristicas(int indiceObjeto, String caracteristicas [][]) {
    	for(String c : caracteristicas[indiceObjeto]) {
    		if(c.equals(caracteristicas));
    		return true;
    	}
    	return false;
    }
    
    public static void jugar() {
    	int secreto = elegirObjetoSecreto
    }
}

