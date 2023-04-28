package Grupo;

public class Pronostico {

	private Partido partido;
	private Equipo equipo;
	private int idDelPronostico;
	private int idDelPartido;
	private ResultadoEnum resultado;
	
	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum campos) {
		int idPartido = 0;
		this.idDelPartido = idPartido;
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = campos;
	}
	public Pronostico(String nombreParticipante, int idPartido, ResultadoEnum intToEnum) {
		
	}
	public Partido getPartido() {
		return this.partido;
	}
	public Equipo getEquipo() {
		return this.equipo;
	}
	public ResultadoEnum getResultado() {
		return this.resultado;
	}
	
	public int puntos() {
		ResultadoEnum resultadoReal = this.partido.Resultado(this.equipo);
		if(this.resultado.equals(resultadoReal)) {
			return 1;
	}	else {
			return 0;
	}
	}
	public Object getApuesta() {
		return null;
	}
	public String getPartic() {
		
		return null;
	}
}
