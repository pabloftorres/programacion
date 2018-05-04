package Activitats_metodes;

	public class mastermind {

		private static int size = 4;

		public static void main(String[] args) {
			
			cLector lector = new cLector();
			cWait wait = new cWait();
			
			
			int number;
			int tableA[] = new int[size];
			int tableB[] = new int[size];
			
			System.out.println("-Ara jugarem al joc Mastermind-");
			System.out.println("-Podras triar entre aquests colors. Blau(B), Negre(N), Vermell(V), Lila(L), Groc(G) i el color Crema(C)-");
			Player1();
		}
		public static void Player1() {
			cLector lector = new cLector();
			char color;
			int bolsa = 0;
				
				while (bolsa < 4) {
				System.out.println("Player1, ara es el teu torn.");
				System.out.println("Escull 4 colors dels anteriors, agefint la lletra esmentada per cada color. Es poden repetir :");
				color = lector.llegirChar();
				
				if ((color =='B')||(color =='N')||(color =='V')||(color =='L')||(color =='G')||(color =='C')) {
					bolsa++;
				}
				else {
					System.out.println("Introdueix una lletra correcte.");

				}
			}
		}
		public static void Player2() {
			cLector lector = new cLector();
			char color;
			int bolsa = 0;
			
				while(bolsa < 4) {
					System.out.println("Player2, ara es el teu torn.");
					System.out.println("Haurás d'esbrinar la serie de colors del Player1.");
					System.out.println("-Podras triar entre aquests colors. Blau(B), Negre(N), Vermell(V), Lila(L), Groc(G) i el color Crema(C)-");
					System.out.println("Escull 4 colors dels anteriors, agefint la lletra esmentada per cada color. Recorda poden repetir :");
					
					color = lector.llegirChar();
				}
		}
		public static void cleanTables(int table[]) {
			int i;
			
			for (i = 0; i < size; i++) {
				table[i] = 0;
			}
		}
		
}