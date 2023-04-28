package Grupo;


public class Partido {
	
	private int id;
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEq1;
	private int golesEq2;
	private ResultadoEnum resultado;
	
	public Partido(int id, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.setId(id);		
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.setResultado(resultado);
	}
	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public int getGolesEq1() {
		return golesEq1;
	}
	public void setGolesEq1(int golesEq1) {
		this.golesEq1 = golesEq1;
	}
	public int getGolesEq2() {
		return golesEq2;
	}
	public void setGolesEq2(int golesEq2) {
		this.golesEq2 = golesEq2;
	}
	
	public ResultadoEnum Resultado(Equipo equipo) {
		if (golesEq1 == golesEq2) {
			return ResultadoEnum.Empate;
		}
		if(equipo.getNombre().equals(equipo1.getNombre())) {	
			if(golesEq1>golesEq2) {
				return ResultadoEnum.Ganador;
			}
		}else {
			if(golesEq2>golesEq1) {
				return ResultadoEnum.Ganador; 
			}else {
				return ResultadoEnum.Perdedor;
		}
		
	  }
		return resultado;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ResultadoEnum getResultado() {
		return resultado;
	}
	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}
	
	public String getResultadoAsString() {
		String auxStr= "";
		if (this.resultado==ResultadoEnum.Empate) {
			auxStr= "Empate entre "+this.equipo1.getNombre()+" y "+this.equipo2.getNombre() ;
		}
		else 
			if (this.resultado==ResultadoEnum.GanaEquipo1) {
				auxStr= "Gana Equipo 1 "+this.equipo1.getNombre() ;
			}
			else 
				if (this.resultado==ResultadoEnum.GanaEquipo2) {
					auxStr= "Gana Equipo 2 "+this.equipo2.getNombre() ;
				}

		return auxStr;
	}



}
