package Ejercicio;
public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1=new Empleado(1000);
		empleado1.subeSueldo(10);
		System.out.print(empleado1);
		
		Empleado empleado2=new Empleado("Eustaquio");
		Empleado empleado3=new Empleado("Garcilaso");
		//Subida de sueldoi para empleado1
		empleado1.subeSueldo(50);//Porcentaje sobre 100
		//Subida de sueldoi para empleado2
		empleado2.subeSueldo(80);//Porcentaje sobre 100
		//Subida de sueldoi para empleado3
		empleado3.subeSueldo(200);//Porcentaje sobre 100
		
		System.out.println("empleado1:"+empleado1.getSueldo());
		System.out.println("empleado2:"+empleado2.getSueldo());
		System.out.println("empleado3:"+empleado3.getSueldo());
	}

}
