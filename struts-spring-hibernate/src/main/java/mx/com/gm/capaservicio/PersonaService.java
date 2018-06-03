package mx.com.gm.capaservicio;

import java.util.List;
import mx.com.gm.capadatos.domain.Persona;

/**
 * Clase interface para la interacción con la capa de servicios, en este
 * caso, para los servicios sobre personas.
 * 
 * @author david
 *
 */
public interface PersonaService {
	
	/**
	 * Listado de personas.
	 * 
	 * @return Lista de personas.
	 */
	public List<Persona> listarPersonas();

	/**
	 * Recuperación de una persona.
	 * 
	 * @param persona
	 * @return Instancia de una persona.
	 */
	public Persona recuperarPersona(Persona persona);

	/**
	 * Alta de una persona.
	 * 
	 * @param persona Instancia de una persona a dar de alta.
	 */
	public void agregarPersona(Persona persona);

	/**
	 * Modificación de una persona.
	 * 
	 * @param persona Instancia de una persona a modificar.
	 */
	public void modificarPersona(Persona persona);

	/**
	 * Eliminación de una persona.
	 * 
	 * @param persona Instancia de una persona a eliminar.
	 */
	public void eliminarPersona(Persona persona);
	
}