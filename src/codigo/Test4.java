package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test4 {
	
	Funciones f = new Funciones();

	@DisplayName("Prueba de Caja Blanca de Cobertura de Caminos 1")
	@Test
	/*
	 * En primer lugar paso un array con longitud 0, 
	 * para que no entre en el bucle for.
	 * Esto dara como resultado el mismo array, es decir, 
	 * no se ve modificado
	 */
	void test1() {
		double[] array = new double[0];
		assertArrayEquals(array, f.modArrayDoubles(array));
	}
	
	@DisplayName("Prueba de Caja Blanca de Cobertura de Caminos 2")
	@Test
	/*
	 * En esta pasare un array de longitud 1 para que solo entre
	 * en la condicion de par.
	 */
	void test2() {
		double[] array = {1};
		assertArrayEquals(array, f.modArrayDoubles(array));
	}
	
	@DisplayName("Prueba de Caja Blanca de Cobertura de Caminos 3")
	@Test
	/*
	 * En esta pasare un array de longitud 2 para que entre
	 * tambien en la condicion de impar
	 */
	void test3() {
		double[] array = {1, 1};
		assertArrayEquals(array, f.modArrayDoubles(array));
	}

}
