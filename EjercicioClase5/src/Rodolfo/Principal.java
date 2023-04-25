package Rodolfo;

public class Principal {

public static void main(String[] args) {
		
		Persona persona1 = new Persona("mariana", "gonzales", "23232323", 01/01/00);
		Persona persona2 = new Persona("Pedro", "Sousa", "41222222", 01/12/2005);
		
		persona1.saludar();
		persona2.saludar();
		
		@SuppressWarnings("unused")
		String nombre = persona1.getNombre();
		
		
}

}


