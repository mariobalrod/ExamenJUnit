package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test2 {

	Funciones f = new Funciones();
	
	// Son tres posibilidades
		// 1. Se cumplen las dos condiciones (true)
		// 2. Se cumple solo 1(true)
		// 3. No se cumple ninguna(false)
	
	@DisplayName("Prueba de Blanca de Cobertura de condiciones 1")
	@Test
	/*
	 * En este primero estudiamos el comportamiento de la 
	 * funcion si cumplea ambas condiciones numero>=100 y
	 * numero<=200
	 */
	void test1() {
		assertTrue(f.numeroIntervalo(150));
	}
	
	@DisplayName("Prueba de Blanca de Cobertura de condiciones 2")
	@Test
	/*
	 * En este estudiamos el comportamiento de la 
	 * funcion si cumplea solo una condicion por ejemplo numero>=100,
	 * deberia de ser true.
	 */
	void test2() {
		assertTrue(f.numeroIntervalo(102));
	}
	
	@DisplayName("Prueba de Blanca de Cobertura de condiciones 3")
	@Test
	/*
	 * En este estudiamos el comportamiento de la 
	 * funcion si no se cumple ninguna
	 */
	void test3() {
		assertEquals(false, f.numeroIntervalo(80));
	}
	

}
