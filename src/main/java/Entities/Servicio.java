package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter


public class Servicio implements Serializable {
	
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
	private List<Servicio>servicioContratado;
	
	public Servicio(String nombre) {
		super();
		this.nombre = nombre;
		this.servicioContratado = new ArrayList<Servicio>(servicioContratado);
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

	public List<Servicio> getServicioContratado() {
		return servicioContratado;
	}

	public void setServicioContratado(List<Servicio> servicioContratado) {
		this.servicioContratado = servicioContratado;
	}
	
	
	
	

}
