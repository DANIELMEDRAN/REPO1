package Rodolfo;

public class Ejercicio2 {

public static void main(String[] args) {
		
	int numerInicio = 5;
	int numerFin = 14;
	int contador = numerInicio;
	
		while(contador <= numerFin) {
		if(contador%2 == 0) {
           System.out.println(contador);
           
		}
		contador = contador + 1; 			    
		}
	}	
}