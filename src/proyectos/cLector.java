package proyectos;

import java.util.Scanner;

public class cLector {

	// Declarem una propietat privada perque no sigui 
	// accessible desde fora.
	private Scanner lector;
	
	// Constructor
	public cLector() {
		// Es fa la instancia del Scanner
		lector = new Scanner(System.in);
	}
	
	// Destructor
	protected void finalize () {
		lector.close();
	}
	
	// Llegim un enter, sobreCarrega primera
	public int llegirEnter(){
		int correcte = 0;
		
		while (!lector.hasNextInt()){
				lector.next();
				System.out.print("No es un enter. Introdueix un altre numero: ");
		}
		correcte=lector.nextInt();
		lector.nextLine();
		return correcte;
	}
	
	// Llegim un enter, sobreCarrega segona
	// permet indicar un texte que es mostrara en pantalla
	public int llegirEnter (String missatge){
		System.out.print(missatge);
		return llegirEnter();
	}
	
	// Llegim un string, sobreCarrega primera
	public String llegirString (){
		String frase = "";
		Scanner lector = new Scanner(System.in);
		
		frase=lector.nextLine();
		return frase;
	}		

	// Llegim un string, sobreCarrega segona
	// permet indicar un texte que es mostrara en pantalla
	public String llegirString (String missatge){
		System.out.print(missatge);
		return llegirString();
	}
	
	// Llegim un real, sobreCarrega primera
	public float llegirReal(){
		float correcte = 0;
		
		while (!lector.hasNextFloat()){
				lector.next();
				System.out.print("No es un enter. Introdueix un altre numero: ");
		}
		
		correcte=lector.nextFloat();
		lector.nextLine();
		return correcte;
	}
	
	// Llegim un enter, sobreCarrega segona
	// permet indicar un texte que es mostrara en pantalla
	public float llegirReal (String missatge){
		System.out.print(missatge);
		return llegirReal();
	}
	
}