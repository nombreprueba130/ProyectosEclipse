//No tiene toString
package Aulas;

public class Ordenador {
	private boolean boton;
	int consumoOrdenador;
	protected static int consumoGeneral=0;
	public Ordenador() {
		boton=false;
		consumoOrdenador=100;
	}
	//Ordenador
	public Ordenador(int consumoOrdenador) {
		boton=false;
		this.consumoOrdenador=consumoOrdenador;
	}
	public Ordenador(boolean interruptor) {
		this.boton=interruptor;
	}
	//Boton
	public void setBoton(boolean boton) {
		this.boton=boton;
	}
	public boolean getBoton() {
		return this.boton;
	}
	//Consumo de ordenador
	public void setconsumo(int consumoOrdenador) {
		this.consumoOrdenador=consumoOrdenador;
	}
	public int getconsumo() {
		return this.consumoOrdenador;
	}
	
	//Operaciónd de consumoGeneral
	/*public static void calcularConsumoGeneral(Ordenador z1) {
		consumoGeneral=0;
		if(z1.boton==true) {
		consumoGeneral=consumoGeneral+z1.consumoOrdenador;
		}else if(consumoGeneral!=0){
			consumoGeneral=consumoGeneral-z1.consumoOrdenador;
		}
	}*/
}