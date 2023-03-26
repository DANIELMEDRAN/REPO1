package Rodolfo;

public class Ejercicio1 {
	
	public static void main(String[] args) { 
		
		int cantidadDeLetras = cantidadDeApariciones("acantilados", "a");		
		System.out.println("La cantidad de letras es: " + cantidadDeLetras);	
	}			
		
	public static int cantidadDeApariciones(String palabra, char letra) {
		int cantidadDeLetras = 0;
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
			if(palabra.charAt(i)==letra){
				cantidadDeLetras++;
		
			}
		
		}
		return cantidadDeLetras;
	}
		
}	
