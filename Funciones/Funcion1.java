package Funciones;

public class Funcion1 {

	public static Boolean Funcion1(String cadena) {
		Boolean result = null;
	    int edad = 22;
	    int contador = 0;
	 
	    for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'A')
					|| (cadena.charAt(i) == 'E') || (cadena.charAt(i) == 'I') || (cadena.charAt(i) == 'O')
					|| (cadena.charAt(i) == 'U') || (cadena.charAt(i) == '�')|| (cadena.charAt(i) == '�')
					|| (cadena.charAt(i) == '�')|| (cadena.charAt(i) == '�')|| (cadena.charAt(i) == '�')
					|| (cadena.charAt(i) == '�')|| (cadena.charAt(i) == '�')|| (cadena.charAt(i) == '�')
					|| (cadena.charAt(i) == '�')|| (cadena.charAt(i) == '�')) {
				
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
}