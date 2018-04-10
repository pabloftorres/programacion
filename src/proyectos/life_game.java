package proyectos;

import java.util.Scanner;

public class life_game {

	public static void main(String[] args) {
		cLector lector = new cLector();

		int tableA[][] = new int[12][12];
		int tableB[][] = new int[12][12];
		int fila = 0, columna = 0;
		int next = 0;
		
		tablero();
		fila = CoordenadaA();
		columna = CoordenadaB();

		while (fila != -1 && columna != -1) {

			tableA[fila][columna] = fila;
			tableA[fila][columna] = columna;
			System.out.println("1");
			next++;
		}
		clean(tableA);
		clean(tableB);
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
	public static void tablero() {
		int raya;
		for (raya = 0; raya <= 10; raya++) {
			System.out.println("-");
			System.out.println("|");
			System.out.println("|");
			System.out.print("-");
			System.out.println("|");
			System.out.println("|");
		}
	}
	public static void clean(int table[][]) {
		int i, j;

		for (i = 1; i < 12; i++) {
			for (j = 1; j < 12; j++) {
				table[i][j] = 0;
			}
		}
	}
}
