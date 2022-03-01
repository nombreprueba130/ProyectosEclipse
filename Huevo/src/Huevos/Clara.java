package Huevos;

public class Clara{
	private String transparencia;
	private String estado;
	
	public Clara() {
		transparencia="Super-transparente";
		estado="Bueno";	
	}
	void batir(){
		estado="batido";
	}
	public String toString() {
		String cadena="Clara.transparencia= "+this.transparencia+"\nClara.estado= "+this.estado;
		return cadena;
	}
}
