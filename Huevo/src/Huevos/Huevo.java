package Huevos;
import Huevos.Clara;
import Huevos.Yema;
public class Huevo {
	private char nombre;
	private String color;
	private String estado;
	public Yema yema1;
	public Clara clara1;
	
	public Huevo() {
		this.nombre='a';
		this.color="Blanco";
		this.estado="Bien";
		yema1=new Yema();
		clara1=new Clara();
	}
	public Huevo(char nombre,String colorHuevo, String estadoHuevo,String tamañoYema,String estadoYema) {
		this.nombre='a';
		this.color=colorHuevo;
		this.estado=estadoHuevo;
		yema1=new Yema(tamañoYema, estadoYema);
		clara1=new Clara();
	}
	

	public String toString() {
		String cadena="\nHuevo.color= "+this.color+"Huevo.estado= "+this.estado;
		System.out.println(yema1.toString());
		System.out.println(clara1.toString());
		return cadena;
	}
	public void setClara(char nombre) {
		this.nombre=nombre;
	}
}
