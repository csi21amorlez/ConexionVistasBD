package Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Modelos.DAL.Consultas.Consultas;
import Modelos.DTOs.AlumnoDTO;

@Controller
public class ListAlumnoController {

	ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");

	@Autowired
	Consultas c;
	private Map<String, Object> modelo = new HashMap<String, Object>();
	private Log logs = LogFactory.getLog(getClass());

	@RequestMapping("/listAlumnos")
	public ModelAndView listadoAlumnos() {

		logs.info("Entramos en listadoAlumnos");
		ArrayList<AlumnoDTO> listAlumnos = c.buscarTodos();

		modelo.put("listAlumnos", listAlumnos);

		return new ModelAndView("listadoAlumnos", "model", listAlumnos);

	}

}
