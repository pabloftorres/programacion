package Activitats_metodes;

public class Hundir_la_flota {

	private static int tama�o = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila, columna = 0;
		
		int tableA[][] = new int[tama�o][tama�o];
		int tableB[][] = new int[tama�o][tama�o];
		
		
		System.out.println("Player1 et toca");
		
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			tableA[columna][fila] = 1;
			barcos++;
		}
		tablero(tableA);
		barcos = 0;
		
		System.out.println("Player2 et toca");
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			tableB[columna][fila] = 1;
			barcos++;
		}
		tablero(tableB);
		barcos = 0;
	}
	
	public static int Coordenada(String frase) {
		cLector lector = new cLector();
		
		System.out.print(frase);
				
		return lector.llegirEnter();
	}
	
	public static void tablero(int table[][]) {
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				System.out.print("| " + table[i][j] + " |");
			}
			System.out.println(" ");
		}
		
}
}
