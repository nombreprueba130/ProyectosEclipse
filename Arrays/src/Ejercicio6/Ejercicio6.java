package Ejercicio6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM=3;
		int matriz1[][]=new int[TAM][TAM];
		int matriz2[][]=new int[TAM][TAM];
		
		System.out.println("Introducir matriz1");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matriz1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Introducir matriz2");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz2[i][j]=sc.nextInt();
			}
		}
		
		int suma[][]=sumar(matriz1, matriz2);
		imprimir(suma);
	}
	
	static int[][] sumar(int matriz1[][],int matriz2[][]) {
		final int TAM=3;
		int suma[][]=new int[TAM][TAM];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				suma[i][j]= matriz1[i][j] + matriz2[i][j];
			}
		}
		return suma;
		
	}
	static void imprimir(int suma[][]) {
		
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma.length; j++) {
				System.out.print(suma[j][i]+" ");
			}
			System.out.println();
		}
	}
}
