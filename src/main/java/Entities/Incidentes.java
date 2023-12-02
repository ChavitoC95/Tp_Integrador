package Entities;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Incidentes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nombreServicio;
	@Column
	private String descripcion;
	
	
	public Incidentes(String nombreServicio, String descripcion) {
		super();
		this.nombreServicio = nombreServicio;
		this.descripcion = descripcion;
	}
	
	
	
	

}
