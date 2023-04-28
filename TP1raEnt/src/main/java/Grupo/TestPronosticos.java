package Grupo;

public class TestPronosticos {


	
	void testPartidos() {
		MegaConstructor mega;
		mega = new MegaConstructor("Pronosticos.csv", "Resultados.csv"); 
		mega.Correlation();	
		assertEquals(mega.getCantidadDePartidos(), 14);
	}

	private void assertEquals(int cantidadDePartidos, int i) {
		
		
	}


	void testParticipantes() {
		MegaConstructor mega;
		mega = new MegaConstructor("Pronosticos.csv", "Resultados.csv"); 
		mega.Correlation();	
		assertEquals(mega.getCantidadDeParticipantes() , 2);
	}

}

