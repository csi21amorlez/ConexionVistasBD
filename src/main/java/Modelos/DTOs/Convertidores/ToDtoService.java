package Modelos.DTOs.Convertidores;

import java.util.ArrayList;

import Modelos.DAL.Alumno.Alumno;
import Modelos.DTOs.AlumnoDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface ToDtoService.
 */
public interface ToDtoService {
	
	
	/**
	 * Alumno to dto.
	 *
	 * @param dao the dao
	 * @return the alumno DTO
	 */
	public AlumnoDTO alumnoToDto(Alumno dao);
	
	/**
	 * List alumno to dto.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<AlumnoDTO> listAlumnoToDto(ArrayList<Alumno> listDao);
	

}
