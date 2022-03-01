package pruebaprueba;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class main {
static Scanner sc=new Scanner(System.in);
 
	public static void main(String[] args) {
		int [] Valores1 = {9,48,5,3,29,62};
		int [] Valores2 = {45,1,33};
		metodo1(Valores1[4]);
		metodo1(Valores2[2]);
		metodo2(Valores2);
		Valores1 = metodo3(Valores2);
		System.out.println(Valores1[0]);
		for (int i = 0; i < Valores2.length; i++) {
			System.out.println(""+Valores1[i]);
		}
	}public static void metodo1(int numero) {
		numero=0;
		numero=numero+10;
	}
	public static void metodo2(int [] lista) {
		lista[1]=lista[2];
	}
	

}
