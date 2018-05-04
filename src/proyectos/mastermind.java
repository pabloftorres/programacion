package proyectos;

public class mastermind {

	private static int size = 4;

	public static void main(String[] args) {
		
		cLector lector = new cLector();
		cWait wait = new cWait();
		
		char color;
		int number;
		int tableA[] = new int[size];
		int tableB[] = new int[size];
		boolean go = true;
		
		System.out.println("Ara jugarem al joc Mastermind");
		System.out.println("Hi ha 6 colors. Blau(B), negre(N), vermell(V), lila(L), groc(G) i el color crema(C)");
		while (go) {
			
			System.out.println("Player1, ara es el teu torn.");
			
		}
	}
	
	public static char color() {
		cLector lector = new cLector();
		
		char color;
		
		color = lector.llegirChar();		
		return color;
	}
}

