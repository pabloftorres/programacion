package proyectos;

public class hundir_la_flota {

	private static int size = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila = 0, columna = 0;
		int vecinos;

		int tableA[][] = new int[size][size];
		int tableB[][] = new int[size][size];


		System.out.println("Player1 introdueix coordenades per ficar vaixells.");

		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			error(fila,columna);
			vecinos = veins(tableA, fila, columna);
			if (vecinos == 0) {
				tableB[columna][fila] = 1;
				barcos++;
			}
		}

		tablero(tableA);
		barcos = 0;

		System.out.println("Player2 introdueix coordenades per ficar vaixells.");
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			error(fila,columna);
			vecinos = veins(tableB, fila, columna);
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
		int columna = 0; 
		int fila = 0;
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
	public static void error(int fila, int columna) {
		while(fila < 1 || fila > 5 || (columna < 1 || columna > 5)){
			System.out.println("Error, introdueix una coordenada que no sigui superior a 5");
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
		}
	}
	public static int veins (int table[][], int f, int c ) {
		int voltant = 0;

		voltant = table[f - 1][c] + table[f + 1][c] + table[f][c + 1] + table[f][c - 1]
				+ table[f - 1][c - 1] + table[f - 1][c + 1] + table[f + 1][c + 1] + table[f + 1][c + 1];

		return voltant;
	}
	public static void atac1vs2(int table[][]) {
		cLector lector = new cLector();
		int f;
		int c;
		int i;
		int j;

		System.out.println("Comença la fase d'atac. Introdueix 2 coordenades per atacar. Primerament una i despres l'altre.");
		f = Coordenada("Introdueix una coordenada:");
		c = Coordenada("Introdueix una coordenada:");


		if (table[f][c] == 0) {
			System.out.print("No li has donat a res");
		}
		if (table[f][c] == 1) {
			table[f][c] = 2;
		}
		if (table[f][c] == 2) {
			table[f][c] = 0;
		}
	}
}