package Clases;

public class Capacitacion extends Usuario {
	
	private String identificador;
	private String Rut;
	private String dia;
	private String hora; 
	private String lugar;
	private String duracion;
	private int catAsist;	
	
	
	public Capacitacion() {
		super();
	}
	
	
	
	
	

	public Capacitacion(String identificador, String rut, String dia, String hora, String lugar, String duracion,
			int catAsist) {
		super();
		this.identificador = identificador;
		Rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.catAsist = catAsist;
	}






	public void mostrarDetalles() {
		
		System.out.println(" La capacitación se llevará a cabo en "+ this.lugar +" ,a las "+ this.hora +" del día " + this.dia +
				" , y durará "+ this.duracion +" minutos.");
	}






	public String getIdentificador() {
		return identificador;
	}






	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}






	public String getRut() {
		return Rut;
	}






	public void setRut(String rut) {
		Rut = rut;
	}






	public String getDia() {
		return dia;
	}






	public void setDia(String dia) {
		this.dia = dia;
	}






	public String getHora() {
		return hora;
	}






	public void setHora(String hora) {
		this.hora = hora;
	}






	public String getLugar() {
		return lugar;
	}






	public void setLugar(String lugar) {
		this.lugar = lugar;
	}






	public String getDuracion() {
		return duracion;
	}






	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}






	public int getCatAsist() {
		return catAsist;
	}






	public void setCatAsist(int catAsist) {
		this.catAsist = catAsist;
	}






	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", Rut=" + Rut + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", duracion=" + duracion + ", catAsist=" + catAsist + "]";
	}
		
	
	
	
	
	
	
	

	

}
