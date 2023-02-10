package Modelos.DTOs.Convertidores;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import Modelos.DAL.Alumno.Alumno;
import Modelos.DTOs.AlumnoDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class ToDtoImpl.
 */
@Component
public class ToDtoImpl implements ToDtoService {

	@Override
	public AlumnoDTO alumnoToDto(Alumno dao) {

		AlumnoDTO dto = new AlumnoDTO();

		dto.setNombre(dao.getNombre());
		dto.setApellidos(dao.getApellidos());
		dto.setDireccion(dao.getDireccion());
		dto.setCurso(dao.getCurso());

		return dto;
	}

	@Override
	public ArrayList<AlumnoDTO> listAlumnoToDto(ArrayList<Alumno> listDao) {

		ArrayList<AlumnoDTO> listDto = new ArrayList<AlumnoDTO>();

		for (Alumno dao : listDao) {
			listDto.add(alumnoToDto(dao));

		}

		return listDto;
	}

}
