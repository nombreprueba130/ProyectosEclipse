package Huevos;
import java.util.Scanner;
import java.util.Scanner.close();
public class Main {
	//private en clase
	//protected en clase,en paquete,ensubclase
	//public misma clase,enpaquete,en subclase,fuera de paquete
	//-en clase,mismo paquete
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca el número de huevos");	
		int nCasillas= sc.nextInt();
		
		Huevo PaqueteDeHuevos[]=new Huevo[nCasillas];
		for(int i=0;i<nCasillas;i++) {
			PaqueteDeHuevos[i]=new Huevo();
			
			System.out.print(PaqueteDeHuevos[i].toString());
			
		}
		Scanner.close();
	}

}
