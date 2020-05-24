package Funciones;

	public class Funcion3 {
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
}