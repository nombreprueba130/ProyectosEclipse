package Ejercicio;

public class Persona {
	protected String nombre;
	protected int edad;
	protected int estatura;
	public Persona() {
		this.nombre="Lorenzo";
		this.edad=43;
		this.estatura=175;
	}
	public String mostrarDatos() {
		String cadena ="nombre: "+this.nombre+"\nedad: "+this.edad+"\nestatura: "+estatura;
		return cadena;
	}
}
