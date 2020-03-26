package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test1 {
	
	static Funciones f = new Funciones();
	
	@DisplayName("Prueba de Caja Negra con limite superior")
	@Test
	/*
	 * Prueba de Caja Negra en la que se evalua el
	 * comportamiento de la funcion pasandole como
	 * argumento el limite superior que en este caso
	 * es 200
	 */
	void test1() {
		assertTrue(f.numeroIntervalo(200));
	}

}
