package co.dominio.app;

public class Jugador {
	private String nombre;
	private String posicion;
	
	
	public Jugador(String nombre, String posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}	
		
	public String getNombre() {
		return nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
