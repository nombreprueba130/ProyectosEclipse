package usuarios;

public abstract class Empleado extends Usuario {
	protected int sueldo;
	private int codEmpleado;
	public String pintaDatos() {
		String cadena;
		cadena="nombre"+super.getNombre()+"\nDNI: "+super.getDni()+"\nSueldo: "+sueldo+"\n"+"codEmpleado: "+codEmpleado;
		return cadena;
	}
	public abstract int subeSueldo();
	public void setCodEmpleadoPredefinido(int codEmpleado) {
		this.codEmpleado=codEmpleado;
	}
}
