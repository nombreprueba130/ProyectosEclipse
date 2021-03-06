package Ejercicio;
public class Empleado extends Persona{
	//Declaraci?n de variables y objetos
	private double Salario;
	private int antiguedad;
	
	//Constructor
	public Empleado() {
		this.nombre="Manolo";
		this.Salario=100.00;	
		antiguedad=0;
	}
	public Empleado(String nombre) {
		this.nombre=nombre;
		this.Salario=100.00;	
		antiguedad=0;
	}
	public Empleado(int sueldo) {
		this.nombre="Federico";
		this.Salario=sueldo;	
		antiguedad=0;
	}
	public Empleado(String nombre, int sueldo, int antiguedad, int estatura,int edad) {
		this.nombre=nombre;
		this.edad=edad;
		this.estatura=estatura;
		this.Salario=sueldo;	
		this.antiguedad=antiguedad;
		
	}	
	//getter
	public String getNombre() {
		return this.nombre;
	}
	public double getSueldo() {
		return this.Salario;
	}
	//setter
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}	
	public void setSueldo(double sueldo) {
		this.Salario=sueldo;
	}	
	//M?todo e subeSueldo
	public void subeSueldo(double porcentaje) {
		porcentaje=porcentaje/100;//pasamos el porcentaje sobre 100 a sobre 1
		System.out.println(porcentaje);
		this.Salario=Salario+(Salario*porcentaje);//Multiplicamos
	}
	//imprimir todos atributos
	public String toString() {
		String cadena="Nombre: "+this.nombre+"\nedad:"+super.edad+"\nestatura: "+this.estatura+"\nSalario"+this.Salario+"\nAntig?edad"+antiguedad;
		return cadena;
	}
	//Mostrar el tiempo
	public  int getTiempoDias() {
		return antiguedad;
	}
	
}
