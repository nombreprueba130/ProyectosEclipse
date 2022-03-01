package Huevos;

public class Yema {
	private String tamaño;
	private String estado;

	public Yema() {
		this.tamaño="Grande";
		this.estado="Bueno";
	}
	public Yema(String tamaño,String estado) {
		this.tamaño=tamaño;
		this.estado=estado;
	}
	public String toString() {
		String cadena="\nYema tamaño="+this.tamaño+"\nYema.estado= "+this.estado;
		return cadena;
	}
	
}
