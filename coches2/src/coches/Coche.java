package coches;

public class Coche {
	public enum marca{Abarth,BMW,Dacia,Acura,Ascari,Bugatti,Buick,BYD,Chrysler,Citroën,Dodge,Duesenberg,Infiniti,Jaguar};
	private String modelo;
	private String color;
	private int precio;
	private int puertas;
	private static int descuento;
	private int velocidad;
	private boolean MoverMotor;

	public int getPrecio() {
		return this.precio;
	}
	public Coche(){
		modelo="Luxerus";
		color="blanco";
		precio=0;
		MoverMotor=false;
		velocidad=0;
		puertas=4;
	}
	public Coche(int precio){
		modelo="Luxerus";
		color="blanco";
		this.precio=precio;
		MoverMotor=false;
		velocidad=0;
	}
	public Coche(String modelo,String color,int precio){
		this.modelo=modelo;
		this.color=color;
		this.precio=precio;
		MoverMotor=false;
		velocidad=0;
	}
	public void arrancar() {
		if(MoverMotor==false) {
			MoverMotor=true;
			System.out.println("El coche se ha arrancado");
		}else {
			System.out.println("El coche ya estaba arrancado");
		}
		
	}
	public void detenerse() {
		if(MoverMotor==true && velocidad==0) {
			MoverMotor=false;
			System.out.println("El coche se ha apagado");
		}else 	if(MoverMotor==false){
					System.out.println("El coche ya esta apagado");
				}else if(velocidad !=0) {
					System.out.println("El motor no se puede detener si no estas parado");
				}	
	}
	
	public void acelerar() {
		if(MoverMotor==true) {
			velocidad++;
			System.out.println("Tienes "+velocidad+" de velocidad");
			
		}else {
			System.out.println("El coche no esta encendido");
		}
	
	}
	public void frenar() {
		if(MoverMotor==true) {
			if(velocidad>0) {
				velocidad--;
				System.out.println("La velocidad ha bajado a "+velocidad);
			}else {
				System.out.println("El coche ya estaba parado");
			}
		}else {
			System.out.println("El motor no esta encendido");
		}
	}
	public void verPrecio() {
		System.out.println("El precio es: "+precio);
	}
	public void 

}
	
