package co.main.app;


import java.util.ArrayList;

import co.dominio.app.*;

public class Main {

	public static void main(String[] args) {
		
		
		Jugador cano=new Jugador("Cano", "Delantero");
		Jugador leonardo=new Jugador("Leonardo", "Delantero");
		Jugador andres=new Jugador("Andres", "MedioCampista");
		Jugador david=new Jugador("David", "Arquero");
		Jugador hernan=new Jugador("Hernan","Defensa");
		Jugador alejandro=new Jugador("Alejandro","MedioCampista");
		Jugador sebastian=new Jugador("Sebastian","MedioCampista");
		Jugador brayan=new Jugador("Brayan","Delantero");
		Jugador jesus=new Jugador("Jesus","Defensa");
		Jugador cristian=new Jugador("Cristian","Delantero");
		Jugador willian=new Jugador("Willian","Defensa");
		Jugador nicolas=new Jugador("Nicolas","Defensa");
		Jugador wilson=new Jugador("Wilson","MedioCampista");
		Jugador jaime=new Jugador("Jaime","MedioCampista");
		Jugador yohan=new Jugador("Yohan","MedioCampista");
		Jugador carlos=new Jugador("Carlos","MedioCampista");
		
		Jugador cano2=new Jugador("Cano2", "Delantero");
		Jugador leonardo2=new Jugador("Leonardo2", "Delantero");
		Jugador andres2=new Jugador("Andres2", "MedioCampista");
		Jugador david2=new Jugador("David2", "Arquero");
		Jugador hernan2=new Jugador("Hernan2","Defensa");
		Jugador alejandro2=new Jugador("Alejandro2","MedioCampista");
		Jugador sebastian2=new Jugador("Sebastian2","MedioCampista");
		Jugador brayan2=new Jugador("Brayan2","Delantero");
		Jugador jesus2=new Jugador("Jesus2","Defensa");
		Jugador cristian2=new Jugador("Cristian2","Delantero");
		Jugador willian2=new Jugador("Willian2","Defensa");
		Jugador nicolas2=new Jugador("Nicolas2","Defensa");
		Jugador wilson2=new Jugador("Wilson2","MedioCampista");
		Jugador jaime2=new Jugador("Jaime2","MedioCampista");
		Jugador yohan2=new Jugador("Yohan2","MedioCampista");
		Jugador carlos2=new Jugador("Carlos2","MedioCampista");
		
		Jugador cano3=new Jugador("Cano3", "Delantero");
		Jugador leonardo3=new Jugador("Leonardo3", "Delantero");
		Jugador andres3=new Jugador("Andres3", "MedioCampista");
		Jugador david3=new Jugador("David3", "Arquero");
		Jugador hernan3=new Jugador("Hernan3","Defensa");
		Jugador alejandro3=new Jugador("Alejandro3","MedioCampista");
		Jugador sebastian3=new Jugador("Sebastian3","MedioCampista");
		Jugador brayan3=new Jugador("Brayan3","Delantero");
		Jugador jesus3=new Jugador("Jesus3","Defensa");
		Jugador cristian3=new Jugador("Cristian3","Delantero");
		Jugador willian3=new Jugador("Willian3","Defensa");
		Jugador nicolas3=new Jugador("Nicolas3","Defensa");
		Jugador wilson3=new Jugador("Wilson3","MedioCampista");
		Jugador jaime3=new Jugador("Jaime3","MedioCampista");
		Jugador yohan3=new Jugador("Yohan3","MedioCampista");
		Jugador carlos3=new Jugador("Carlos3","MedioCampista");
		
		Jugador cano4=new Jugador("Cano4", "Delantero");
		Jugador leonardo4=new Jugador("Leonardo4", "Delantero");
		Jugador andres4=new Jugador("Andres4", "MedioCampista");
		Jugador david4=new Jugador("David4", "Arquero");
		Jugador hernan4=new Jugador("Hernan4","Defensa");
		Jugador alejandro4=new Jugador("Alejandro4","MedioCampista");
		Jugador sebastian4=new Jugador("Sebastian4","MedioCampista");
		Jugador brayan4=new Jugador("Brayan4","Delantero");
		Jugador jesus4=new Jugador("Jesus4","Defensa");
		Jugador cristian4=new Jugador("Cristian4","Delantero");
		Jugador willian4=new Jugador("Willian4","Defensa");
		Jugador nicolas4=new Jugador("Nicolas4","Defensa");
		Jugador wilson4=new Jugador("Wilson4","MedioCampista");
		Jugador jaime4=new Jugador("Jaime4","MedioCampista");
		Jugador yohan4=new Jugador("Yohan4","MedioCampista");
		Jugador carlos4=new Jugador("Carlos4","MedioCampista");

		
		Equipo equipo1=new Equipo("Equipo1",3);
		equipo1.setJugadores(cano);
		equipo1.setJugadores(leonardo);
		equipo1.setJugadores(andres);
		equipo1.setJugadores(david);
		equipo1.setJugadores(hernan);
		equipo1.setJugadores(alejandro);
		equipo1.setJugadores(sebastian);
		equipo1.setJugadores(brayan);
		equipo1.setJugadores(jesus);
		equipo1.setJugadores(cristian);
		equipo1.setJugadores(willian);
		equipo1.setJugadores(nicolas);
		equipo1.setJugadores(wilson);
		equipo1.setJugadores(jaime);
		equipo1.setJugadores(yohan);
		equipo1.setJugadores(carlos);	
		
		Equipo equipo2=new Equipo("Equipo2",5);
		equipo2.setJugadores(cano2);
		equipo2.setJugadores(leonardo2);
		equipo2.setJugadores(andres2);
		equipo2.setJugadores(david2);
		equipo2.setJugadores(hernan2);
		equipo2.setJugadores(alejandro2);
		equipo2.setJugadores(sebastian2);
		equipo2.setJugadores(brayan2);
		equipo2.setJugadores(jesus2);
		equipo2.setJugadores(cristian2);
		equipo2.setJugadores(willian2);
		equipo2.setJugadores(nicolas2);
		equipo2.setJugadores(wilson2);
		equipo2.setJugadores(jaime2);
		equipo2.setJugadores(yohan2);
		equipo2.setJugadores(carlos2);	
		
		Equipo equipo3=new Equipo("Equipo3",1);
		equipo3.setJugadores(cano3);
		equipo3.setJugadores(leonardo3);
		equipo3.setJugadores(andres3);
		equipo3.setJugadores(david3);
		equipo3.setJugadores(hernan3);
		equipo3.setJugadores(alejandro3);
		equipo3.setJugadores(sebastian3);
		equipo3.setJugadores(brayan3);
		equipo3.setJugadores(jesus3);
		equipo3.setJugadores(cristian3);
		equipo3.setJugadores(willian3);
		equipo3.setJugadores(nicolas3);
		equipo3.setJugadores(wilson3);
		equipo3.setJugadores(jaime3);
		equipo3.setJugadores(yohan3);
		equipo3.setJugadores(carlos3);
		
		Equipo equipo4=new Equipo("Equipo4",0);
		equipo4.setJugadores(cano4);
		equipo4.setJugadores(leonardo4);
		equipo4.setJugadores(andres4);
		equipo4.setJugadores(david4);
		equipo4.setJugadores(hernan4);
		equipo4.setJugadores(alejandro4);
		equipo4.setJugadores(sebastian4);
		equipo4.setJugadores(brayan4);
		equipo4.setJugadores(jesus4);
		equipo4.setJugadores(cristian4);
		equipo4.setJugadores(willian4);
		equipo4.setJugadores(nicolas4);
		equipo4.setJugadores(wilson4);
		equipo4.setJugadores(jaime4);
		equipo4.setJugadores(yohan4);
		equipo4.setJugadores(carlos4);	
		
		ArrayList<Equipo> equipos=new ArrayList<Equipo>();
		equipos.add(equipo1);
		equipos.add(equipo2);
		equipos.add(equipo3);
		equipos.add(equipo4);

		ArrayList<Equipo> equipos1=new ArrayList<Equipo>();
		equipos1.add(equipo1);
		equipos1.add(equipo2);
		ArrayList<Equipo> equipos2=new ArrayList<Equipo>();
		equipos2.add(equipo3);
		equipos2.add(equipo4);
		Partido partido1=new Partido(equipos1);
		Partido partido2=new Partido(equipos2);
		Partido partido3=new Partido(equipos1);
		Partido partido4=new Partido(equipos2);
	
		
		
		ArrayList<Partido> partidos1 =new ArrayList<Partido>();
		partidos1.add(partido1);
		partidos1.add(partido2);
		ArrayList<Partido> partidos2 =new ArrayList<Partido>();
		partidos2.add(partido3);
		partidos2.add(partido4);
		
		
		Fecha fecha1=new Fecha(partidos1);
		Fecha fecha2=new Fecha(partidos2);

		
		ArrayList<Fecha> fechas=new ArrayList<Fecha>();
		fechas.add(fecha1);
		fechas.add(fecha2);
		
		Torneo torneo=new Torneo(equipos, fechas);
		
		System.out.println("   "+torneo.getNombre()+"          \n");
		
		//Ver equipos del torneo
		System.out.println("Equipos Inscritos");
		for (int i = 0; i < torneo.getEquipos().size(); i++) {
			System.out.println(torneo.getEquipos().get(i).getNombre());
		}
		System.out.println("\n");
		
		//Ver fechas
		String nrofecha="1";
		partido1.resultadoPartido();	
		String equipoG1=fecha1.getPartidos().get(0).getEquipoG().getNombre();;
		String equipoP1=fecha1.getPartidos().get(0).getEquipoP().getNombre();
		partido2.resultadoPartido();
		String equipoG2=fecha1.getPartidos().get(1).getEquipoG().getNombre();
		String equipoP2=fecha1.getPartidos().get(1).getEquipoP().getNombre();
		
		System.out.println("Fecha"+nrofecha);
		System.out.println(equipoG1+" - "+equipoP1+" \nEl ganador fue el "+equipoG1+" \n");
		System.out.println(equipoG2+" - "+equipoP2+" \nEl ganador fue el "+equipoG2+" \n");
		
		
		nrofecha="2";
		partido3.resultadoPartido();	
		String equipoG12=fecha2.getPartidos().get(0).getEquipoG().getNombre();;
		String equipoP12=fecha2.getPartidos().get(0).getEquipoP().getNombre();
		partido4.resultadoPartido();
		String equipoG22=fecha2.getPartidos().get(1).getEquipoG().getNombre();
		String equipoP22=fecha2.getPartidos().get(1).getEquipoP().getNombre();
		
		System.out.println("Fecha"+nrofecha);
		System.out.println(equipoG12+" - "+equipoP12+" \nEl ganador fue el "+equipoG12+" \n");
		System.out.println(equipoG22+" - "+equipoP22+" \nEl ganador fue el "+equipoG22+" \n");
		
		
		//Preparar Final
		Equipo equipo1ganador=fecha2.getPartidos().get(0).getEquipoG();
		Equipo equipo1perdedor=fecha2.getPartidos().get(0).getEquipoP();
		if(equipo1.getPartidosG()>equipo2.getPartidosP()) {
			equipo1ganador=equipo1;
			equipo1perdedor=equipo2;
		}if(equipo1.getPartidosG()<equipo2.getPartidosP()) {
			equipo1ganador=equipo2;
			equipo1perdedor=equipo1;
		}
		Equipo equipo2ganador=fecha2.getPartidos().get(1).getEquipoG();
		Equipo equipo2perdedor=fecha2.getPartidos().get(1).getEquipoP();
		if(equipo3.getPartidosG()>equipo4.getPartidosP()) {
			equipo2ganador=equipo3;
			equipo2perdedor=equipo4;
		}if(equipo3.getPartidosG()<equipo4.getPartidosP()) {
			equipo2ganador=equipo4;
			equipo2perdedor=equipo3;
		}
		
		ArrayList<Equipo> equiposGanadores=new ArrayList<Equipo>();
		equiposGanadores.add(equipo1ganador);
		equiposGanadores.add(equipo2ganador);
		ArrayList<Equipo> equiposPerdedores=new ArrayList<Equipo>();
		equiposPerdedores.add(equipo1perdedor);
		equiposPerdedores.add(equipo2perdedor);
		
		Partido partido5=new Partido(equiposPerdedores);
		Partido partido6=new Partido(equiposGanadores);
		ArrayList<Partido> partidos3 =new ArrayList<Partido>();
		partidos3.add(partido5);
		partidos3.add(partido6);
		Fecha fecha3=new Fecha(partidos3);	
		fechas.add(fecha3);
		
		nrofecha=" Final";
		partido5.resultadoPartido();	
		String equipoG13=fecha3.getPartidos().get(0).getEquipoG().getNombre();;
		String equipoP13=fecha3.getPartidos().get(0).getEquipoP().getNombre();
		partido6.resultadoPartido();
		String equipoG23=fecha3.getPartidos().get(1).getEquipoG().getNombre();
		String equipoP23=fecha3.getPartidos().get(1).getEquipoP().getNombre();
		
		System.out.println("Fecha"+nrofecha);
		System.out.println("PARTIDO - EQUIPOS QUE PERDIERON\n"+equipoG13+" - "+equipoP13+" \nEl ganador fue el "+equipoG13+" \n");
		System.out.println("FINAL\n"+equipoG23+" - "+equipoP23+" \nEl ganador del torneo fue el "+equipoG23+" \n"+ "=) =) =) =)");
		
		
		//Buscar jugadores por posicion
		Equipo equipo=equipo1;
		String posicion="MedioCampista";
		equipo.buscarJugadorposicion(posicion, "equipo1");
		System.out.println("\n"+"Jugadores en la posicion"+posicion);

		for (int i = 0; i < equipo1.getJugadoresPosicion().size(); i++) {
			System.out.println(equipo1.getJugadoresPosicion().get(i).getNombre());
		}
		System.out.println(" \n");
		
		//Tabla de Posiciones
		for (int i = 3; i >= 0; i--) {
			if(equipo1.getPartidosG()==i) {
				System.out.println(equipo1.getNombre()+" - "+equipo1.getGoles()+" Goles"+" - "+equipo1.getPartidosG()+" partidos Ganados");
			}if(equipo2.getPartidosG()==i) {
				System.out.println(equipo2.getNombre()+" - "+equipo2.getGoles()+" Goles"+" - "+equipo2.getPartidosG()+" partidos Ganados");
			}if(equipo3.getPartidosG()==i) {
				System.out.println(equipo3.getNombre()+" - "+equipo3.getGoles()+" Goles"+" - "+equipo3.getPartidosG()+" partidos Ganados");
			}if(equipo4.getPartidosG()==i) {
				System.out.println(equipo4.getNombre()+" - "+equipo4.getGoles()+" Goles"+" - "+equipo4.getPartidosG()+" partidos Ganados");
			}
			
		}		
		

	}

}
