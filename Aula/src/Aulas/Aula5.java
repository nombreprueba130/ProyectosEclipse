//No tiene toString
package Aulas;

public class Aula5 {
	
	public static void pulsarBoton(Ordenador miOrdenador){
		System.out.println(Aula.getInterruptor());
		if(Aula.getInterruptor()==true) {
			if(miOrdenador.getBoton()==true) {
				miOrdenador.setBoton(false);
				Ordenador.consumoGeneral=Ordenador.consumoGeneral-miOrdenador.getconsumo();//Se le resta consumo si se apaga
				System.out.println("El boton del ordenador esta apagado");
			}else {
				miOrdenador.setBoton(true);	
				Ordenador.consumoGeneral=Ordenador.consumoGeneral+miOrdenador.getconsumo();//Se le suma consumo si se enciende
				System.out.println("El boton del ordenador esta encendido");
			}
		}else { System.out.println("Encienda el interruptor de clase si quiere encender el ordenador");}
	}
	public static void pulsarInterruptor() {
		if(Aula.getInterruptor()==false) {
			Aula.setInterruptor(true);
			System.out.println("El interruptor esta encendido");
		}else { 
			System.out.println("El interruptor esta apagado");
			Aula.setInterruptor(false);
			Ordenador.consumoGeneral=0;//Funciona porque esta en protected no hace falta poner el setter
		}
	}
	public boolean esta_encendido(Ordenador miOrdenador){
		boolean encendido;
		if(miOrdenador.getBoton()==true) {
			System.out.println("Encendido");
			encendido=true;
		}else {
			System.out.println("Apagado");
			encendido=false;
		}
		return encendido;
	}
	public static void verConsumoGeneral() {
		System.out.println("Consumo General es : "+Ordenador.consumoGeneral);//Funciona porque esta en protected no hace falta poner el setter
	}
	public static void main(String[] args) {
		//Generar aula
		/*pulsarInterruptor();
		Ordenador ordenata1=new Ordenador();
		Ordenador ordenata2=new Ordenador();
		pulsarBoton(ordenata1);
		verConsumoGeneral();
		pulsarBoton(ordenata2);
		verConsumoGeneral();*/	
		pulsarInterruptor();
		Ordenador ordenata1=new Ordenador(100);
		pulsarBoton(ordenata1);
		verConsumoGeneral();
		pulsarInterruptor();
		pulsarInterruptor();
		Ordenador ordenata2=new Ordenador(500);
		pulsarBoton(ordenata2);
		verConsumoGeneral();
	}
	
}
