package co.dominio.app;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private int partidosG;
	private int partidosP;
	private int partidosE;
	private int partidosJ;
	private int goles;
	
	private ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
	private ArrayList<Jugador> jugadoresPosicion=new ArrayList<Jugador>();
	

	public Equipo(String nombre, int goles) {
		super();
		this.nombre = nombre;
		this.goles=goles;
	}
	
		
	public ArrayList<Jugador> buscarJugadorposicion(String posicion,String equipo){
		
		for (int i = 0; i < jugadores.size() ; i++) {
			if(jugadores.get(i).getPosicion().equals(posicion)) {
				jugadoresPosicion.add(jugadores.get(i));
			}
		}
		
		return jugadoresPosicion;
	}
	
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}	
	
	public ArrayList<Jugador> getJugadoresPosicion() {
		return jugadoresPosicion;
	}
	
	
	public void setPartidoG() {
		this.partidosG++;
	}
	
	public void setPartidoP() {
		this.partidosP++;
	}
	public void setPartidoE() {
		this.partidosE++;
	}
	
	public void setPartidosJ() {
		this.partidosJ++;
	}
	
	public int getPartidosJ() {
		return partidosJ;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setJugadores(Jugador jugador) {
		if(jugadores.size()<=16) {
			jugadores.add(jugador);
		}else {
			
		}
	}	
	public int getPartidosG() {
		return partidosG;
	}
	public int getPartidosP() {
		return partidosP;
	}
	public int getPartidosE() {
		return partidosE;
	}
	
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
}
