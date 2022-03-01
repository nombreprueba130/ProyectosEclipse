package usuarios;

public class Comercial extends Empleado{
	String area;
	private final int porcentaje=2;
	public Comercial() {
		super.sueldo=1000;
		super.setCodEmpleadoPredefinido(2);
		super.setNombre("Arturo");
		super.setDni("123214325A");
		
	}
	public  int subeSueldo(){
		sueldo=(sueldo)+(porcentaje*100/sueldo);
		return 0;
	}
	
}
