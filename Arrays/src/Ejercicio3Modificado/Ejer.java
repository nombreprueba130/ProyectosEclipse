package Ejercicio3Modificado;

import java.util.Scanner;

public class Ejer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int matriz[]=new int[10];
		
		System.out.println("Introduzca 10 numeros");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=sc.nextInt();
		}
		
		imprimirResultado(comprobarOrden(matriz));
		
	}
	
	static boolean[] comprobarOrden(int matriz[]) {
		boolean valores[]=new boolean[2]; 
		//Bucle para comprobar si es de menor a mayor
		for(int i=0; i<matriz.length-1 ;i++) {
			if(matriz[i]<matriz[i+1]) {
				valores[0]=true; //En index:0 se almacenan el valor de si es menor a mayor
			}else { 
				valores[0]=false;
				i=matriz.length;//Para que salga del bucle
			}
			
		}
		
		//Bucle para comprobar si es de mayor a menor
		for(int i=0; i<matriz.length-1 ;i++) {
			if(matriz[i]>matriz[i+1]) {
				valores[1]=true;
			}else { 
				valores[1]=false;
				i=matriz.length;//Para que salga del bucle
			}
			
		}
		
		//En el caso e que este desordenado tendrían que aparecer las dos variables como false
		
		return valores;
		
	}
	static void imprimirResultado(boolean resultado[]) {
		if(resultado[0]==true) {
			System.out.println("ordendo de menor a mayor");
		}else if(resultado[1]==true) { 
			System.out.println("ordendo de mayor a menor");
		}else System.out.println("Desordenado");
	}
	
}

