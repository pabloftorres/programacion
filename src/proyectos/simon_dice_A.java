package Activitats_metodes;

public class simon_dice_A {

	private static int size = 4;

	public static void main(String[] args) {

		cLector lector = new cLector();
		cWait wait = new cWait();

		int choice;
		int next;
		int math;
		int index;
		int numero = 1;
		int number = 0;
		int j;
		int points = 0;
		int point = 0;
		boolean go = true;

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
				basic(tableA);
				System.out.println("Els numeros apareixeran durant 5 segons");
				taula(tableA);
				wait.wait(5);
				cleanScreen();

				numero = 1;

				numPantalla(tableB);
				points = 0;

				points(tableA,tableB);
				wait.wait(3);
				cleanScreen();
			} 
			else if (choice == 2) {
				System.out.print("Has escollit jugar al Nivell intermig");
				basic(tableA);
				System.out.println("Els numeros apareixeran durant 3 segons");
				taula(tableA);
				wait.wait(3);
				cleanScreen();

				numero = 1;

				numPantalla(tableB);
				points = 0;

				points(tableA,tableB);
				wait.wait(3);
				cleanScreen();
			} 
			else if (choice == 3) {
				System.out.print("Has escollit jugar al Nivell pro");
				basic(tableA);
				System.out.println("Els numeros apareixeran durant 1 segon");
				taula(tableA);
				wait.wait(1);
				cleanScreen();

				numero = 1;

				numPantalla(tableB);
				points = 0;

				points(tableA,tableB);
				wait.wait(3);
				cleanScreen();
			}
			System.out.print("Vols jugar una altre vegada? Introdueix true (si) o false (no) per continuar: ");
			go = lector.llegirBool();
			
			if (go == false) {
				System.out.println("Final Points: " + point);
			}
		}		
	}

	public static int nivel() {
		cLector lector = new cLector();

		int number = 0;

		number = lector.llegirEnter();

		while (number > 3 || number < 1) {
			System.out.print("Numero introduit incorrecte, escolleix un altre: ");
			number = lector.llegirEnter();
		}
		return number;
	}
	public static void points(int tableA[], int tableB[]) {
		int j;
		int points = 0;
		int point = 0;
		int numero;
		
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
	}
	public static void numPantalla(int tableB[]) {
		cLector lector = new cLector();
		
		int index = 0;
		int numero = 0;
		int number;
		
		System.out.println("Ara, has d'escriure els numeros que han sortit per la pantalla");
		
		for (index = 0; index < 4; index++) {
			System.out.print("[" + numero + "]: ");
			number = lector.llegirEnter();
			tableB[index] = number;
			numero++;
		}
	}
	public static void basic(int tableA[]) {
		int next = 0;
		int math;
		

		for (next = 0; next < 4; next++) {
			math = random();
			tableA[next] = math;
		}
	}

	public static void taula(int table[]) {
		int next;
		int number = 1;

		for (next = 0; next < size; next++) {
			System.out.println("[" + number + "]: " + table[next]);
			number++;
		}
	}
	
	public static int random() {
		int number;	
		
		number = (int) (Math.random() * size + 1);
		return number;
	}

	public static String cleanScreen() {

		String clean = " ";
		int i;

		for (i = 1; i <= 10; i++) {
			System.out.println(clean);
		}
		return clean;
	}
	
	public static void cleanTables(int table[]) {
		int i;
		
		for (i = 0; i < size; i++) {
			table[i] = 0;
		}
	}
}