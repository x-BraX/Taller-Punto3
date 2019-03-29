package co.dominio.app;

import java.util.ArrayList;

public class Fecha {
	private ArrayList<Partido> partidos=new ArrayList<Partido>();
	private ArrayList<Equipo> equipos=new ArrayList<Equipo>();

	
	public Fecha(ArrayList<Partido> partidos) {
		super();
		if(partidos.size()<=2) {
			this.partidos = partidos;
			}	
						
	}
	
	 
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}
	
}
