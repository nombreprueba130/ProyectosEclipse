package Metodo3;
import java.util.Arrays;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduzca un numero entre 0 y 255");
			num=sc.nextInt();
		}while(num<0 || num>255);
		
		
		imprimirBinario(generarNumeros(num));
	}
	static int[] generarNumeros(int num) {
		
		int num1=num;
		int binario[]=new int[1];
		
		do {
			if(num1/2!=1) {
				binario[binario.length-1]=num1%2;
				num1=num1/2;
				
			}else {
				binario[binario.length-1]=num1%2;//Para tener el segundo número del binario
				binario=Arrays.copyOf(binario, binario.length+1);
				binario[binario.length-1]=num1/2;//Para tener el primer número del binario
				num1=num1/2;
			}
			
			binario=Arrays.copyOf(binario, binario.length+1);	
		}while(num1/2!=0);
		
		binario=Arrays.copyOf(binario, binario.length-1);	
		return binario;
	}
	
	static void imprimirBinario(int binario[]) {
		for (int i = binario.length-1; i >= 0; i--) {
			System.out.print(binario[i]);
		}
	}

}
