package Rodolfo;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args){
		
		int  numerosOrdenados = ordenarNumeros(6, 3, 9, "asc");
		System.out.println(Arrays.toString(numerosOrdenados));
	
	}

	public static int ordenarNumeros(int n1, int n2, int n3, String orden) {
		int[] vector = new int[] {n1, n2, n3}; 		
		
		for (int i =0; i < vector.length; i++) {
			System.out.println("i"   +vector[i]);
			
			for (int j =0; j < vector.length; j++) {
				System.out.println(" j  " + vector[i]);
				if(orden.equals("asc")) {
					if(vector[i]>vector[j]) {
						System.out.println("Este es el Mayor" + vector [i]);
						int temp = vector[i];
						vector[i] = vector[j];
						vector[j] = vector[i];		
					}
				}
				else if(orden.equals("desc")) {
					if(vector[i]<vector[j]) {
						System.out.println("Este es el Menor" + vector [i]);
						int temp = vector[i];
						vector[i] = vector[j];
						vector[j] = vector[i];
					}
				}
				
			}
		}
		return n3; // ???
					
	}
}
	
				
		
	
