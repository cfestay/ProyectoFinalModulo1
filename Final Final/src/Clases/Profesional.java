package Clases;

/**
 * 
 * @author Grupo Super Sayayines
 *
 */
public class Profesional extends Usuario {

	private String titulo;
	private String fecIngreso;

	public Profesional() {
		super();
	}
/** *
 * 
 * @param titulo
 * @param fecIngreso
 */
	public Profesional(String titulo, String fecIngreso) {
		super();
		this.titulo = titulo;
		this.fecIngreso = fecIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo 
				+ ", fecIngreso=" + fecIngreso + "]";
	}
/** *
 * 
 * @return
 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecIngreso() {
		return fecIngreso;
	}

	public void setFecIngreso(String fecIngreso) {
		this.fecIngreso = fecIngreso;
	}

	public Profesional(String nombre, String fechaNac, int run) {
		super(nombre, fechaNac, run);
		// TODO Auto-generated constructor stub
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println(this.titulo + " " + this.fecIngreso);
	}

}
