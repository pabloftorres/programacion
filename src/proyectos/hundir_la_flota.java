package proyectos;

public class hundir_la_flota {

	private static int size = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila = 0;
		int columna = 0;
		int vecinos;

		int tableA[][] = new int[size][size];
		int tableB[][] = new int[size][size];


		System.out.println("Player1 et toca");
		while (barcos < 5) {
			while (fila < 5 || columna < 5) {
				fila = Coordenada("Introdueix una coordenada:");
				columna = Coordenada("Introdueix una coordenada:");
			}
			
			vecinos = veins(tableA, fila, columna);
			if (vecinos == 0) {
				tableA[columna][fila] = 1;
				barcos++;
			}
		}

		tablero(tableA);
		barcos = 0;

		System.out.println("Player2 et toca");
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			vecinos = veins(tableA, fila, columna);
			if (vecinos == 0) {
				tableB[columna][fila] = 1;
				barcos++;
			}
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

	public static int veins (int tableA[][], int f, int c ) {
		int voltant = 0;

		voltant = tableA[f - 1][c] + tableA[f + 1][c] + tableA[f][c + 1] + tableA[f][c - 1]
				+ tableA[f - 1][c - 1] + tableA[f - 1][c + 1] + tableA[f + 1][c + 1] + tableA[f + 1][c + 1];
		
		return voltant;
	}
}