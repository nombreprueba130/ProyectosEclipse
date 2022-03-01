package Ejercicio8;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Apartado A del ejercicio mostrar tabla de a�os e intereses
				System.out.println("Introduzca el n�mero de a�os");
				int numerodeAnos=sc.nextInt();
				numerodeAnos= numerodeAnos +1;//Se le suma 1 debedo a que en la primera fila se generan los intereses
				double tablaconValores[][]=generadorDetablaCompleta(numerodeAnos);
				//Mostrar tabla convalores
				for (int y = 0; y < numerodeAnos+1; y++) {
					for (int x = 0; x < tablaconValores.length; x++) {
						System.out.print(tablaconValores[x][y]+" ");
					}
					System.out.println();
				}
		System.out.println();
		
		//Apartado B
		interesEspecifico();
		
		
		
	}
	static int interesPedidoPorUsuario() {//Genera el interes que queremos comprobar
		Scanner sc=new Scanner(System.in);
		int interes;
		do {
			System.out.println("Introduzca el interes entre 10 y 15");
			interes=sc.nextInt();
		}while(interes<10 || interes>15);
		System.out.println("\t Se ha asignado el valor "+interes);
		return interes;
	}
	static int anoPedidoPorUsuario() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el a�o");
		int anos;
		anos=sc.nextInt();
		System.out.println("\t Se ha asignado el valor "+anos);
		return anos;
	}
	static double[][] generadorDetablaCompleta(int anos) {
		int intereses =10;
		final int TAMX=6;
		final int TAMY=anos+1;
		double tabla[][]=new double[TAMX][TAMY];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i][0]=intereses+i;
			tabla[i][1]=10000;
		}
		for (int y = 1; y < anos; y++) {
			for (int x = 0; x < tabla.length; x++) {
				tabla[x][y+1]=tabla[x][y]+(tabla[x][y]*(tabla[x][0]/100));
				tabla[x][y+1]=Math.round(tabla[x][y+1]*100.0)/100.0;//Rendonde a 2 decimales todos los numeros
			}
		}
		return tabla;
	}
	static void interesEspecifico() {
	int interes=interesPedidoPorUsuario();
	int posicionx=0;
	if (interes==10) {
		posicionx=0;
	}else if (interes==11) {
		posicionx=1;
	}else if (interes==12) {
		posicionx=2;
	}else if (interes==13) {
		posicionx=3;
	}else if (interes==14) {
		posicionx=4;
	}else posicionx=5;
	
	int anos = anoPedidoPorUsuario();
	anos=anos+1;//Se le suma 1 debedo a que en la primera fila se generan los intereses
	//anos contenpla que el primer a�o es ano=0;
	double tabla[][]=generadorDetablaCompleta(anos);
	System.out.println(tabla[posicionx][anos]);
	}
}

























