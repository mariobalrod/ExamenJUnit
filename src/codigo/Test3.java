package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test3 {
	
	Funciones f = new Funciones();
	
	@DisplayName("Prueba de Caja Blanca Cobertura de Sentencias")
	@Test
	/*
	 * Para cubrir todas las sentencias hay que pasarle
	 * una cadena que solo sean numeros ya que siempre que
	 * estudie el condicional entrará dentro. Por ejemplo,
	 * aqui le paso "12345"
	 */
	void test1() {
		assertEquals(15, f.sumaNumerosCadena("12345"));
	}

}
