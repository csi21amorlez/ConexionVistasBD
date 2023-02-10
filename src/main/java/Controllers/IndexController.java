package Controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Modelos.DTOs.AlumnoDTO;

@Controller
public class IndexController {
	
	private final Log logs = LogFactory.getLog(getClass());
	
	@RequestMapping("/insertarAlumno")
	public String navForm(Model modelo) {
		logs.info("Navegamos al formulario");
		AlumnoDTO dto = new AlumnoDTO();
		modelo.addAttribute("alumno", dto);	
		
		return "formAlumno";		
	}
	
	@RequestMapping("/listadoAlumnos")
	public String navListAlumno() {
		logs.info("Navegamos a la lista de alumnos");
				
		
		
		return "listAlumnos";
	}

}
