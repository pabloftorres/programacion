package proyectos;

public class life_game {

	public static void main(String[] args) {
		
		cLector lector = new cLector();
		
		int tableA[][] = new int[12][12];
		int tableB[][] = new int[12][12];
		int coordenadaA = 0;
		int coordenadaB = 0;
		int next = 0;
		int i;
		int j;
		
		while (coordenadaA != -1 && coordenadaB != -1) {
			coordenadaA = lector.llegirEnter();
			tableA[next][next] = coordenadaA;
			coordenadaB = lector.llegirEnter();
			tableA[next][next] = coordenadaB;
			System.out.println(" " + " * ");
			next++;
		}
		//Recorrido tablero
		for (i = 1; i < next; i++) {
			for (j = 1; j < next; j++) {
				
			}
		}
	}
	public static int cleanA() {
		int tablaA[][] = new int[12][12];
		int next = 0;
		int i = 0;
		int j = 0;
		
		for (i = 0; i < next;) {
			
			for (j = 0; j < next;) {
				tablaA[i][j] = 0;
			}
		}
		return tablaA[i][j];
	}
	public static int cleanB() {
		int tablaB[][] = new int[12][12];
		int next = 0;
		int i = 0;
		int j = 0;

		for (i = 0; i < next;) {
			
			for (j = 0; j < next;) {
				tablaB[i][j] = 0;
			}
		}
		return tablaB[i][j];
	}
 }