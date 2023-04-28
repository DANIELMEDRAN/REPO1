package Grupo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ListaPronosticos {

	private ArrayList<Pronostico> listaDePronosticos= new ArrayList<Pronostico>();
	private ListaParticipantes listaParticipantes= new ListaParticipantes();
	private boolean fileOK; 

	public ListaPronosticos(String fileName) {
		loadPronosticos(fileName);
	}

	public ArrayList<Pronostico> getPronosticosEnlistados() {
		return listaDePronosticos;
	}

	public ListaParticipantes getParticipantes() {
		return listaParticipantes;
	}

	public boolean isFileOK() {
		return fileOK;
	}

	public void loadPronosticos(String fileName) {
		Path path = Paths.get(fileName);
		boolean exists = Files.exists(path);
		List<String> pronosticos = null; 
		this.fileOK= exists; 
		if (exists) {
		try {
			pronosticos = Files.readAllLines(path);
			for (int i=0; i<pronosticos.size(); i++) { 
		        String[] datos = pronosticos.get(i).split(";");
		        String nombreParticipante = datos[0]; 		
		        int idPartido = Integer.parseInt(datos[1]); 
		        int apuesta = Integer.parseInt(datos[2]); 	
		        Pronostico pronostico= new Pronostico(nombreParticipante, idPartido, intToEnum(apuesta));
		        this.listaParticipantes.addParticipante(nombreParticipante);  	
		        if (pronostico!=null) this.listaDePronosticos.add(pronostico); 	
			}
		} catch(IOException e) {
			this.fileOK= false;
			System.out.println("El archivo de datos ["+fileName+"] es inv�lido o est� corrompido.");
		}}
		else System.out.println("El archivo de datos ["+fileName+"] no existe o est� en otra ubicaci�n.");

	}
	public static ResultadoEnum intToEnum(int valor) {
		if (valor==0) {
			return ResultadoEnum.Empate;
		}
		else if (valor==1) {
			return ResultadoEnum.GanaEquipo1;
		}
		else if (valor==2) {
			return ResultadoEnum.GanaEquipo2;
		}
		else return ResultadoEnum.SinDefinir;
	}

}

