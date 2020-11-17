package Clases;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Grupo Súper Sayayines
 *
 */
public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Profesional profesional = new Profesional();
		Administrativo administrativo = new Administrativo();
		Capacitacion capacitacion = new Capacitacion();
		Accidente accidente = new Accidente();
		VisitaTerreno visita = new VisitaTerreno();
		Revision revision = new Revision();
		Contenedor contenedor = new Contenedor();

		int op = 0;
		String ape;
		int run2 = 0;
		String tele;
		String Nom = "";
		String noms;
		int runc;
		String fech;
		String afp;
		int sistema;
		String direccion = "";
		String comuna = "";
		int edad;
		String tit;
		String fechin;
		String area;
		String exp;
		String idc;
		String rutc;
		String dia;
		String Hora;
		String duracion;
		int cantidad;
		int ida = 0;
		int elimn;
		String lugarac;
		String list;
		boolean continua;
		String lugarvisita;
		String come;
		int acc;
		String aac = "";
		String ori;
		String conse;
		int rev;
		int cont;
		int viterr;
		Scanner leer = new Scanner(System.in);
		
		
		 // Menú Principal.
		 

		do {

			System.out.println(" ");
			System.out.println("Bienvenidos");
			System.out.println("Sistema de registros de Sayajin's Security");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Seleccione un número de opción:");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Opción 1: Almacenar Cliente.");
			System.out.println("Opción 2: Almacenar Profesional.");
			System.out.println("Opción 3: Almacenar Administrativo.");
			System.out.println("Opción 4: Almacenar Capacitación.");
			System.out.println("Opción 5: Eliminar Usuario.");
			System.out.println("Opción 6: Listar Usuarios.");
			System.out.println("Opción 7: Listar Usuarios por Tipo.");
			System.out.println("Opción 8: Listar Capacitaciones.");
			System.out.println("\nOpción 9: Salir del sistema.");

			op = leer.nextInt();
			leer.nextLine();
			switch (op) {
			case 1: {

				do {
					System.out.println("Ingrese su nombre,"
							+ " mín10 y máx50 caracteres:");

					Nom = leer.nextLine();

					if (Nom.length() < 10 || Nom.length() > 50) {

						System.out.println("El nombre es inválido,"
								+ " intente nuevamente");
					}

				} while (Nom.length() < 10 || Nom.length() > 50);

				cliente.setNombre(Nom);

				do {
					System.out.println("Ingrese su fecha de nacimiento."
							+ " \nEn formato DD/MM/AAAA:");

					fech = leer.nextLine();

					if (fech.length() < 10 || fech.length() > 10) {
						System.out.println("La fecha no es correcta,"
								+ " intente nuevamente.");
					}
				} while (fech.length() < 10 || fech.length() > 10);

				cliente.setFechaNac(fech);

				do {
					
					 //Se implementa la excepción por ingreso incorrecto de caracteres especiales.
				
					try {
						continua = false;
						System.out.println("Ingrese su RUN, menor a 99999999."
								+ " \nSin guión ni digito verificador:");
						run2 = leer.nextInt();
						leer.nextLine();

						if (run2 > 99999999) {
							System.out.println("El RUN ingresado es inválido,"
									+ " intente nuevamente.");
							continua = true;
						}

					} catch (InputMismatchException ime) {

						System.out.println("¡Atención!"
								+ " Solo puede ingresar 8 números enteros");
						leer.nextLine();
						continua = true;

					}

				} while (continua);

				cliente.setRun(run2);

				do {
					System.out.println(
							"Ingrese el RUT del cliente,"
							+ " menor a 99999999. "
							+ "\nSin guión ni digito verificador:");

					runc = leer.nextInt();
					leer.nextLine();

					if (runc > 99999999) {
						System.out.println("El RUT ingresado es inválido,"
								+ " intente nuevamente.");
					}
				} while (runc > 99999999);

				cliente.setRut(runc);

				do {
					System.out.println("Ingrese nombres del cliente,"
							+ " mínimo 5 y máximo 30 caracteres:");

					noms = leer.nextLine();

					if (noms.length() < 5 || noms.length() > 30) {

						System.out.println("La longitud es inválida,"
								+ " intente nuevamente.");
					}

				} while (noms.length() < 5 || noms.length() > 30);

				cliente.setNombres(noms);

				do {
					System.out.println("Ingrese apellidos del cliente,"
							+ " mínimo 5 y máximo 30 caracteres:");

					ape = leer.nextLine();

					if (ape.length() < 5 || ape.length() > 30) {

						System.out.println("La longitud es inválida,"
								+ " intente nuevamente.");
					}

				} while (ape.length() < 5 || ape.length() > 30);

				cliente.setApellidos(ape);

				do {
					System.out.println("Ingrese el n° de teléfono del cliente,"
							+ " máximo 9 digitos:");

					tele = leer.nextLine();

					if (tele.length() < 9 || tele.length() > 9) {

						System.out.println("El número es inválido, "
								+ "intente nuevamente.");
					}

				} while (tele.length() > 9 || tele.length() < 9);

				cliente.setFono(tele);

				do {
					System.out.println("Ingrese AFP de cliente, "
							+ "mínimo 4 y máximo 30 caracteres:");

					afp = leer.nextLine();

					if (afp.length() < 4 || afp.length() > 30) {

						System.out.println("La longitud es inválida, "
								+ "intente nuevamente.");
					}

				} while (afp.length() < 4 || afp.length() > 30);

				cliente.setAfp(afp);

				do {
					System.out.println("Ingrese sistema de salud,"
							+ " (1)-Fonasa ó (2)-Isapre:");

					sistema = leer.nextInt();
					leer.nextLine();

					if (sistema < 1 || sistema > 3) {

						System.out.println("Opción no válida,"
								+ " intente nuevamente.");

					}

				} while (sistema < 1 || sistema > 3);

				cliente.setSistSalud(sistema);

				cliente.obtenerSistemaSalud();

				do {
					System.out.println("Ingrese dirección del cliente,"
							+ " máximo 70 caracteres:");

					direccion = leer.nextLine();

					if (direccion.length() > 70) {

						System.out.println("La longitud es inválida,"
								+ " intente nuevamente.");
					}

				} while (direccion.length() > 70);

				cliente.setDireccion(direccion);

				do {
					System.out.println("Ingrese comuna del cliente,"
							+ " máximo 50 caracteres:");

					comuna = leer.nextLine();

					if (comuna.length() > 50) {

						System.out.println("La comuna es inválida,"
								+ " intente nuevamente.");
					}

				} while (comuna.length() > 50);

				cliente.setComuna(comuna);

				do {
					System.out.println("Ingrese edad del cliente,"
							+ " entre 1 y 150:");

					edad = leer.nextInt();
					leer.nextLine();

					if (edad > 150 || edad < 0) {

						System.out.println("La edad no es válida, "
								+ "intente nuevamente.");
					}

				} while (edad > 150 || edad < 0);

				cliente.setEdad(edad);

				System.out.println("Desea ingresar accidentes? "
						+ "Responda sí o no");

				String Resp;

				Resp = leer.nextLine();

				if (Resp.equals("si")) {

					System.out.println("Cuántos accidentes desea registrar?");
					int regacci;
					regacci = leer.nextInt();
					leer.nextLine();

					for (int i = 0; i < regacci; i++) {

						do {

							System.out.println("Ingrese identificador"
									+ " de accidente");
							;
							acc = leer.nextInt();
							leer.nextLine();

							if (acc < 1) {
								System.out.println("Campo obligatorio");
							}
						} while (acc < 1);

						accidente.setIdentificadorDeAccidente(acc);

						System.out.println("El accidente será ingresado "
								+ "para el cliente con el rut: " + " " 
								+ cliente.getRut());

						System.out.println("Ingrese día del accidente, Ej: lunes");
						String diaac;
						diaac = leer.nextLine();
						accidente.setDiaAcc(diaac);

						System.out.println("Ingrese hora del accidente, Ej: hh:mm");
						String hora;
						hora = leer.nextLine();
						accidente.setHora(hora);

						do {

							System.out.println("Ingrese lugar del accidente");

							aac = leer.nextLine();
							if (aac.length() < 1) {
								System.out.println("Campo obligatorio");
							}
							
						} while (aac.length() < 1);
						accidente.setLugar(aac);

						do {

							System.out.println("Ingrese origen de accidente");

							ori = leer.nextLine();
							if (ori.length() > 100) {
								System.out.println(" Máx.100 caracteres");
							}
						} while (ori.length() > 100);

						accidente.setOrigen(ori);

						do {
							System.out.println("Ingrese consecuencias");

							conse = leer.nextLine();

							if (conse.length() > 100) {
								System.out.println("Máx. 100 caracteres");
							}
						} while (conse.length() > 100);

						accidente.setConsecuencias(conse);

						System.out.println(
								"El identificador de accidente es" + 
						" " + acc + " " + "el dia del accidente es:" + " "
						+ diaac + " " + " la hora del accidente es: ");
						System.out.println(" " + hora + " " 
						+ "el lugar del accidente es: " 
						+ " " + aac + " el origen del accidente es: "
					    + " " + ori + " " 
						+"la consecuencia del accidente es: " + " " + conse);

					}

				}

				System.out.println("Cuántas visitas desea registrar?");
				int regterr = leer.nextInt();
				leer.nextLine();
				for (int i = 0; i < regterr; i++) {

					do {
						System.out.println("Ingrese id de la visita: ");

						viterr = leer.nextInt();
						leer.nextLine();

						if (viterr < 1) {

							System.out.println("El id no es válido,"
									+ " intente nuevamente");
						}

					} while (viterr < 1);

					visita.setId(viterr);

					System.out.println("La visita será ingresada "
					+ "para el cliente rut: " 
					+ cliente.getRut());

					System.out.println("Ingrese día de la visita:");

					String diav;
					diav = leer.nextLine();
					visita.setDia(diav);

					do {
						System.out.println("Ingrese hora en formato HH:MM:");

						Hora = leer.nextLine();

						if (Hora.length() < 5) {
							System.out.println("El formato ingresado es inválido,"
									+ " intente nuevamente.");
						}
					} while (Hora.length() < 5);
					visita.setHora(Hora);

					do {
						System.out.println("Ingrese lugar de la visita:");

						lugarvisita = leer.nextLine();

						if (lugarvisita.length() < 1) {

							System.out.println("El campo lugar no puede estar vacío.");
						}

					} while (lugarvisita.length() < 1);

					visita.setLugar(lugarvisita);

					do {
						System.out.println("Ingrese comentarios: ");

						come = leer.nextLine();

						if (come.length() > 100) {

							System.out.println("Máx. 100 caracteres");
						}

					} while (come.length() > 100);

					visita.setComentarios(come);

					System.out.println("El id de la visita es" + " " + viterr 
							+ " " + " el día de la visita será: "
							+ " " + diav + " " + " la hora será " + Hora 
							+ " " + "el lugar de la visita será en "
							+ lugarvisita);

					System.out.println("Comentarios: " + come);

					System.out.println("Cuántas revisiones desea"
							+ " agendar para la visita?");
					cont = leer.nextInt();
					leer.nextLine();

					for (int j = 0; j < cont; j++) {

						do {
							System.out.println("Ingrese identificador"
									+ " de la revisión.");

							ida = leer.nextInt();
							leer.nextLine();

							if (ida < 1) {

								System.out.println("Campo obligatorio");
							}

						} while (ida < 1);

						revision.setIdentiRevision(ida);

						do {
							System.out.println("Ingrese identificador de la "
									+ "visita en terreno");

							ida = leer.nextInt();
							leer.nextLine();

							if (ida < 1) {

								System.out.println("Campo obligatorio");
							}

						} while (ida < 1);

						revision.setIdentiVisita(ida);

						do {
							System.out.println("Ingrese nombre de la revisión");

							aac = leer.nextLine();

							if (aac.length() < 10 || aac.length() > 50) {

								System.out.println("Mín10 y Máx50 caracteres.");
							}

						} while (aac.length() < 10 || aac.length() > 50);

						revision.setNombreRevision(aac);

						do {
							System.out.println("Ingrese detalle de la revisión");

							aac = leer.nextLine();

							if (aac.length() > 100) {

								System.out.println("Largo Máx.100 caracteres");
							}

						} while (aac.length() > 100);

						revision.setDetalleRevision(aac);

						System.out.println("Ingrese estado de revisión: "
								+ "1- Sin problemas  "
								+ "2- Con observaciones "
								+ "3- No aprueba ");

						rev = leer.nextInt();
						leer.nextLine();

						if (rev == 1) {
							System.out.println("Su revisión esta sin problemas");
						}
						if (rev == 2) {
							System.out.println("Su revisión tiene observaciones");
						}
						if (rev == 3) {
							System.out.println("Su revisión no aprueba");

						}

						revision.setEstadoRevision(rev);

					}

				}

				contenedor.AlmacenarCli(cliente);

			}
				break;

			case 2: {

				do {
					System.out.println("Ingrese su nombre,"
							+ " mín.10 y máx.50 caracteres:");

					Nom = leer.nextLine();

					if (Nom.length() < 10 || Nom.length() > 50) {

						System.out.println("La longitud del nombre no es válida,"
								+ " intente nuevamente.");
					}

				} while (Nom.length() < 10 || Nom.length() > 50);

				profesional.setNombre(Nom);

				do {
					System.out.println("Ingrese su fecha de"
							+ " nacimiento en formato DD/MM/AAAA: ");

					fech = leer.next();
					leer.nextLine();

					if (fech.length() < 10) {
						System.out.println("Fecha inválida, intente nuevamente.");
					}
				} while (fech.length() < 10);

				profesional.setFechaNac(fech);

				do {
					// Se implementa la excepción por ingreso incorrecto de caracteres especiales.
					try {
						continua = false;
						System.out.println("Ingrese su RUN, menor a 99999999. "
								+ "\nSin guión ni digito verificador:");
						run2 = leer.nextInt();
						leer.nextLine();

						if (run2 > 99999999) {
							System.out.println("El RUN ingresado es inválido,"
									+ " intente nuevamente.");
							continua = true;
						}

					} catch (InputMismatchException ime) {

						System.out.println("¡Atención! Sólo puede"
								+ " ingresar 8 números enteros");
						leer.nextLine();
						continua = true;

					}

				} while (continua);
				profesional.setRun(run2);

				do {
					System.out.println("Ingrese título profesional, "
							+ "mín.10 y máx.50 caracteres");

					tit = leer.nextLine();

					if (tit.length() < 10 || tit.length() > 50) {

						System.out.println("Título inválido, "
								+ "intente nuevamente.");
					}

				} while (tit.length() < 10 || tit.length() > 50);

				profesional.setTitulo(tit);

				do {
					System.out.println("Ingrese fecha de ingreso "
							+ "en formato DD/MM/AAAA");

					fechin = leer.next();

					if (fechin.length() < 10) {
						System.out.println("Fecha es inválida, "
								+ "intente nuevamente.");
					}
				} while (fechin.length() < 10);

				profesional.setFecIngreso(fechin);

				contenedor.AlmacenarPro(profesional);

			}
				break;
			case 3: {

				do {
					System.out.println("Ingrese su nombre, mínimo 10 y máximo 50 caracteres.");

					Nom = leer.nextLine();

					if (Nom.length() < 10 || Nom.length() > 50) {

						System.out.println("La longitud del nombre no es válida, intente nuevamente.");
					}

				} while (Nom.length() < 10 || Nom.length() > 50);

				administrativo.setNombre(Nom);

				do {
					System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AAAA");

					fech = leer.next();

					if (fech.length() < 10) {
						System.out.println("La fecha es inválida, intente nuevamente.");
					}
				} while (fech.length() < 10);

				administrativo.setFechaNac(fech);

				do {
					// Se implementa la excepción por ingreso incorrecto de caracteres especiales.
					try {
						continua = false;
						System.out.println("Ingrese su RUN, "
								+ "menor a 99999999. "
								+ "\nSin guión ni digito verificador:");
						run2 = leer.nextInt();
						leer.nextLine();

						if (run2 > 99999999) {
							System.out.println("El RUN ingresado es inválido,"
									+ " intente nuevamente.");
							continua = true;
						}

					} catch (InputMismatchException ime) {

						System.out.println("Sólo puede ingresar "
								+ "8 números enteros");
						leer.nextLine();
						continua = true;

					}

				} while (continua);

				administrativo.setRun(run2);

				do {
					System.out.println("Ingrese área administrativo, "
							+ "mínimo 5 y máximo 20 caracteres");

					area = leer.nextLine();

					if (Nom.length() < 5 || Nom.length() > 20) {

						System.out.println("Campo es inválido, "
								+ "intente nuevamente.");
					}

				} while (Nom.length() < 5 || Nom.length() > 20);

				administrativo.setArea(area);

				do {
					System.out.println("Ingrese experiencia previa, "
							+ "máximo 100 caracteres");

					exp = leer.nextLine();

					if (exp.length() > 100) {

						System.out.println("Experiencia ingresada es inválida, "
								+ "intente nuevamente.");
					}

				} while (exp.length() > 100);

				administrativo.setExpPrevia(exp);
				contenedor.AlmacenarAdm(administrativo);

			}
				break;
			case 4: {

				System.out.println("Se almacenará la capacitación "
						+ "para el siguiente cliente: " + " ");
				

				cliente.analizarUsuario();

				int capa;
				System.out.println("Cuántas capacitaciones desea registrar?");
				capa = leer.nextInt();
				leer.nextLine();

				for (int i = 0; i < capa; i++) {

					do {
						System.out.println("Ingrese identificador, Ej. 111");

						idc = leer.nextLine();

						if (idc.length() < 1) {
							System.out.println("El identificador es obligatorio, "
									+ "intente nuevamente.");
						}
					} while (idc.length() < 1);

					capacitacion.setIdentificador(idc);

					do {
						System.out.println("Ingrese Rut del cliente");

						rutc = leer.nextLine();

						if (rutc.length() < 1) {
							System.out.println("El Rut es obligatorio, "
									+ "intente nuevamente.");
						}
					} while (rutc.length() < 1);

					capacitacion.setRut(rutc);

					do {
						System.out.println("Ingrese día de la capacitación "
								+ "en minúscula, ej. lunes:");

						dia = leer.nextLine();

						if ("lunes" != dia.intern() && "martes" != dia.intern() && "miercoles" != dia.intern()
								&& "jueves" != dia.intern() && "viernes" != dia.intern() && "sabado" != dia.intern()
								&& "domingo" != dia.intern()) {
							System.out.println("Debe ingresar el día en minuscula, intente nuevamente.");
						}
					} while ("lunes" != dia.intern() && "martes" != dia.intern() && "miercoles" != dia.intern()
							&& "jueves" != dia.intern() && "viernes" != dia.intern() && "sabado" != dia.intern()
							&& "domingo" != dia.intern());

					capacitacion.setDia(dia);

					do {
						System.out.println("Ingrese hora en formato HH:MM:");

						Hora = leer.nextLine();

						if (Hora.length() < 5) {
							System.out.println("El formato ingresado es inválido, "
									+ "intente nuevamente.");
						}
					} while (Hora.length() < 5);

					capacitacion.setHora(Hora);

					do {
						System.out.println("Ingrese el lugar, "
								+ "entre 10 y 50 caracteres:");

						lugarac = leer.nextLine();

						if (lugarac.length() < 10 || lugarac.length() > 50) {

							System.out.println("La longitud del lugar es inválida, "
									+ "intente nuevamente.");
						}

					} while (lugarac.length() < 10 || lugarac.length() > 50);

					capacitacion.setLugar(lugarac);

					do {
						System.out.println("Ingrese duración, máx.70:");

						duracion = leer.nextLine();

						if (duracion.length() > 70) {

							System.out.println("Duración inválida, "
									+ "intente nuevamente.");
						}

					} while (duracion.length() > 70);

					capacitacion.setDuracion(duracion);

					do {
						System.out.println("Ingrese cantidad de asistentes, "
								+ "mínimo 1 y máximo 1000:");

						cantidad = leer.nextInt();
						leer.nextLine();

						if (cantidad < 0 || cantidad > 1000) {

							System.out.println("La cantidad es inválida, "
									+ "intente nuevamente");
						}

					} while (cantidad < 0 || cantidad > 1000);

					capacitacion.setCatAsist(cantidad);

					capacitacion.mostrarDetalles();

					contenedor.AlmacenarCap(capacitacion);
				}

			}
				break;
			case 5: {

				System.out.println("Ingrese RUN del usuario a eliminar, "
						+ "\nsin guión ni dígito verificador");

				elimn = leer.nextInt();
				leer.nextLine();

				contenedor.EliminarUsr(elimn);

				System.out.println("\n\nEl usuario con RUN: " 
				+ elimn + " ha sido eliminado exitosamente.");
				System.out.println(" ");
			}
				break;
			case 6: {

				contenedor.ListarUsuario();

			}
				break;
			case 7: {

				do {

					System.out.println("Ingrese tipo de usuario a listar");
					list = leer.nextLine();

					if ("profesional" != list.intern() && "administrativo" != list.intern()
							&& "cliente" != list.intern()) {

						System.out.println("Tipo de usuario no existe");
					}

				} while ("profesional" != list.intern() && "administrativo" != list.intern()
						&& "cliente" != list.intern());

				if (list.equals("profesional")) {
					contenedor.ListarUsuarioPorTipo(Clases.Profesional.class);
				}

				if (list.equals("administrativo")) {
					contenedor.ListarUsuarioPorTipo(Clases.Administrativo.class);
				}

				if (list.equals("cliente")) {
					contenedor.ListarUsuarioPorTipo(Clases.Cliente.class);
				}

			}
				break;
			case 8: {

				contenedor.ListarCapacitaciones();
			}
				break;
			case 9: {

				op = 9;
			}
				break;

			default:
				System.out.println("Opción no válida, intente nuevamente");
			}

		} while (op != 9);

		System.out.println("*** HASTA LUEGO PULENTO PROFE :) ***");

	}
}
