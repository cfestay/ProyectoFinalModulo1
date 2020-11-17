package Clases;
/**
 * 
 * @author Grupo Super Sayayines
 *
 */
public class VisitaTerreno extends Usuario {

	private int id;
	private String rut;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;

	@Override
	public String toString() {
		return "VisitaTerreno [id=" + id + ", rut=" + rut 
				+ ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", comentarios=" + comentarios + "]";
	}

	public VisitaTerreno() {
		super();
		// TODO Auto-generated constructor stub
	}
/** *
 * 
 * @param nombre
 * @param fechaNac
 * @param run
 */
	public VisitaTerreno(String nombre, String fechaNac, int run) {
		super(nombre, fechaNac, run);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public String getComentarios() {
		return comentarios;
	}
/** *
 * 
 * @param comentarios
 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	


	

}
