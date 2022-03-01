package Ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int notaTrimestre;
		int notas [][]=new int[15][3];
	//Generar el array de alumnos
		
		for (int i = 0; i < 15; i++) {

			int numeroAlumno=i;
			System.out.println("Introduzca los datos del alumno "+(numeroAlumno+1));
			
			for (int j = 0; j < 3; j++) {
					int numeroTrimestre=j;//Sirve para decir que trimestre estamos modificando
					
					System.out.println("\tNota trimestre "+(numeroTrimestre+1));
					notaTrimestre=sc.nextInt();
					if(notaTrimestre>=0 && notaTrimestre<=10) {
						notas [i][j]=notaTrimestre;//Le asigna al array el valor si esta entre el numero correspondiente
					}else {
						j--;
						System.out.println("Introduzca un valor entre 0 y 10");
					}
			}		
		}
		calcularMediaGrupo(notas);
		calcularMediaAlumno(notas);
		
	}
	static void calcularMediaGrupo(int notas[][]) {
		int mediaTrimestre=0;
		int numeroTrimestre=1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("Media del trimestre "+numeroTrimestre);
				mediaTrimestre=mediaTrimestre + notas[j][i];
			}
			mediaTrimestre=mediaTrimestre/15;
			System.out.println("La media del trimestre "+numeroTrimestre+" :"+mediaTrimestre);
			numeroTrimestre++;
			
		}
	}

	static void calcularMediaAlumno(int notas[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Hacer media de alumno: ");
		int alumno=sc.nextInt();
		double media=0;
		
		for (int i = 0; i < 3; i++) {
				media=media+(double)notas[alumno][i];
			}
			media=media/3;
			System.out.println("La media del alumno "+alumno+" :"+media);
		}
}




