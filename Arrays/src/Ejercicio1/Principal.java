package Ejercicio1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int matriz[]=new int[5];
	System.out.println("Introduzca 5 numeros");
	for (int i = 0; i < matriz.length; i++) {
		matriz[i]=sc.nextInt();
	}
	for (int i = matriz.length-1; i >=0; i--) {
		System.out.print(matriz[i]+" ");
	}	

	

}
}
