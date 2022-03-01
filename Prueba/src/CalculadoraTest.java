import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private static Calculadora calcu;
	private double resultado;
	@BeforeAll
	public static void creaCalculadora() {
		calcu = new Calculadora (20, 10);
		System.out.println("AfterAll Ejecutandose");
	}
	@AfterAll
	public static void borraCalculadora() {
		calcu = null;
		System.out.println("BeforeAll Ejecutandose");
	}
	@Test
	public void testSuma() {
		double valorEsperado = 30;
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void testResta() {
		double valorEsperado = 10;
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testMultiplica() {
		double valorEsperado = 200;
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0, 
									"Fallo en la multiplicación: ");
	}

	@Test
	public void testDivide() {
		double valorEsperado = 2;
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}
}