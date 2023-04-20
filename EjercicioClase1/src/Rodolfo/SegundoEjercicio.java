package Rodolfo;

public class SegundoEjercicio {
	
	public static void main(String[] args) {
		
		float ingresosMensuales = 100000;
		int cantidadInmuebles = 1 ;
		int antiguedadVehiculo = 1 ;
		int cantidadVehiculos = 1 ;
		boolean poseeEmbarcacionDeLujo = false;
		
		if ( ingresosMensuales >= 489083 || (cantidadVehiculos >= 3 && antiguedadVehiculo <= 5) || cantidadInmuebles >= 3 || poseeEmbarcacionDeLujo == true ) {
		
		System.out.println("Pertenece a Altos Ingresos");
		}
		else {
		System.out.println("No Pertenece a Altos Ingresos");
		}
		
	}
			
}