package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * 
 * @author Grupo Super Sayayines
 *
 */
public class Contenedor {

	static ArrayList<iAsesoria> instancia = new ArrayList();
	static ArrayList<Capacitacion> objcapa = new ArrayList();

	public Contenedor() {
		super();
		// TODO Auto-generated constructor stub
	}
/** *
 * 
 * @param c
 */
	public void AlmacenarCli(Cliente c) {

		instancia.add(c);

	}
/** *
 * 
 * @param p
 */
	public void AlmacenarPro(Profesional p) {

		instancia.add(p);

	}
/** *
 * 
 * @param a
 */
	public void AlmacenarAdm(Administrativo a) {

		instancia.add(a);

	}
/** *
 * 
 * @param c
 */
	public void AlmacenarCap(Capacitacion c) {

		objcapa.add(c);
	}
/** *
 * 
 * @param i
 */
	public void EliminarUsr(int i) {

		instancia.removeIf(Usuario -> ((Usuario) Usuario).getRun() == i);

	}

	public void ListarUsuario() {

		for (iAsesoria ia : instancia) {

			ia.analizarUsuario();

		}
	}
/** *
 * 
 * @param a
 */
	public void ListarUsuarioPorTipo(Class a) {

		for (int i = 0; i < instancia.size(); i++) {

			if (instancia.get(i).getClass().equals(a)) {
				System.out.println(instancia.get(i));
			}

		}

	}
      
	public void ListarCapacitaciones() {
		for (int i = 0; i < objcapa.size(); i++) {

			System.out.println(objcapa.get(i));

		}
	}

}