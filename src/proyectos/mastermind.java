package proyectos;

public class mastermind {

	private static int size = 8;

	public static void main(String[] args) {

		int number;
		char tableA[] = new char[size];
		char tableB[] = new char[size];
		int contador = 0;;
		
		System.out.println("Ara jugarem al joc Mastermind");
		System.out.println("Hi ha 6 colors. Blau(B), negre(N), vermell(V), lila(L), groc(G) i el color crema(C)");
		while (contador < 4) {

			System.out.println("Player1, ara es el teu torn.");
			System.out.println("Escolleix quatre colors:");
			
			for (number = 0; number < 4; number++) {
				tableA[number] = choice();
				contador++;				
			}		
			tablero(tableA);
		}
		cleanScreen();	
	}

	public static char choice() {
		cLector lector = new cLector();

		char color;

		color = lector.llegirChar();		
		return color;
	}	

	public static void tablero(char table[]) {
		int square;

		for (square = 0; square < 4; square++) {
			System.out.print("[" + table[square] +  "]");
		}
	}
	
	public static String cleanScreen() {
		cWait wait = new cWait();
		cLector lector = new cLector();
		
		String clean = " ";
		int i;
		
		wait.wait(3);
		
		for (i = 0; i <= 10; i++) {
			System.out.println(clean);
		}
		return clean;
	}
	
	public static void cleanTables (int table[]) {
		
		int next;
		
		for (next = 0; next < 4; next++) {
			table[next] = 0;
		}
	}
}