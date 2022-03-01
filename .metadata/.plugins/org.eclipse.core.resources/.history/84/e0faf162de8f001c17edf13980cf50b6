package Ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int matriz[]=new int[10];
		
		System.out.println("Introduzca 10 numeros");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=sc.nextInt();
		}
		
		int var=ordenar(matriz);
		if(var==1) {
			System.out.println("ordendo de menor a mayor");
		}else if(var==2) { 
			System.out.println("ordendo de mayor a menor");
		}else System.out.println("Desordenado");
		
	}
	static int ordenar(int matriz[]) {
		int ordenado=7;//7 no se sabe
		for (int i = 0; i < matriz.length-1; i++) {
			if(matriz[i]<=matriz[i+1]) {
				ordenado=1;//1 Es ordendo de menor a mayor
			}else {
				ordenado=7;// 7 no se sabe lo que es
				i=100;
			}
			
		}
		System.out.println("Despues del primer for: "+ordenado);
		if(ordenado==7) {
			for (int i = 0; i < matriz.length; i++) {
				if(matriz[i]>=matriz[i+1]) {
					ordenado=2;//2 Es ordendo de mayor a menor
				}else { 
					ordenado=7;// 7 no se sabe lo que es
					i=100;
				}
			}
			System.out.println("Despues del segundo for: "+ordenado);
		}
		if(ordenado==7) {
			ordenado=3;
		}
		System.out.println("resultado"+ordenado);
		
		return ordenado;
	}
	
}
