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

class pruebas1 {
		static funciones Funcion1 = null;
		static int pruebasrealizadas = 0;
		
		@BeforeAll
		static void prepararPruebas() {
			System.out.println("Estamos esperando para realizar las pruebas");
			Funcion1 = new funciones();
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
			Funcion1 = null;
		}
			
			//****PRUEBAS DE CAJA NEGRA****\\
		
		@Test
		@DisplayName("Caja NEGRA con valor limite inferior")
		void PruebaFuncion1(){
			assertEquals(true, funciones.funcion1("hola me llamo carlos y estoy haciendo una pruebas para recu")); 
			// Hay 22 "vocales" por lo tanto hemos llegado al limite de la edad que es 22.
		}
		
		@Test
		@DisplayName("Caja NEGRA con valor limite inferior -1")
		void Prueba2Funcion1(){
			assertEquals(false, funciones.funcion1("hola me llamo carlos y estoy haciendo una pruebas para re")); 
			// Hay 21 "vocales" por lo tanto no superamos el limite de mi edad que es 22.
		}
		
		@Test
		@DisplayName("Caja NEGRA con valor nulo")
		void Prueba3Funcion1() {
			assertNull(null, funciones.funcion1("")); 
		}
		
		@Test
		@DisplayName("Caja NEGRA con equivalentes")
		void Prueba4Funcion1() {
			assertEquals(true, funciones.funcion1("Huele a aire de primavera, tengo alergia en el corazón, voy cantando por la carretera"));
			// Seria un caso valido porque hemos colocado una cadena de String y es de caso positivo, porque supera el total de vocales mi edad.
		}
		
			//****PRUEBAS DE CAJA BLANCA****\\
		
		@Test
		@DisplayName("Prueba caja blanca, cobertura de decisiones")
		void Prueba5Funcion1() {
			assertEquals(true, funciones.funcion1("la giralda presume orgulloza de ver al sevilla en el sanchez pizjuan"));
			// La primera condicion es que nos salga True y para eso nos basta con que tener mas vocales y superar mi edad(22)
		}
			
		@Test
		@DisplayName("CPrueba caja blanca, cobertura de decisiones")
		void Prueba6Funcion1() {
			assertEquals(false, funciones.funcion1("Un catorce de octubre nacio una ilusion"));
			// La segunda condicion es que nos salga false y para eso el numero de vocales no debe superar al numero de mi edad(22)
			
		}
		
		@Test
		@DisplayName("Prueba caja blanca, cobertura de condiciones")
		void Prueba7Funcion1() {
			assertEquals(true, funciones.funcion1("Esperemos que empieze la liga de futbol el 12 de junioo"));
			//La condición será que el valor de mi edad (22) será igual al numero de vocales
	
		}
		@Test
		@DisplayName("CPrueba caja blanca, cobertura de condiciones")
		void Prueba8Funcion1() {
		assertEquals(false, funciones.funcion1("Carlos Garcia Acevedo"));
		///La condición será que el valor de mi edad (22) será mayor al numero de vocales.
		}
	}
											//********Fin de nuestra Prueba********\\
