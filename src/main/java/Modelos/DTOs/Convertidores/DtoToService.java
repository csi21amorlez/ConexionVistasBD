package Modelos.DTOs.Convertidores;

import java.util.ArrayList;

import Modelos.DAL.Alumno.Alumno;
import Modelos.DTOs.AlumnoDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface DtoToService.
 */
public interface DtoToService {
	
	/**
	 * Alumno dto to dao.
	 *
	 * @param dto the dto
	 * @return the alumno
	 */
	public Alumno alumnoDtoToDao(AlumnoDTO dto);
	
	/**
	 * List alumno to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Alumno> listAlumnoToDao(ArrayList<AlumnoDTO> listDto);
	
	

}
