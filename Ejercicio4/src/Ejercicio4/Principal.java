package Ejercicio4;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int matriz[]=new int[10];
		int num_A_Buscar;
		System.out.println("Introduzca 10 numeros");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=sc.nextInt();
		}
		ordenar(matriz);
		System.out.println("que numero busca?");
		num_A_Buscar=sc.nextInt();
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("matriz:"+matriz[i]);
			if(num_A_Buscar==matriz[i]) {
				System.out.println("El numero"+ num_A_Buscar+"esta en el index: "+i);
				i=100;
			}
		}
	}
	static void ordenar(int matriz[]) {
		int copia;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = i; j < matriz.length; j++) {
				if(matriz[i]>matriz[j]) {
					copia=matriz[i];
					matriz[i]=matriz[j];
					matriz[j]=copia;
				}
			}
		}
	}
}
