package co.dominio.app;

import java.util.ArrayList;

public class Partido {
	
	private Equipo equipoG;
	private Equipo equipoP;	
	private ArrayList<Equipo> equipos=new ArrayList<Equipo>();
	
	public Partido(ArrayList<Equipo> equipos) {
		super();
		
		if(equipos.size()<=2) {
			this.equipos = equipos;
		}		
	}

	public void resultadoPartido()
	{
		for (int j = 0; j < 1; j++) {
			if (equipos.get(j).getGoles()>equipos.get(j+1).getGoles()) {
				this.equipoG=equipos.get(j);
				equipos.get(j).setPartidoG();
				equipos.get(j).setGoles(equipos.get(j).getGoles()+2);
				this.equipoP=equipos.get(j+1);
				equipos.get(j+1).setGoles(equipos.get(j+1).getGoles()+1);
				equipos.get(j+1).setPartidoP();
			}if (equipos.get(j).getGoles()<equipos.get(j+1).getGoles()){
				this.equipoG=equipos.get(j+1);
				equipos.get(j+1).setPartidoG();
				equipos.get(j+1).setGoles(equipos.get(j+1).getGoles()+2);
				this.equipoP=equipos.get(j);
				equipos.get(j).setPartidoP();
				equipos.get(j).setGoles(equipos.get(j).getGoles()+1);
			}
		}
		

	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public Equipo getEquipoG() {
		return equipoG;
	}
	public Equipo getEquipoP() {
		return equipoP;
	}
	
}
