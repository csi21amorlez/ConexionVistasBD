package Modelos.DAL.Consultas;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Modelos.DAL.Alumno.AlumnoImpl;
import Modelos.DTOs.AlumnoDTO;
import Modelos.DTOs.Convertidores.DtoToImpl;
import Modelos.DTOs.Convertidores.ToDtoImpl;

@Service
public class Consultas {
	
	@Autowired 
	AlumnoImpl implementacion;
	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	ToDtoImpl toDto;
	
	
	public void insertarAlumno(AlumnoDTO dto) {
		implementacion.insertarAlumno(dtoTo.alumnoDtoToDao(dto));		
	}
	
	public void eliminarAlumno(AlumnoDTO dto) {
		implementacion.eliminarAlumno(dtoTo.alumnoDtoToDao(dto));
	}
	
	public ArrayList<AlumnoDTO> buscarTodos(){
		return toDto.listAlumnoToDto(implementacion.buscarTodos());
	}
	

}
