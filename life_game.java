package proyectos;
/*Hola */
public class life_game {

	private static int size= 12;
	public static void main(String[] args) {
		cLector lector = new cLector();

		int tableA[][] = new int[size][size];
		int tableB[][] = new int[size][size];
		int fila = 0, columna = 0;

		
		clean(tableA);
		clean(tableB);

		fila = CoordenadaA();
		columna = CoordenadaB();

		while (fila != -1 && columna != -1) {
			tableA[fila][columna] = 1;

			fila = CoordenadaA();
			columna = CoordenadaB();
			
		}
		
	mostrarGen(tableA);
	
	}	
	public static void mostrarGen(int table[][]) {
		int i;
		int j;
		for (i = 1; i < 10; i++) {
			
			for (j = 1; j < 10; j++) {
				System.out.print("| " + table[i][j] + " |");
			}
			System.out.println(" ");
		}
 	}
	public static int CoordenadaA() {
		cLector lector = new cLector();

		int vFila;

		System.out.print("Insereix 1ra coordenada: ");
		vFila = lector.llegirEnter();

		return vFila;
	}
	public static int CoordenadaB() {
		cLector lector = new cLector();

		int vColumna;

		System.out.print("Insereix 2na coordenada: ");
		vColumna = lector.llegirEnter();

		return vColumna;
	}
	public static void clean(int table[][]) {
		int i, j;

		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				table[i][j] = 0;
			}
		}
	}
}