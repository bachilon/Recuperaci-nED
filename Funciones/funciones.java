package Funciones;
public class funciones {
	
//////////////////// FUNCION #1 //////////////////////

	public static Boolean funcion1(String cadena) {
		Boolean result = null;
	    int edad = 22;
	    int contador = 0;
	 
	    for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'A')
					|| (cadena.charAt(i) == 'E') || (cadena.charAt(i) == 'I') || (cadena.charAt(i) == 'O')
					|| (cadena.charAt(i) == 'U') || (cadena.charAt(i) == 'á')|| (cadena.charAt(i) == 'é')
					|| (cadena.charAt(i) == 'í')|| (cadena.charAt(i) == 'ó')|| (cadena.charAt(i) == 'ú')
					|| (cadena.charAt(i) == 'Á')|| (cadena.charAt(i) == 'É')|| (cadena.charAt(i) == 'Í')
					|| (cadena.charAt(i) == 'Ó')|| (cadena.charAt(i) == 'Ú')) {
				
				contador++;
	              
	                if (contador >= edad) {
	                    result = true;
	                } else {
	                    result = false;
	                }
	            }
	        }
	   return result;
	}

////////////////////FUNCION #2 //////////////////////

		public static String funcion2(String cadena, String cadena2) {
			String result = null;
			int contVocales = 0;
			int contVocales2 = 0;
			int contConsonantes = 0;
			int contConsonantes2 = 0;
			
				for (int i = 0; i < cadena.length(); i++) {
					if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
							|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'A')
							|| (cadena.charAt(i) == 'E') || (cadena.charAt(i) == 'I') || (cadena.charAt(i) == 'O')
							|| (cadena.charAt(i) == 'U') || (cadena.charAt(i) == 'á')|| (cadena.charAt(i) == 'é')
							|| (cadena.charAt(i) == 'í')|| (cadena.charAt(i) == 'ó')|| (cadena.charAt(i) == 'ú')
							|| (cadena.charAt(i) == 'Á')|| (cadena.charAt(i) == 'É')|| (cadena.charAt(i) == 'Í')
							|| (cadena.charAt(i) == 'Ó')|| (cadena.charAt(i) == 'Ú')|| (cadena.charAt(i) == ':')
							|| (cadena.charAt(i) == ';')|| (cadena.charAt(i) == '.')|| (cadena.charAt(i) == ',')
							|| (cadena.charAt(i) == '¿')|| (cadena.charAt(i) == '?')|| (cadena.charAt(i) == '!')
							|| (cadena.charAt(i) == '¡')|| (cadena.charAt(i) == '=')) {
						
					contVocales++;
					}
					contConsonantes = cadena.length() - contVocales;
				    }

						for (int x = 0; x < cadena2.length(); x++) {
							if ((cadena2.charAt(x) == 'a') || (cadena2.charAt(x) == 'e') || (cadena2.charAt(x) == 'i')
									|| (cadena2.charAt(x) == 'o') || (cadena2.charAt(x) == 'u') || (cadena2.charAt(x) == 'A')
									|| (cadena2.charAt(x) == 'E') || (cadena2.charAt(x) == 'I') || (cadena2.charAt(x) == 'O')
									|| (cadena2.charAt(x) == 'U') || (cadena2.charAt(x) == 'á')|| (cadena2.charAt(x) == 'é')
									|| (cadena2.charAt(x) == 'í')|| (cadena2.charAt(x) == 'ó')|| (cadena2.charAt(x) == 'ú')
									|| (cadena2.charAt(x) == 'Á')|| (cadena2.charAt(x) == 'É')|| (cadena2.charAt(x) == 'Í')
									|| (cadena2.charAt(x) == 'Ó')|| (cadena2.charAt(x) == 'Ú')|| (cadena2.charAt(x) == ':')
									|| (cadena2.charAt(x) == ';')|| (cadena2.charAt(x) == '.')|| (cadena2.charAt(x) == ',')
									|| (cadena2.charAt(x) == '¿')|| (cadena2.charAt(x) == '?')|| (cadena2.charAt(x) == '!')
									|| (cadena2.charAt(x) == '¡')|| (cadena2.charAt(x) == '=')) {
								
						contVocales2++;
					    }
						contConsonantes2 = cadena2.length() - contVocales2;
						}
								
			if (contConsonantes > contConsonantes2) {
		   result = cadena;
		   
			} else if (contConsonantes < contConsonantes2) {
		   result = cadena2;
		   
			} else if (contConsonantes == contConsonantes2) {
		   result = null;
			}
						
		return result;
		}
	
					
		
//////////////////// FUNCION #3 //////////////////////

	public static Integer funcion3(int[] listaNumeros) {
		
		int edad = 22;
		int mitadEdad = 11;
		int resp = 0;
		
		if(listaNumeros == null) {
			return null;
		}
		
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] <= edad && listaNumeros[i] >= mitadEdad) {
				resp= resp + listaNumeros[i];
			}
		}
		return resp;
	}

//////////////////// FUNCION #4 //////////////////////

	public static String funcion4(int[] notas) {
	
		String resultado = null;
		int suma = 0;
		int media = 0;
	
		if(notas == null) {
			return null;
		}
			
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		media = suma / notas.length;
			if (media < 5) {
			   resultado = "Insuficiente";
			   
			} else if (media >= 5 && media < 6) {
			   resultado = "Suficiente";
			   
			} else if (media >= 6 && media < 7) {
			   resultado = "Bien";
			   
			} else if (media >= 7 && media < 9) {
			   resultado = "Notable";
			   
			} else if (media > 9 && media == 10) {
			   resultado = "Sobresaliente";
			}
			return resultado;
}

//////////////////// FUNCION #5 //////////////////////

	public static Integer funcion5(String signo, int numero1, int numero2) {
	
		int result = 0;
				if (signo == "+") {
				result = numero1 + numero2;
				
			} else if (signo == "-") {
			   result = numero1 - numero2;
			   
			} else if (signo == "*") {
			   result = numero1 * numero2;
			   
			}
			else if(signo == "") {
				return null;
				
			} else {
			   result = 0;
			}
			return result;
	 	}
} 

