package Activitats_metodes;

import java.util.Scanner;

public class life_game {

	public static void main(String[] args) {
		cLector lector = new cLector();
		
		int tableA[][] = new int[12][12];
		int tableB[][] = new int[12][12];
 		int fila = 0, columna = 0;
 		int next = 0;
 		int i;
 		int j;
 		
 		fila = CoordenadaA();
 		columna = CoordenadaB();
 		
	 		while (fila != -1 && columna != -1) {
	 				
	 			tableA[next][next] = fila;
	 			tableA[next][next] = columna;
	 			System.out.println(" " + " * ");
	 			next++;
	 			System.out.println(" * " + " ");
	 			next++;
	 		}
 		
			for (i = 1; i < next; i++) {
				for (j = 1; j < next; j++) {
				}
			}
	}
	public int ImpTaula() {
		int guion;
		int aster;
		
		
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
}

