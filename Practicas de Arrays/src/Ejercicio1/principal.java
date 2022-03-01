package Ejercicio1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeros[]=new int[5];
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=sc.nextInt();
		}
		int alreves[]=Arrays.copyOf(numeros, numeros.length);
		int cuentaAtras=numeros.length-1;
		//Copiar numeros en array alreves 
		for(int i=0;i<numeros.length;i++) {
			alreves[i]=numeros[cuentaAtras];
			cuentaAtras= cuentaAtras - 1;
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+",");
		}
		System.out.println();
		for(int i=0;i<numeros.length;i++) {
			System.out.print(alreves[i]+",");
		}
		System.out.println(numeros.toString());
		System.out.println(alreves.toString());
		
		}		
}



