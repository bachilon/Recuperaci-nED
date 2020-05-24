package Tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.funciones;

class pruebas2 {

		static funciones funcion = null;
		static int pruebasrealizadas = 0;
		
		@BeforeAll
		static void prepararPruebas() {
			System.out.println("PEstamos esperando para realizar las pruebas");
			funcion = new funciones();
		}
		
		@BeforeEach
		private void EjecutarPruebas() {
			pruebasrealizadas++;
			System.out.println("Cargando pruebas...");
		}
		
			//****PRUEBAS DE CAJA NEGRA****\\
		
		@AfterEach
		private void terminadoPruebas() {
			System.out.println("Ejecutando el test...");
		}
		
		@AfterAll
		static void finPruebas() {
			System.out.println("Pruebas realizadas con éxito");
			funcion = null;
		}
		
		//****PRUEBAS DE CAJA NEGRA****\\
		
		@Test
		@DisplayName("Caja NEGRA con valor nulo")
		void PruebaFuncion2(){
			assertNull(null, funciones.funcion2("carlos", "carlos")); 
			// Si las dos cadenas tienen el mismo numero de consonantes nos saldria null.
		}
		
		@Test
		@DisplayName("Caja NEGRA aleatoria con grupo equivalente")
		void Prueba2Funcion2() {
			assertEquals("carlos", funciones.funcion2("carlos", "garcia")); //
			//Probamos que la primera cadena "carlos" tiene mas consonantes que la segunda cadena "garcia"
		}
		
		@Test
		@DisplayName("Caja NEGRA aleatoria con grupo equivalente")
		void Prueba3Funcion2() {
			assertEquals("carlos", funciones.funcion2("sol", "carlos")); //
			//Probamos que la segunda cadena "carlos" tiene mas consonantes que la primera cadena "sol"
		}
		
		@Test
		@DisplayName("Caja NEGRA con valor vacio")
		void Prueba4Funcion2() {
			assertEquals(null, funciones.funcion2(" ", " ")); //
			//Prueba de caja negra en la que probamos que las dos cadenas no tienen valor y saldria nulo.
		}
		
			//****PRUEBAS DE CAJA BLANCA****\\
		
		@Test
		@DisplayName("Caja BLANCA de cobertura de caminos")
		void Prueba5Funcion2() {
			assertEquals(null, funciones.funcion2("Carlos Garcia", "Beatriz Garcia")); //
			//La cadena primera cadena y la segunda cadena tienen el mismo numero de consonantes = NULL;
		}
		
		@Test
		@DisplayName("Caja BLANCA de cobertura de caminos")
		void Prueba6Funcion2() {
			assertEquals("carlos garcia", funciones.funcion2("carlos garcia", "sevilla")); //
			//La primera cadena "carlos garcia" tiene mas consonantes que la segunda cadena "sevilla"
		}
		
		@Test
		@DisplayName("Caja BLANCA de cobertura de caminos")
		void Prueba7Funcion2() {
			assertEquals("luna llena", funciones.funcion2("Sol", "luna llena")); //
			//La  primera cadena "sol" tiene menos consonantes que la segunda cadena "luna llena"
		}
		
		@Test
		@DisplayName("Prueba caja blanca, cobertura de decisiones ")
		void Prueba8Funcion1() {
			assertEquals("estrella", funciones.funcion2("estrella", "luna"));
			// Queremos una condicion en la que la primera cadena "estrella"  tenga mas consonantes que la segunda cadena "luna"
			
		}
}

										//********Fin de nuestra Prueba********\\
