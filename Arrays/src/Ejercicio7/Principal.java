package Ejercicio7;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ancho del cuadrado: ");
		 int tamX=sc.nextInt();
		System.out.print("Alto del cuadrado: ");
		 int TAMY=sc.nextInt();
		int marco[][]=new int[tamX][TAMY];
		for (int i = 0; i < TAMY; i++) {
			for (int j = 0; j < marco.length; j++) {
				marco[j][i]=1;
			}
			
		}
		for (int i = 1; i < TAMY-1; i++) {
			for (int j = 1; j < marco.length-1; j++) {
				marco[j][i]=0;
			}
		}
		
		for (int i = 0; i < TAMY; i++) {
			for (int j = 0; j < marco.length; j++) {
				System.out.print(marco[j][i]);
			}
			System.out.println();
		}

	}

}
