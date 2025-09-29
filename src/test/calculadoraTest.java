package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion2A.calculadora;

class calculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before all");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int valorEsperado = 7; 
		int valorReal = calculadora.suma(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testResta() {
		int valorEsperado = 1; 
		int valorReal = calculadora.suma(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testMultiplica() {
		int valorEsperado = 12; 
		int valorReal = calculadora.suma(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testDivide() {
		int valorEsperado = 1; 
		int valorReal = calculadora.suma(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

}
