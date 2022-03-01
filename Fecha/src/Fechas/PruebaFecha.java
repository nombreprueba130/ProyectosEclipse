package Fechas;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class PruebaFecha {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		Fecha cumpleanos=new Fecha(12,7,2002);
		cumpleanos.fechaCorrecta();
		int tamano;
		System.out.println("Escoge el tamaño para la matriz");
		tamano=sc.nextInt();
		Fecha matriz[]= new Fecha[tamano];
		
		for(int i=0;i<tamano;i++) {
			boolean var=false;
			while(var==false) {
				System.out.println("Introduzca el día");
				int dia=sc.nextInt();
				System.out.println("Introduzca el mes");
				int mes=sc.nextInt();
				System.out.println("Introduzca el año");
				int ano=sc.nextInt();
				Fecha fechaZ=new Fecha(dia,mes,ano);
				
				if(fechaZ.fechaCorrecta()==true) {
					matriz[i]=fechaZ;
					var=true;
				}else{
					System.out.println("Introduzca ahora bien la fecha");
					var=false;
				}
				
			}*/
		
		Fecha fecha1=new Fecha(40, 2, 2021);
		fecha1.diaSiguiente();
		System.out.println(fecha1);
		
		Fecha fecha2=new Fecha(30, 11, 2000);
		fecha2.diaSiguiente();
		System.out.println(fecha2);
		
		Fecha fecha3=new Fecha(31, 12, 2000);
		fecha2.diaSiguiente();
		System.out.println(fecha2);
	}
		
		
	public static void menor(Fecha [] matriz){
		Fecha [] array1 = new Fecha [2];
		array1[0]=matriz[0];
		
		for (int i = 1; i < matriz.length; i++) {
			if (array1[0].getAno()==matriz[i].getAno()) {
				if (array1[0].getMes()==matriz[i].getMes()) {
					if (array1[0].getDia()>=matriz[i].getDia()) {
						array1[0]=matriz[i];
					}	
				}
				else if (array1[0].getMes()>=matriz[i].getMes()) {
						array1[0]=matriz[i];
				}
			}
			else if (array1[0].getAno()>=matriz[i].getAno()) {
				array1[0]=matriz[i];
			}		
		}
		System.out.println("la fecha menor es:" +array1[0]);
	}
	public static void mayor(Fecha [] matriz){
		Fecha [] array1 = new Fecha [2];
		array1[0]=matriz[0];
		
		for (int i = 1; i < matriz.length; i++) {
			if (array1[0].getAno()==matriz[i].getAno()) {
				if (array1[0].getMes()==matriz[i].getMes()) {
					if (array1[0].getDia()<=matriz[i].getDia()) {
						array1[0]=matriz[i];
					}	
				}
				else if (array1[0].getMes()<=matriz[i].getMes()) {
						array1[0]=matriz[i];
				}
			}
			else if (array1[0].getAno()<=matriz[i].getAno()) {
				array1[0]=matriz[i];
			}		
		}
		System.out.println("la fecha menor es:" +array1[0]);
	}
	

	public static Fecha cualEsMayor(Fecha matriz[]) {
		Fecha copia;
			for (int d = 1; d < matriz.length; d++) {
				if(matriz[0].getAno()>matriz[d].getAno()) {
					copia=matriz[0];//Se copia el objeto que queremos cambiar de sitio
					System.out.println(d+"-->1index 0"+matriz[0]);
					matriz[0]=matriz[d];//Se copia el que tiener menor fecha a index:0
					System.out.println(d+"-->2index 0"+matriz[0]);
					matriz[d]=copia;//Se copia el que tiene mayor fecha en el index:mayor
				}else 	if(matriz[0].getMes()>matriz[d].getMes())		{
							copia=matriz[0];//Se copia el objeto que queremos cambiar de sitio
							matriz[0]=matriz[d];//Se copia el que tiener menor fecha a index:0
							matriz[d]=copia;
						}else 	if(matriz[0].getDia()>matriz[d].getDia()){
									copia=matriz[0];//Se copia el objeto que queremos cambiar de sitio
									matriz[0]=matriz[d];//Se copia el que tiener menor fecha a index:0
									matriz[d]=copia;
								}
			}
		return matriz[0];
				
	} 
}
/*int matrizNumerico[]= new int[tamano];
//metemos un el dia mes y año en un solo int
for(int i=0;i<tamano;i++) {
	matrizNumerico[i]=matriz[i].fechaUnicoNumero();
	System.out.println(matrizNumerico[i]);
}
System.out.println("La menor fecha es");
System.out.println(matrizNumerico[0]);
System.out.println("La mayor fecha es");
System.out.println(matrizNumerico[tamano-1]);*/
