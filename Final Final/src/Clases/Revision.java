package Clases;

/**
 * 
 * @author Grupo Super Sayayines
 *
 */
public class Revision {

	/**
	 * Atributos clase
	 */
	private int identiRevision;
	private int identiVisita;
	private String nombreRevision;
	private String detalleRevision;
	private int estadoRevision;

	/**
	 * Constructores
	 */

	public Revision() {
		super();
	}
/** *
 * 
 * @param identiRevision
 * @param identiVisita
 * @param nombreRevision
 * @param detalleRevision
 * @param estadoRevision
 */
	public Revision(int identiRevision, int identiVisita, String nombreRevision, String detalleRevision,
			int estadoRevision) {
		super();
		this.identiRevision = identiRevision;
		this.identiVisita = identiVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estadoRevision = estadoRevision;
	}

	/**
	 * Metodo to String
	 */
	@Override
	public String toString() {
		return "Revision [identiRevision=" + identiRevision + ", identiVisita=" + identiVisita + ", nombreRevision="
				+ nombreRevision + ", detalleRevision=" + detalleRevision + ", estadoRevision=" + estadoRevision + "]";
	}

	/** *
	 * 
	 * @return
	 */

	public int getIdentiRevision() {
		return identiRevision;
	}

	public void setIdentiRevision(int identiRevision) {
		this.identiRevision = identiRevision;
	}

	public int getIdentiVisita() {
		return identiVisita;
	}

	public void setIdentiVisita(int identiVisita) {
		this.identiVisita = identiVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public int getEstadoRevision() {
		return estadoRevision;
	}
/** *
 * 
 * @param estadoRevision
 */
	public void setEstadoRevision(int estadoRevision) {
		this.estadoRevision = estadoRevision;
	}

}
