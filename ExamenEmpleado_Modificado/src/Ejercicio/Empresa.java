package Ejercicio;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado();
		Empleado empleado2=new Empleado("Eustaquio");
		Empleado empleado3=new Empleado("Garcilaso");
		//Subida de sueldoi para empleado1
		empleado1.subeSueldo(50);//Porcentaje sobre 100
		//Subida de sueldoi para empleado2
		empleado2.subeSueldo(80);//Porcentaje sobre 100
		//Subida de sueldoi para empleado3
		empleado3.subeSueldo(200);//Porcentaje sobre 100
		
		Empleado [] misEmpleados = new Empleado[3];
		for(int i=0;i<3;i++) {
			misEmpleados[i]=new Empleado();
			
		}
		//Introduuciendo valores de atributos
		for(int i=0; i<3;i++) {
			misEmpleados[i].subeSueldo(50);
		}
		//Imprimir todos los atributos de misEmpleados
		for(int i=0;i<3;i++) {
			System.out.println(misEmpleados[i].toString());*/
		Persona p= new Persona();
		Empleado e = new Empleado();
		System.out.println("\tMuestra nombre: "+e.nombre);
		System.out.println(p.mostrarDatos());
		System.out.println("----------------------------------------------");
		System.out.println("\tMuestra sueldo: "+e.getSueldo());
		System.out.println(e.toString());
		}
	}


