package coches;

public class Taller {

	public static void main(String[] args) {
		/*Coche coches[]=new Coche[4];
		
		coches[2]=new Coche(300);
		coches[0]=new Coche(100);
		coches[1]=new Coche(500);
		coches[3]=new Coche(200);
		ordenar(coches);
		System.out.println(mostrarPrecio(coches[0]));
		System.out.println(mostrarPrecio(coches[1]));
		System.out.println(mostrarPrecio(coches[2]));
		System.out.println(mostrarPrecio(coches[3]));
		Coche coche1=new Coche();
		coche1.arrancar();
		coche1.acelerar();
		coche1.acelerar();
		coche1.Frenar();
		coche1.detenerse();
		coche1.Frenar();
		coche1.detenerse();*/
		/*Aceleara frenar syso arrancar acelera frenar frenar aplicar un decuento del 50% */
		
		Coche coche1=new Coche(100);
		coche1.acelerar();
		coche1.frenar();
		Coche.cambiarDescuento(50);
		coche1.arrancar();
		coche1.acelerar();
		coche1.frenar();
		coche1.frenar();
		
		Coche coche2=new Coche(1000);
		coche2.verPrecio();
	}
	public static void ordenar(Coche coches[]) {
		Coche copia;
		for (int a = 0; a < coches.length; a++) {
			
			for (int hDerecha = a; hDerecha < coches.length; hDerecha++) {
				if(coches[a].getPrecio()>coches[hDerecha].getPrecio()) {
					copia=coches[a];//Se copia el objeto que queremos cambiar de sitio
					coches[a]=coches[hDerecha];//Se copia el que tiener menor fecha a index:0
					coches[hDerecha]=copia;//Se copia el que tiene mayor fecha en el index:mayor
				}							
			}
		}

	}
	public static String mostrarPrecio(Coche coche) {
		String cadena= "Precio: "+coche.getPrecio();
		return cadena;
	}
}















