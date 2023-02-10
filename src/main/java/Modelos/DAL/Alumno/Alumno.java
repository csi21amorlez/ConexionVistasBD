package Modelos.DAL.Alumno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Alumno.
 */
@Entity
@Table(name="bec_alumno", schema = "sc_bec_ejercicio_vistas")
public class Alumno {
	
	/** The id. */
	@Id
	@SequenceGenerator(name = "alumno_idalumno_seq", sequenceName = "alumno_idalumno_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_idalumno_seq")
	@Column(name = "id_alumno")
	private int id;
	
	/** The nombre. */
	@Column(name="nombre")
	private String nombre;
	
	/** The apellidos. */
	@Column(name="apellidos")
	private String apellidos;
	
	/** The curso. */
	@Column(name="curso")
	private String curso;
	
	/** The direccion. */
	@Column(name="direccion")
	private String direccion;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Gets the curso.
	 *
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	
	/**
	 * Sets the curso.
	 *
	 * @param curso the new curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
