package Entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Clientes implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String razonSocial;
	@Column
	private String cuit;
	//@OneToMany (mappedBy = "Servicios", cascade = CascadeType.ALL)
	//@JoinColumn(name ="Fk Servicio")
	private List<Servicio>servicioContratado;
	private List<Incidentes>incidentesReportados;
	

	public Clientes(String razonSocial, String cuit) {
		super();
		this.razonSocial = razonSocial;
		this.cuit = cuit;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public List<Servicio> getServicioContratado() {
		return servicioContratado;
	}

	public void setServicioContratado(List<Servicio> servicioContratado) {
		this.servicioContratado = servicioContratado;
	}

	public List<Incidentes> getIncidentesReportados() {
		return incidentesReportados;
	}

	public void setIncidentesReportados(List<Incidentes> incidentesReportados) {
		this.incidentesReportados = incidentesReportados;
	}

	
	
	public void agregarServicio(Servicio servicio) {
		this.servicioContratado.add(servicio);
	
	}
	public void agregarIncidente(Incidentes incidente) {
		this.incidentesReportados.add(incidente);
	
	}
}

