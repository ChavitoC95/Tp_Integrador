package Entities;

import java.util.List;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tecnico implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nombre;
	@Column
	private int matricula;
	@Column
	private List<Servicio>gestionDeServicios;
	
	public Tecnico(String nombre, int matricula) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public List<Servicio> getGestionDeServicios() {
		return gestionDeServicios;
	}


	public void setGestionDeServicios(List<Servicio> gestionDeServicios) {
		this.gestionDeServicios = gestionDeServicios;
	}


	public void agrgarEspecialidad(Servicio servicio) {
		this.gestionDeServicios.add(servicio);
		
	}
}
