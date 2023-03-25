package Rodolfo;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		int numerInicio = 5;
		int numerFin = 14;
		boolean mostrarPar = true;
		
		int contador = numerInicio;

		while(contador <= numerFin) {
		if (mostrarPar == true)
		{
			if(contador%2 == 0) {
           System.out.println(contador);
			}   
		}
		else {
			if(contador%2 != 0) {
		        System.out.println(contador);
			}    
			contador = contador + 1; 			    
		    }
		}
	}	

}
