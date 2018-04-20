<<<<<<< HEAD
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
=======
package Activitats_metodes;

public class hundir_la_flota {

	private static int tamaño = 6;
	public static void main(String[] args) {
		cLector lector = new cLector();
		int barcos = 0;
		int fila = 0, columna = 0;
		
		int tableA[][] = new int[tamaño][tamaño];
		int tableB[][] = new int[tamaño][tamaño];
		
		
		System.out.println("Player1 introdueix coordenades per ficar vaixells.");
	
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			error(columna, fila);
			tableA[columna][fila] = 1;
			barcos++;
			
		}
		
		tablero(tableA);
		barcos = 0;
		
		System.out.println("Player2 introdueix coordenades per ficar vaixells.");
		while (barcos < 5) {
			fila = Coordenada("Introdueix una coordenada:");
			columna = Coordenada("Introdueix una coordenada:");
			error(columna, fila);
			tableB[columna][fila] = 1;
			barcos++;
			
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

	public static void error(int f, int c) {
		if ((f > 5) & (c > 5)) {
			System.out.println("Error, introdueix una coordenada que no sigui superior a 5");	
		}
		
	}
	public static void regles(int tableA[][],int tableB[][]) {
		String tocatM = null;
		int aigua;
		int voltant;
		
		for (int f = 1; f <= 5; f++) {

			for (int c = 1; c <= 5; c++) {
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
	public static int atac(int table []) {
		cLector lector = new cLector();
		int fila = 0;
		int columna = 0;
		
		System.out.println("Comença la fase d'atac. Introdueix 2 coordenades per atacar. Primerament una i després l'altre.");
		fila = Coordenada("Introdueix una coordenada:");
		columna = Coordenada("Introdueix una coordenada:");
		
		return lector.llegirEnter();	
		}
}
>>>>>>> 87da7acd0a6a173d9f28da679e09b409358c46da
