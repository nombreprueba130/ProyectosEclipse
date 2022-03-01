package usuarios;

public class Logistica extends Empleado{
	private String tipo;
	private final int porcentaje=3;
	public Logistica() {
		this.tipo="Lampa";
		super.setDni("Gustavo");
		super.setNombre("Gustavo");
	}
	public int subeSueldo() {
		sueldo=(sueldo)+(porcentaje*100/sueldo);
		return sueldo;
	}
}

