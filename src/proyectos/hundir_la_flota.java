package proyectos;

public class hundir_la_flota {

	private static int tamaño = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila, columna = 0;
		
		int tableA[][] = new int[tamaño][tamaño];
		int tableB[][] = new int[tamaño][tamaño];
		
		
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

	public static int error(int table [][]) {
		cLector lector = new cLector();
		int fila = 0;
		int columna = 0;
		if (table[columna][fila] > 5) {
			System.out.println("Error, introdueix una coordenada que no sigui superior a 5");
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
		}
		return lector.llegirEnter();
	}
	public static void regles(int tableA[][],int tableB[][]) {
		String tocatM = null;
		int aigua;
		int voltant;
		
		for (int f = 1; f <= 10; f++) {

			for (int c = 1; c <= 10; c++) {
				if (tableA [f][c] == 1) {
					voltant = tableA[f-1][c] + tableA[f+1][c] + tableA[f][c+1] + tableA[f][c-1] + tableA[f-1][c-1] 
							+ tableA[f-1][c+1] + tableA[f+1][c+1] + tableA[f+1][c+1];
				}
				if(tableA[f][c] == 0) {
					System.out.println("Aigua!!");
				}
				if(tableA[f][c] == Coordenada(tocatM)) {
					System.out.println("Tocat i enfonsat!!");
				}
			}
		}
	}
}
