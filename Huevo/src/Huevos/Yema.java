package Huevos;

public class Yema {
	private String tama�o;
	private String estado;

	public Yema() {
		this.tama�o="Grande";
		this.estado="Bueno";
	}
	public Yema(String tama�o,String estado) {
		this.tama�o=tama�o;
		this.estado=estado;
	}
	public String toString() {
		String cadena="\nYema tama�o="+this.tama�o+"\nYema.estado= "+this.estado;
		return cadena;
	}
	
}
