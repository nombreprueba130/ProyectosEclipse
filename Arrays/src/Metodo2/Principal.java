package Metodo2;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numMin;
		int numMax;
		
		System.out.println("Introduzca numero");
		numMin=sc.nextInt();
		System.out.println("Introduzca numero");
		numMax=sc.nextInt();
		
		if(numMin>numMax) {
			int copia;
			copia=numMax;
			numMax=numMin;
			numMin=copia;
		}
		
		System.out.println();
		numerosIntermedios(numMin,numMax);
		
		
		
		
	}static void numerosIntermedios(int numMin,int NumMax) {
		for (int i= numMin; i<=NumMax; i++) {
			System.out.println(i);
		}
	}

}
