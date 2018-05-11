package proyectos;

public class mastermind {

	private static int size = 4;

	public static void main(String[] args) {

		char tableA[] = new char[size];
		char tableB[] = new char[size];
		int contador = 1;

		System.out.println("Ara jugarem al joc Mastermind");
		System.out.println("Hi ha 6 colors. Blau(B), negre(N), vermell(V), lila(L), groc(G) i el color crema(C)");
		System.out.println("Player1, ara es el teu torn.");
		System.out.println("Escolleix quatre colors:");

		colors(tableA);
		cleanScreen();


		System.out.println("Player2 ara es el teu torn, tens que endevinar la sequencia de colors");

		colors(tableB);

		while (verify(tableA, tableB) == false && contador < 15) {

			fitxes(tableA, tableB);
			if (verify(tableA, tableB) == true) {
				System.out.print("···You win Player2···");
			}
			System.out.println("Sequencia de colors introduida incorrecte");
			colors(tableB);
			contador++;
		}
		if (verify(tableA, tableB) == true) {
			System.out.print("···You win Player2···");
		}
	}

	public static char choice() {
		cLector lector = new cLector();

		char color;

		color = lector.llegirChar();		
		return color;
	}

	public static void colors(char table[]) {
		int number;
		char color;

		for (number = 0; number < 4; number++) {
			color = choice();		

			while (color != 'B' && color != 'N' && color != 'L' && color != 'G' && color != 'C' && color != 'V') {
				System.out.println("Lletra introduida incorrecte");
				color = choice();
			}				
			table[number] = color;
		}			
		tablero(table);		
	}

	public static void tablero(char table[]) {
		int square;

		for (square = 0; square < 4; square++) {
			System.out.print("[" + table[square] +  "]");
		}
		System.out.println("");
	}

	public static String cleanScreen() {
		cWait wait = new cWait();

		String clean = " ";
		int i;

		wait.wait(3);

		for (i = 0; i <= 10; i++) {
			System.out.println(clean);
		}
		return clean;
	}

	public static boolean verify(char tableA[], char tableB[]) {

		int next;
		int contador = 0;

		for (next = 0; next < 4; next++) {
			if (tableA[next] == tableB[next]) {
				contador++;
			}
		}
		if (contador == 4) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void fitxes(char tableA[], char tableB[]) {
		int next = 0;

		for( next = 0; next < 4; next++) {
			if(tableB[next] == tableA[next]) {
				System.out.println("V");
			}
			else if(tableB[next] != tableA[next]) {
				System.out.println("+");

			}
		}
	}
}