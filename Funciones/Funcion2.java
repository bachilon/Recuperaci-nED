package Funciones;

public class Funcion2 {

	public String funcion2(String cadena, String cadena2) {
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
}
				
	

	