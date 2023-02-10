package Modelos.DAL.Alumno;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class AlumnoImpl implements AlumnoService {

	@PersistenceContext
	EntityManager em;

	public void insertarAlumno(Alumno alumno) {
		em.persist(alumno);
	}

	public ArrayList<Alumno> buscarTodos() {

		String sql = "FROM Alumno a";

		return (ArrayList<Alumno>) em.createQuery(sql).getResultList();

	}

	public Alumno findById(int id) {

		String sql = "FROM Alumno a WHERE A.id = : idAlumno";

		return (Alumno) em.createQuery(sql).setParameter("idAlumno", id).getSingleResult();
	}

	public void eliminarAlumno(Alumno alumno) {
		em.remove(alumno);

	}

}
