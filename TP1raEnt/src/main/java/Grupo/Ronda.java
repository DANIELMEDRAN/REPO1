package Grupo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Ronda {

	private int numeroDeRonda; 
	private boolean fileOK;   
	private ArrayList<Partido> partidos= new ArrayList<Partido>();

	public Ronda (int rondaNro, String fileName) {
		this.numeroDeRonda= rondaNro;
		this.loadRonda(fileName);
	}

	public Ronda(String archivoDeRondas) {
		
	}

	public int getNumeroDeRonda() {
		return numeroDeRonda;
	}

	public void setNumeroDeRonda(int numeroDeRonda) {
		this.numeroDeRonda = numeroDeRonda; 
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	
	public boolean isFileOK() {
		return fileOK;
	}

	public void loadRonda(String fileName) {
		Path path = Paths.get(fileName);
		boolean exists = Files.exists(path);
		List<String> partidosDeLaRonda = null; 
		this.fileOK= exists; 
		if (exists) {
		try {
			partidosDeLaRonda = Files.readAllLines(path);
			for (int i=0; i<partidosDeLaRonda.size(); i++) { 
		        
		        String[] datos = partidosDeLaRonda.get(i).split(";");
		        Equipo equipo1 = new Equipo(datos[0]); 
		        Equipo equipo2 = new Equipo(datos[3]); 
		        Partido partido= new Partido(this.numeroDeRonda+i+1, equipo1, equipo2, Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
		        if (partido!=null) this.partidos.add(partido); 
			}
		} catch(IOException e) {
			this.fileOK= false;
			System.out.println("El archivo de datos es invalido");
		}}
		else System.out.println("El archivo de datos no existe.");
	}

	public boolean allOK() {
		
		return false;
	}

}
