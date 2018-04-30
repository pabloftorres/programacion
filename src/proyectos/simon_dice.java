package proyectos;

public class simon_dice {

	private static int size = 4;

	public static void main(String[] args) {

		cLector lector = new cLector();
		cWait wait = new cWait();

		int choice;
		int next;
		int random;
		int index;
		int numero = 1;
		int color = 0;
		int j;
		int points = 0;
		int point = 0;
		boolean go = true;
		String limpiar;

		int tableA[] = new int[size];
		int tableB[] = new int[size];

		System.out.println("Ara jugarem al joc de 'Simon dice'. Escolleix el mode de dificultat en que vols jugar");
		point = 0;

		while (go == true) {

			System.out.println("[1]: Nivell basic \n[2]: Nivell intermig \n[3]: Nivell pro");
			System.out.print("Que escolleixes: ");
			choice = nivel();
			
			cleanTables(tableA);
			cleanTables(tableB);

			if (choice == 1) {
				System.out.println("Has escollit jugar al Nivell basic");

				for (next = 0; next < 4; next++) {
					random = (int) (Math.random() * size + 1);
					tableA[next] = random;
				}
				System.out.println("Els numeros apareixeran durant 5 segons");
				taula(tableA);
				wait.wait(5);
				limpiar = cleanScreen();

				numero = 1;

				System.out.println("Ara, escriu els numeros que han sortit per la pantalla");
				for (index = 0; index < 4; index++) {
					System.out.print("[" + numero + "]: ");
					color = lector.llegirEnter();
					tableB[index] = color;
					numero++;
				}
				points = 0;

				for (j = 0; j < 4; j++) {
					if (tableA[j] == tableB[j]) {
						points++;

						if (points == 4) {
							point++;
							System.out.println("Points: " + point);
						}
					}
					else {
						numero = 1;
						System.out.println("Has fallat, la combinacio correcta era:");
						
						for (j = 0; j < 4; j++) {
							System.out.println("[" + numero + "]: " + tableA[j]);
							numero++;
						}
					}
				}
				wait.wait(3);
				limpiar = cleanScreen();

				System.out.println("Final Points: " + point);
				System.out.print("Vols jugar una altre vegada: ");
				go = lector.llegirBool();
			} 
			else if (choice == 2) {
				System.out.print("Has escollit jugar al Nivell intermig");

				for (next = 0; next < 4; next++) {
					random = (int) (Math.random() * size + 1);
					tableA[next] = random;
				}
				System.out.println("Els numeros apareixeran durant 5 segons");
				taula(tableA);
				wait.wait(3);
				limpiar = cleanScreen();

				numero = 1;

				System.out.println("Ara, escriu els numeros que han sortit per la pantalla");
				for (index = 0; index < 4; index++) {
					System.out.print("[" + numero + "]: ");
					color = lector.llegirEnter();
					tableB[index] = color;
					numero++;
				}
				points = 0;

				for (j = 0; j < 4; j++) {
					if (tableA[j] == tableB[j]) {
						points++;

						if (points == 4) {
							point++;
							System.out.println("Points: " + point);
						}
					}
					else {
						numero = 1;
						System.out.println("Has fallat, la combinacio correcta era:");
						
						for (j = 0; j < 4; j++) {
							System.out.println("[" + numero + "]: " + tableA[j]);
							numero++;
						}
					}
				}
				wait.wait(3);
				limpiar = cleanScreen();

				System.out.println("Final Points: " + point);
				System.out.print("Vols jugar una altre vegada: ");
				go = lector.llegirBool();
			} 
			else if (choice == 3) {
				System.out.print("Has escollit jugar al Nivell pro");

				for (next = 0; next < 4; next++) {
					random = (int) (Math.random() * size + 1);
					tableA[next] = random;
				}
				System.out.println("Els numeros apareixeran durant 5 segons");
				taula(tableA);
				wait.wait(1);
				limpiar = cleanScreen();

				numero = 1;

				System.out.println("Ara, escriu els numeros que han sortit per la pantalla");
				for (index = 0; index < 4; index++) {
					System.out.print("[" + numero + "]: ");
					color = lector.llegirEnter();
					tableB[index] = color;
					numero++;
				}
				points = 0;

				for (j = 0; j < 4; j++) {
					if (tableA[j] == tableB[j]) {
						points++;

						if (points == 4) {
							point++;
							System.out.println("Points: " + point);
						}
					}
					else {
						numero = 1;
						System.out.println("Has fallat, la combinacio correcta era:");
						
						for (j = 0; j < 4; j++) {
							System.out.println("[" + numero + "]: " + tableA[j]);
							numero++;
						}
					}
				}
				wait.wait(3);
				limpiar = cleanScreen();
				
				System.out.println("Final Points: " + point);
				System.out.print("Vols jugar una altre vegada: ");
				go = lector.llegirBool();
			}
		}

	}

	public static int nivel() {
		cLector lector = new cLector();

		int number = 0;

		number = lector.llegirEnter();

		while (number > 3) {
			System.out.print("Numero introduit incorrecte, escolleix un altre: ");
			number = lector.llegirEnter();
		}
		return number;
	}

	public static void taula(int table[]) {
		int next;
		int number = 1;

		for (next = 0; next < size; next++) {
			System.out.println("[" + number + "]: " + table[next]);
			number++;
		}
	}

	public static String cleanScreen() {
		cLector lector = new cLector();

		String limpiar = " ";
		int i;

		for (i = 1; i <= 10; i++) {
			System.out.println(limpiar);
		}
		return limpiar;
	}
	
	public static void cleanTables(int table[]) {
		int i;
		
		for (i = 0; i < 4; i++) {
			table[i] = 0;
		}
	}
}