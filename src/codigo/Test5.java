package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test5 {
	
	Funciones f = new Funciones();
	
	@DisplayName("Prueba de Caja Negra con valor límite inferor en T=300")
	@Test
	/*
	 * Para probar el funcionamiento de nuestra funcion
	 * con el valor limite inferior le paso el siguiente array 
	 * dimensional tiempo, que sumaran 300.
	 */
	void test1() {
		int[][] tiempo= {{100, 100, 100},{100, 100, 100},{100, 100, 100}};
		String[] alumnos = {"javi", "javi", "javi"};
		assertEquals(false, f.trabajosTiempo(alumnos, tiempo));
	}

}
