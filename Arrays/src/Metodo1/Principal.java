package Metodo1;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("De las dos series de numeros cual tiene el mayor numero");
		int numero;
		int index=0;
		
		System.out.println("\tCuantos numeros introducira en serie1");
		int cantNumero= sc.nextInt();
		int serie1[]=new int[cantNumero];
		for (int i = 0; i < serie1.length; i++) {
			System.out.print("Introduzca valor");
			serie1[i]=sc.nextInt();
		}
		int numeroMasAlto1=numeroMasAlto(serie1);
		
		System.out.println("\tCuantos numeros introducir en serie2");
		cantNumero= sc.nextInt();
		int serie2[]=new int[cantNumero];
		for (int i = 0; i < serie1.length; i++) {
			System.out.print("Introduzca valor");
			serie2[i]=sc.nextInt();
		}
		int numeroMasAlto2=numeroMasAlto(serie2);
		
		if(numeroMasAlto1>numeroMasAlto2) {
			System.out.println("Serie1 tiene un numero mayor, es el "+numeroMasAlto1);
		}else if(numeroMasAlto2>numeroMasAlto1) {
			System.out.println("Serie2 tiene un numero mayor, es el "+numeroMasAlto2);
		}else System.out.println("Los dos n?meros m?s altos son iguales.");
		
	}
	static int numeroMasAlto(int matriz[]) {
		int copia;
		int numeroMasAlto=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = i; j < matriz.length; j++) {
				if(matriz[i]>matriz[j]) {
					copia=matriz[i];
					matriz[i]=matriz[j];
					matriz[j]=copia;
				}
			}
		}
		return matriz[matriz.length-1];
	}
	
	
}
