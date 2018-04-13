package proyectos;

public class life_game {

	public static void main(String[] args) {
		final int size = 12;
		cLector lector = new cLector();

		int tableA[][] = new int[size][size];
		//int tableB[][] = new int[size][size];
		int fila = 0, columna = 0;

		fila = Coordenada("Insereix 1ra coordenada: ");
		columna = Coordenada("Insereix 2na coordenada: ");

		while (fila != -1 && columna != -1) {
			tableA[columna][fila] = 1;

			fila = Coordenada("Insereix 1ra coordenada: ");
			columna = Coordenada("Insereix 2na coordenada: ");
		}

		mostrarGen(tableA);

		System.out.print("Vols continuar? ");
		String continuar = lector.llegirString();

		while(continuar.equals("Si")) {
			novaGeneracio(tableA, tableA);
			mostrarGen(tableA);
			System.out.print("Vols continuar? ");
			continuar = lector.llegirString();
		}

	}
	public static void mostrarGen(int table[][]) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("| " + table[i][j] + " |");
			}
			System.out.println(" ");
		}
	}
	public static int Coordenada(String hola) {
		cLector lector = new cLector();
		System.out.print(hola);
		return lector.llegirEnter();
	}
	public static void clean(int table[][]) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				table[i][j] = 0;
			}
		}
	}
	public static void novaGeneracio(int tableA[][], int tableB[][]) {
		int vivesTauler = 0;

		for (int f = 1; f <= 10; f++) {

			for (int c = 1; c <= 10; c++) {
				//fer les condicions, i despres comprovar si esta viva o morta per saber que fer
				if (tableA[f][c] == 1) {
					vivesTauler = tableA[f-1][c] + tableA[f+1][c] + tableA[f][c+1] + tableA[f][c-1] + tableA[f-1][c-1] 
							+ tableA[f-1][c+1] + tableA[f+1][c+1] + tableA[f+1][c+1];

					if (vivesTauler < 2) {
						tableB[f][c] = 0;
					}
					if (vivesTauler == 2 || vivesTauler == 3) {
						tableB[f][c] = 1; 
					}
					if (vivesTauler > 3) {
						tableB[f][c] = 0;
					}
					else if (tableA[f][c] == 0 && vivesTauler > 3) {
						tableB[f][c] = 1;
					}
				}
			}
		}
	}
}	