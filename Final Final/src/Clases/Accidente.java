package Clases;

/**
 * 
 * @author Grupo Super Sayayines
 *
 */
public class Accidente extends Usuario{
	
	private int IdentificadorDeAccidente;
	private String rutCliente;
	private String diaAcc;
	private String hora;
	
	
	
	
	@Override
	public String toString() {
		return "Accidente [IdentificadorDeAccidente=" + IdentificadorDeAccidente + ", rutCliente=" + rutCliente
				+ ", diaAcc=" + diaAcc + ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen
				+ ", consecuencias=" + consecuencias + "]";
	}

	private String lugar;
	private String origen;
	private String consecuencias;
	
	public Accidente() {
		
	}
/** *
 * 
 * @param identificadorDeAccidente
 * @param rutCliente
 * @param diaAcc
 * @param hora
 * @param lugar
 * @param origen
 * @param consecuencias
 */
	public Accidente(int identificadorDeAccidente, String rutCliente, String diaAcc, String hora, String lugar,
			String origen, String consecuencias) {
		super();
		IdentificadorDeAccidente = identificadorDeAccidente;
		this.rutCliente = rutCliente;
		this.diaAcc = diaAcc;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	
		
		
	




}
    /** *
     * 
     * @return
     */
	public int getIdentificadorDeAccidente() {
		return IdentificadorDeAccidente;
	}

	public void setIdentificadorDeAccidente(int identificadorDeAccidente) {
		IdentificadorDeAccidente = identificadorDeAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDiaAcc() {
		return diaAcc;
	}

	public void setDiaAcc(String diaAcc) {
		this.diaAcc = diaAcc;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
}
