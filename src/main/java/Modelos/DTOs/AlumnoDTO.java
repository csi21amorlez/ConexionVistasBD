package Modelos.DTOs;

// TODO: Auto-generated Javadoc
/**
 * The Class AlumnoDTO.
 */
public class AlumnoDTO {
	
	/** The nombre. */
	private String nombre;
	
	/** The apellidos. */
	private String apellidos;
	
	/** The direccion. */
	private String direccion;
	
	/** The curso. */
	private String curso;
	
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
	 * Instantiates a new alumno DTO.
	 *
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param direccion the direccion
	 * @param curso the curso
	 */
	public AlumnoDTO(String nombre, String apellidos, String direccion, String curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.curso = curso;
	}
	
	/**
	 * Instantiates a new alumno DTO.
	 */
	public AlumnoDTO() {
		super();
	}
	
	

}
