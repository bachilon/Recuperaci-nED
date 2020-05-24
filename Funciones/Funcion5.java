package Funciones;

	public class Funcion5 {
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
