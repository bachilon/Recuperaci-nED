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
class pruebas5 {

		
		static funciones funcion = null;
		static int pruebasrealizadas = 0;
		
		@BeforeAll
		static void prepararPruebas() {
			System.out.println("Estamos esperando para realizar las pruebas");
			funcion = new funciones();
		}
		
		@BeforeEach
		private void EjecutarPruebas() {
			pruebasrealizadas++;
			System.out.println("Cargando pruebas...");
		}
		
		@AfterEach
		private void terminadoPruebas() {
			System.out.println("Ejecutando el test...");
		}
		
		@AfterAll
		static void finPruebas() {
			System.out.println("Pruebas realizadas con éxito");
			funcion = null;
		
			//****PRUEBAS DE CAJA NEGRA****\\
		}
		
		@DisplayName("Prueba caja NEGRA con cadena vacia")
		@Test
		void PruebaFuncion5() {
			assertEquals(null, funciones.funcion5("", 2, 10));
			
			// Dejamos un hueco vacio en el signo de la operacion y nos devuelve un valor vacio.
		}
		@DisplayName("Prueba caja NEGRA con un caracter")
		@Test
		void Prueba2Funcion5() {
			assertEquals(0, funciones.funcion5("C", 2, 10));
			// Con este caracter "C" en el signo de la operacion nos devuelve el valor 0, esto es debido a que no es un signo de operacion.
		}
		@DisplayName("Prueba caja NEGRA con valor aleatorio")
		@Test
		void Prueba3Funcion5() {
			assertEquals(56311122, funciones.funcion5("*", 1234, 45633));
			
			// Hemos elegido dos numero al azar, donde el resultado de la multiplicacion ha sido 56311122
		}
		
		@DisplayName("Prueba caja NEGRA con valor limite inferior")
		@Test
		void Prueba4Funcion5() {
			assertEquals(0, funciones.funcion5("-", 2147483647, 2147483647));
			
			// Buscando en internet el valor limite inferior es de 2147483647 y nos daria como resultado 0.
		}
		
		//****PRUEBAS DE CAJA BLANCA****\\
		
		@DisplayName("Prueba caja blanca cobertura de condiciones")
		@Test
		void Prueba5Funcion5() {
			assertEquals(12, funciones.funcion5("+", 2, 10));
			
			//Condicion del signo es una suma y por tanto se suman los dos numeros.
		}
		@DisplayName("Prueba caja blanca cobertura de condiciones")
		@Test
		void Prueba6Funcion5() {
			assertEquals(-8, funciones.funcion5("-", 2, 10));
			
			//Condicion signo es una resta y por tanto se restan los dos numeros.
		}
		@DisplayName("Prueba caja blanca cobertura de condiciones")
		@Test
		void Prueba7Funcion5() {
			assertEquals(20, funciones.funcion5("*", 2, 10));
			
			//Condicion signo es una multiplicacion y por tanto se multiplican los dos numeros.
		}
		@DisplayName("Prueba caja blanca cobertura de condiciones")
		@Test
		void Prueba8Funcion5() {
			assertEquals(0, funciones.funcion5("/", 2, 10));
			//En esta ultima prueba vamos a hacer que nos devuelva el valor= 0, los números que vemos pertenecen al dia y al mes de mi nacimiento.
		}

	}
									//********Fin de nuestra Prueba********\\
