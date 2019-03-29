package co.dominio.app;

import java.util.ArrayList;

public class Torneo {
	private String nombre="TORNEO-FOX";
	private ArrayList<Equipo> equipos=new ArrayList<Equipo>();
	private ArrayList<Fecha> fechas=new ArrayList<Fecha>();

	public Torneo(ArrayList<Equipo> equipos, ArrayList<Fecha> fechas) {
		super();
		this.equipos = equipos;
		this.fechas = fechas;
		
	}	

	public void setEquipos(ArrayList<Equipo> equipos) {
		if(equipos.size()<=2) {
			this.equipos = equipos;
		}else {
			System.out.println("Limite de Equipos excedido");
		}
	}
	public void setFechas(ArrayList<Fecha> fechas) {
		if (fechas.size()<=3) {
			this.fechas = fechas;
		}else {
			System.out.println("Limite de fechas excedido");
		}
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public ArrayList<Fecha> getFechas() {
		return fechas;
	}
	public String getNombre() {
		return nombre;
	}

}
