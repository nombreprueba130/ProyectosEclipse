public class Calculadora {
	private int num1;
	private int num2;

	
	public Calculadora(int a,int b) {
		this.num1= a;
		this.num2 = b;
	}
	public int suma() {
		int resul = this.num1+this.num2;
		return resul;
	}
	public int resta() {
		int resul = this.num1-this.num2;
		return resul;
	}
	public int multiplica() {
		int resul = this.num1*this.num2;
		return resul;
	}
	public int divide() {
		int resul = this.num1/this.num2;
		return resul;
	}
	
}

