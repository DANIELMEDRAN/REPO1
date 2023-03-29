package Grupo;

public class Partido {

	    private Equipo local;
	    private Equipo visitante;

	    public Partido(Equipo local, Equipo visitante) {
	        this.local = local;
	        this.visitante = visitante;
	    }

	    public Equipo getLocal() {
	        return local;
	    }

	    public void setLocal(Equipo local) {
	        this.local = local;
	    }

	    public Equipo getVisitante() {
	        return visitante;
	    }

	    public void setVisitante(Equipo visitante) {
	        this.visitante = visitante;
	    }
	}


