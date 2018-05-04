package Activitats_metodes;

	public class mastermind {

		private static int size = 4;

		public static void main(String[] args) {
			
			cLector lector = new cLector();
			cWait wait = new cWait();
			
			char color;
			int bolsa = 0;
			int number;
			int tableA[] = new int[size];
			int tableB[] = new int[size];
			boolean go = true;
			
			System.out.println("-Ara jugarem al joc Mastermind-");
			System.out.println("-Podras triar entre aquests colors. Blau(B), Negre(N), Vermell(V), Lila(L), Groc(G) i el color Crema(C)-");
			while (bolsa < 4) {
				
				System.out.println("Player1, ara es el teu torn.");
				System.out.println("Escull 4 colors dels anteriors, agefint la lletra esmentada per cada color. Es poden repetir :");
				color = lector.llegirChar();
				bolsa++;
			}
		}
		
		public static char color() {
			cLector lector = new cLector();
			
			char color;
			
			color = lector.llegirChar();		
			return color;
		}
		public static void cleanTables(int table[]) {
			int i;
			
			for (i = 0; i < size; i++) {
				table[i] = 0;
			}
		}
		
}