package Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[] = new int[10];
		int indiceIzquierda = 0;// Indice para imprimir
		int indiceDerecha = matriz.length - 1;// Indice para imprimir
		System.out.println("Introduzca 10 numeros");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = sc.nextInt();
		}

		// Mostrar como se pide
		for (int i = 0; i < matriz.length / 2; i++) {
			System.out.println(matriz[indiceIzquierda+i]);
			System.out.println(matriz[indiceDerecha-i]);
		}

	}
}
