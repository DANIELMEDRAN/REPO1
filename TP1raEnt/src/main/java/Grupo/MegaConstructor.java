package Grupo;

import java.util.ArrayList;

public class MegaConstructor {

	private int cantidadDeParticipantes;
	private int cantidadDePartidos;

	private ArrayList<Partido> todosLosPartidos = new ArrayList<Partido>();
	private ArrayList<Pronostico> pronosticos = new ArrayList<Pronostico>();
	private static ListaPronosticos pronoList;

	public MegaConstructor(String archivoDePronosticos, String archivoDeRondas) {
		LoadPartidos(archivoDeRondas); 
		pronoList = new ListaPronosticos(archivoDePronosticos);
		if (pronoList.isFileOK()) 
		pronosticos.addAll(pronoList.getPronosticosEnlistados());
	}

	public int getCantidadDeParticipantes() {
		cantidadDeParticipantes= pronoList.getParticipantes().getCantidadParticipantes();
		return cantidadDeParticipantes;
	}

	public int getCantidadDePartidos() {
		cantidadDePartidos = this.todosLosPartidos.size();
		return cantidadDePartidos;
	}

	public ArrayList<Partido> getTodosLosPartidos() {
		return this.todosLosPartidos;
	}

	public void setPronosticos(ArrayList<Pronostico> pronosticos) {
		this.pronosticos = pronosticos;
	}


	public void Correlation() {
		
		for (int i=0; i<pronosticos.size(); i++) {
			Pronostico prono = pronosticos.get(i);
	        String nombrePartic = prono.getPartic();
	    	int idPartido= getPartido();
			 	if (!prono.getApuesta().equals(ResultadoEnum.SinDefinir)) { 
	        	boolean encontrado = false;
	        	int j=0; 
	        	while (j<todosLosPartidos.size() && !encontrado) {
	        		encontrado = (todosLosPartidos.get(j).getId()==idPartido);
	        		if (!encontrado) j++;
	        	} 
	        	if (encontrado) {
	        		if (todosLosPartidos.get(j).getResultado().equals(prono.getApuesta())) {
	        			Participante partic = pronoList.getParticipantes().searchParticipante(nombrePartic);
	        			partic.setPuntosAcumulados(1+partic.getPuntosAcumulados()); 
	        		}
	        	}
	        }
		}
	}


	private int getPartido() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void LoadPartidos(String archivoDeRondas ) {
			Ronda rondas= new Ronda(archivoDeRondas);	
			
			if (rondas.allOK())
			this.todosLosPartidos.addAll(rondas.getPartidos());
	System.out.println("Total de partidos jugados: "+todosLosPartidos.size());
	}

	public void ShowResultadosDeParticipantes() {
		System.out.println(pronoList.getParticipantes().getCantidadParticipantes()+" participantes:");
		
		for (int i=0; i<pronoList.getParticipantes().getCantidadParticipantes(); i++) {
			Participante partic = pronoList.getParticipantes().getParticipante(i);
			if (partic!=null)
		    System.out.println(i+1+") "+partic.getNombreParticipante()+" tiene "+partic.getPuntosAcumulados()+" puntos acumulados");
		}		
	}

}

