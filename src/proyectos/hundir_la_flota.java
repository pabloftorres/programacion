package proyectos;

public class hundir_la_flota {
	
	private static int tamaño = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila, columna = 0;
		
		int tableA[][] = new int[tamaño][tamaño];
		int tableB[][] = new int[tamaño][tamaño];
		
		fila = Coordenada("Introdueix una coordenada");
		columna = Coordenada("Introdueix una coordenada");
		
		while (barcos <= 5) {
			tableA[columna][fila] = 1;
			barcos++;
			tablero(tableA);
		}
				
	}
	public static int Coordenada(String frase) {
		cLector lector = new cLector();
		
		System.out.print(frase);
				
		return lector.llegirEnter();
	}
	
	public static void tablero(int table[][]) {
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; 1 <= 5; j++) {
				System.out.print("| " + table[i][j] + " |");
			}
			System.out.println(" ");
		}
		
	}
}
