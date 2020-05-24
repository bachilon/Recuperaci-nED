package Tests;

import static org.junit.jupiter.api.Assertions.*;
		import org.junit.jupiter.api.AfterAll;
		import org.junit.jupiter.api.AfterEach;
		import org.junit.jupiter.api.BeforeAll;
		import org.junit.jupiter.api.BeforeEach;
		import org.junit.jupiter.api.DisplayName;
		import org.junit.jupiter.api.Test;

import Funciones.funciones;
		class pruebas3 {
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
				System.out.println("Ejecutando el test...  ");
			}
			
			@AfterAll
			static void finPruebas() {
				System.out.println("Pruebas realizadas con éxito");
				funcion = null;
			}
			
				//****PRUEBAS DE CAJA NEGRA****\\
			
			@DisplayName("Caja NEGRA con valor limite inferior")
			@Test
			void PruebaFuncion3() {
		        assertEquals(36, funciones.funcion3(new int[] {11, 12, 13})); 
		        // Probamos el limite inferior que en este caso seria 11 que entraria en la suma y para que nos salga una suma, pues hemos añadido los dos siguientes numeros del 11 (12,13)
			}
			@DisplayName("Caja NEGRA con valor limite inferior -1")
			@Test
			void Prueba2Funcion3() {
		        assertEquals(11, funciones.funcion3(new int[] {11, 10, 9}));
		        // Probamos los numeros de abajo del limite inferior que seria 10, 9. Podemos comprobar que no hacer ninguna suma con los demas numero y el resultado nos daria es 11.
			}
			@DisplayName("Caja NEGRA con valor limite superior")
			@Test
			void Prueba3Funcion3() {
		        assertEquals(63, funciones.funcion3(new int[] {22, 21, 20}));
		        
		        // Probamos el numero superior que es 22 y despues los numero que esta dentro de ese rango que es 22 y 20 para que nos de una suma de 63.
			}
			@DisplayName("Caja NEGRA con valor limite superior +1")
			@Test
			void Prueba4Funcion3() {
		        assertEquals(22, funciones.funcion3(new int[] {22, 23, 24}));
		     // Probamos el numero superior que es 22 y despues los numero que esta arriba de ese rango que es 23 y 24. Podemos comprobar que solo no nos hacer ninguna suma y solo nos devuelve el numero 22.
			}
			
				//****PRUEBAS DE CAJA BLANCA****\\
			
			@DisplayName("Caja BLANCA cobertura de condiciones")
			@Test
			void Prueba5Funcion3() {
		        assertEquals(48, funciones.funcion3(new int[] {14, 16, 18, 5, 1, 3}));
		        // Con estos valores comprobamos que nos sumen los numeros menores que nuestra edad "22" mientras que los otros no cumplirian
		        //la condicion al ser la suma de los numeros menor que la mitad de mi edad "11"
			}
			@DisplayName("Caja BLANCA cobertura de decisiones")
			@Test
			void Prueba6Funcion3() {
		        assertEquals(0, funciones.funcion3(new int[] {9, 24, 30}));
		        // Vamos a decidir que el valor que salga sea nulo, por lo que vamos a poner valores que esten por encima y por debajo de los limites
			}
		    @DisplayName("Prueba caja blanca, cobertura de condiciones")
			@Test
			void Prueba7Funcion3() {
		        assertEquals(53, funciones.funcion3(new int[] {12, 19, 22}));
		        
		        //Hacemos una condicion en la quenos devuelva la suma de dichos numeros.
			}
			@DisplayName("Prueba caja blanca, cobertura de condiciones")
			@Test
			void Prueba8Funcion3() {
		        assertEquals(0, funciones.funcion3(new int[] {-5, -20, -24}));
		        //Hacemos una condicion en la que los 3 numeros colocados sean negativos, para que entren en el rango establecido y nos dará como resultado 0.
			}

		}
											//********Fin de nuestra Prueba********\\

