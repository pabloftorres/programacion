package proyectos;

public class hundir_la_flota {

	private static int size = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila = 0, columna = 0;
		int atac = 0;
		int i, j;

		int tableA[][] = new int[size][size];
		int tableB[][] = new int[size][size];


		System.out.println("Player1 introdueix coordenades per ficar vaixells.");

		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			error(fila,columna);
			tableA[columna][fila] = 1;
			barcos++;

		}

		tablero(tableA);
		barcos = 0;


		System.out.println("Player2 introdueix coordenades per ficar vaixells.");
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			error(fila,columna);
			tableB[columna][fila] = 1;
			barcos++;

		}

		tablero(tableB);
		barcos = 10;

		while (barcos >= 0) {
			i = 0;
			j = 0;

			atac1vs2(tableB);
			tablero(tableB);
			bucleAtac1(i,j);

			atac2vs1(tableA);
			tablero(tableA);
			bucleAtac2(i,j);

		}

		if (player1(tableA) > player2(tableB)) {
			System.out.println("Ha guanyat el Player1");
		}
		else {
			System.out.println("Ha guanyat el Player2");
		}
		System.out.print("Game Over");
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
	
	public static int player1(int table[][]) {
		int c;
		int f;
		int barcos = 0;

		for (f = 0; f <= 5; f++) {

			for (c = 0; c <= 5; c++) {
				if (table[f][c] == 1) {
					barcos++;
				}
			}
		}
		return barcos;
	}
	
	public static int player2(int table[][]) {
		int c;
		int f;
		int barcos = 0;

		for (f = 0; f <= 5; f++) {

			for (c = 0; c <= 5; c++) {
				if (table[f][c] == 1) {
					barcos++;
				}
			}
		}
		return barcos;
	}

	public static void bucleAtac1(int i, int j) {
		int tableB[][] = new int[size][size];
		int barcos = 0;

		for (i = 0; i <= 5; i++) {

			for (j = 0; j <= 5; j++) {
				if (tableB[i][j] == 1) {
					barcos--;
				}
			}
		}
	}
	
	public static void bucleAtac2(int i, int j) {
		int tableA[][] = new int[size][size];
		int barcos = 0;

		for (i = 0; i <= 5; i++) {

			for (j = 0; j <= 5; j++) {
				if (tableA[i][j] == 1) {
					barcos--;
				}
			}
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
	
	public static void atac1vs2(int tableB[][]) {
		int f;
		int c;

		System.out.println("Jugador1 et toca atacar.");
		f = Coordenada("Introdueix una coordenada:");
		c = Coordenada("Introdueix una coordenada:");


		if (tableB[c][f] == 0) {
			System.out.println("No li has donat a res");
		}
		if (tableB[c][f] == 1) {
			tableB[c][f] = 0;
			System.out.println("Tocat i enfonsat.");
		}

	}
	
	public static  void atac2vs1(int tableA [][]) {
		int f;
		int c;

		System.out.println("Jugador2 et toca atacar.");
		f = Coordenada("Introdueix una coordenada:");
		c = Coordenada("Introdueix una coordenada:");


		if (tableA[c][f] == 0) {
			System.out.println("No li has donat a res");
		}
		if (tableA[c][f] == 1) {
			tableA[c][f] = 0;
			System.out.println("Tocat i enfonsat.");
		}

	}
}