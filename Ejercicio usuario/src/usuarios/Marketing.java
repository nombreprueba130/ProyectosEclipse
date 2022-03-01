package usuarios;

public class Marketing extends Empleado{
	private String tipo;
	private final int porcentaje=1;
	public Marketing() {
		super.sueldo=1000;
		super.setCodEmpleadoPredefinido(1);
		super.setNombre("Federico");
		super.setDni("234567890A");
		
	}
	public int subeSueldo() {
		sueldo=(sueldo)+(porcentaje*100/sueldo);
		return 0;
	}
}
