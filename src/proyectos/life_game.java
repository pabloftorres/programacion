package proyectos;

public class life_game {
	public static void main(String[] args) {
		final int size = 12;
		cLector lector = new cLector();

		int tableA[][] = new int[size][size];
		int tableB[][] = new int[size][size];
		int fila = 0, columna = 0;

		do {
			fila = Coordenada("Insereix 1ra coordenada: ");
			columna = Coordenada("Insereix 2na coordenada: ");
		}
		while (fila != -1 && columna != -1);

		String continuar = "Si";

		while(continuar.equals("Si")) {
			omplirTableB(tableA, tableB);
			igualarTables(tableA, tableB);
			clean(tableB);
			mostrarGen(tableA);
			System.out.println("Vols fornicar mes?");
			continuar = lector.llegirString();
		}
	}

	private static void igualarTables(int tableA[][], int tableB[][]) {
		for (int c = 1; c <= 11; c++) {
			for (int c2 = 1; c2 <= 11; c2++) {
				tableA[c][c2] = tableB[c][c2];
			}
		}
	}

	public static void mostrarGen(int table[][]) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
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
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				table[i][j] = 0;
			}
		}
	}

	public static void omplirTableB(int tableA[][], int tableB[][]) {
		int vivesTaulerA = 0;

		for (int c = 1; c <= 11; c++) {
			for (int c2 = 1; c2 <= 11; c2++) {
				//fer les condicions, i despres comprovar si esta viva o morta per saber que fer

			}
		}
	}
}