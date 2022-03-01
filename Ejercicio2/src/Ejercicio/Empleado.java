package Ejercicio;
public class Empleado {
	//Declaración de variables y objetos
	private String nombre;
	private double sueldo;
	Antiguedad antiguo1;
	
	//Constructor
	public Empleado() {
		this.nombre="Manolo";
		this.sueldo=100.00;	
		antiguo1=new Antiguedad();
	}
	public Empleado(String nombre) {
		this.nombre=nombre;
		this.sueldo=100.00;	
		antiguo1=new Antiguedad();
	}
	public Empleado(int sueldo) {
		this.nombre=nombre;
		this.sueldo=100.00;	
		antiguo1=new Antiguedad();
	}	
	//getter
	public String getNombre() {
		return this.nombre;
	}
	public double getSueldo() {
		return this.sueldo;
	}
	//setter
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}	
	//Método e subeSueldo
	public void subeSueldo(double porcentaje) {
		porcentaje=porcentaje/100;//pasamos el porcentaje sobre 100 a sobre 1
		System.out.println(porcentaje);
		this.sueldo=sueldo+(sueldo*porcentaje);//Multiplicamos
	}
	//imprimir todos atributos
	public String toString() {
		String cadena="--------------------\nNombre: "+this.nombre+"\nSueldo"+this.sueldo+"\nAntigüedad"+antiguo1.getTiempoDias();
		return cadena;
	}
	
}
