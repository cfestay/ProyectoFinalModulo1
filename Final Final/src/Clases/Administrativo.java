package Clases;
/** *
 * 
 * @author sayayines
 *
 */
public class Administrativo extends Usuario implements iAsesoria {
	
	 private String area;
	 private String expPrevia;	 
	 
	public Administrativo() {
		super();
	}
	
	/** *
	 * 
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}
	
	
	      
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println(this.area + " " + this.expPrevia);
	}
	
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}

     /** *
      * 
      * @return
      */
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExpPrevia() {
		return expPrevia;
	}
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}
	
	
	 
	 
	 

}
