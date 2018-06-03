package mx.com.gm.capaservicio;import java.util.List;import mx.com.gm.capadatos.PersonaDao;import mx.com.gm.capadatos.domain.Persona;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;
/** * Implementación de la capa de servicios sobre Personas. *  * @author david * */
@Service("personaService")
@Transactional
public class PersonaServiceImpl implements PersonaService {	
	@Autowired
	private PersonaDao personaDao;
	/*	 * (non-Javadoc)	 * @see mx.com.gm.capaservicio.PersonaService#listarPersonas()	 */
	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}
	/*	 * (non-Javadoc)	 * @see mx.com.gm.capaservicio.PersonaService#recuperarPersona(mx.com.gm.capadatos.domain.Persona)	 */
	public Persona recuperarPersona(Persona persona) {
		return personaDao.findPersonaById(persona.getIdPersona());
	}
	/*	 * (non-Javadoc)	 * @see mx.com.gm.capaservicio.PersonaService#agregarPersona(mx.com.gm.capadatos.domain.Persona)	 */
	public void agregarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}
	/*	 * (non-Javadoc)	 * @see mx.com.gm.capaservicio.PersonaService#modificarPersona(mx.com.gm.capadatos.domain.Persona)	 */
	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}
	/*	 * (non-Javadoc)	 * @see mx.com.gm.capaservicio.PersonaService#eliminarPersona(mx.com.gm.capadatos.domain.Persona)	 */
	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}	
}