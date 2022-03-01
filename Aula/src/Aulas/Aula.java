//No tiene toString
package Aulas;

public class Aula {
	private static boolean interruptor;
	
	public Aula() {
		interruptor=false;
	}
	public Aula(boolean interruptor) {
		Aula.interruptor=interruptor;
	}
	public static void setInterruptor(boolean interruptor) {
		Aula.interruptor=interruptor;
	}
	public static boolean getInterruptor() {
		return interruptor;
	}
	
}
