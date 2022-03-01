package Ejercicio4;
import java.util.Arrays;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int matriz[]=new int[10];
		int num_A_Buscar;
		
		do {
		System.out.println("Introduzca 10 numeros");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=sc.nextInt();
		}
		
		}while(estanOrdenados(matriz)==false);
		
		System.out.println("que numero busca?");
		num_A_Buscar=sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			
			if(num_A_Buscar==matriz[i]) {
				System.out.println("El numero "+ num_A_Buscar+" ,empezando desde el 0, se encuentra en el index: "+i);
				i=matriz.length;
			}else if(num_A_Buscar!=matriz[i] && i==matriz.length-1) {
				System.out.println("El numero que busca no ha sido introducido");
			}
			
		}
		
	}
	static boolean estanOrdenados(int matriz[]) {
		
		boolean resultado=false;//Si es falso no es ordenado de menor a mayor
		
		for(int i=0; i<matriz.length-1 ;i++) {
			if(matriz[i]<matriz[i+1]) {
				resultado=true; //En index:0 se almacenan el valor de si es menor a mayor
			}else { 
				resultado=false;
				i=matriz.length;//Para que salga del bucle
			}
			
		}
		return resultado;
	}
	
}
