package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test2 {

	Funciones f = new Funciones();
	
	// Son dos posibilidades
		// 1. Se cumplen las dos condiciones (true)
		// 2. No se cumple ninguna(false)
	
	@DisplayName("Prueba de Blanca de Cobertura de condiciones 1")
	@Test
	/*
	 * En este primero estudiamos el comportamiento de la 
	 * funcion si cumple ambas condiciones numero>=100 y
	 * numero<=200
	 */
	void test1() {
		assertTrue(f.numeroIntervalo(150));
	}
	
	
	@DisplayName("Prueba de Blanca de Cobertura de condiciones 2")
	@Test
	/*
	 * En este estudiamos el comportamiento de la 
	 * funcion si no se cumple ninguna
	 */
	void test2() {
		assertEquals(false, f.numeroIntervalo(80));
	}
	

}
