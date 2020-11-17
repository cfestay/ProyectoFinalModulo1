package Clases;

/**
 * 
 * @author Grupo Super Sayayines
 *
 */
public class Usuario implements iAsesoria {

	private String nombre;
	private String fechaNac; // dato obligatorio
	private int run;

	public void analizarUsuario() {

		System.out.println(this.nombre + " " + this.run + " " + this.fechaNac);
	}

	public void mostrarEdad() {

		String anio = this.fechaNac.substring(6, 10);
		int aniof = Integer.parseInt(anio);

		System.out.println("El usuario tiene " + (2020 - aniof));
	}

	public Usuario() {

	}
/** *
 * 
 * @param nombre
 * @param fechaNac
 * @param run
 */
	public Usuario(String nombre, String fechaNac, int run) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.run = run;
	}

	/**
	 * Devuelve el nombre ingresado
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" 
	+ fechaNac + ", run=" + run + "]";
	}

}
