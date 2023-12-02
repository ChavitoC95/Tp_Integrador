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
public class Operador implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	//@OneToMany (mappedBy = "MesaAyuda", cascade = CascadeType.ALL)
	private String mesaAyuda;
	@Column
	//@OneToMany (mappedBy = "Incidentes", cascade = CascadeType.ALL)
	private List<Incidentes>listaincidentes;
	@Column
	//@OneToMany (mappedBy = "Servicios", cascade = CascadeType.ALL)
	private List<Servicio> listaservicios;
	@Column
	//@OneToMany (mappedBy = "Tecnicos", cascade = CascadeType.ALL)
	private List <Tecnico> listatecnico;
	@Column
	//@OneToMany (mappedBy = "Id", cascade = CascadeType.ALL)
	//@JoinColumn (name = "FK Clientes")
	private List<Clientes>listacliente;
	
	
	public void agregarincidente(Incidentes incidente) {
		this.listaincidentes.add(incidente);

	}
	
	
	public void agregarServicio(Servicio servicio) {
		this.listaservicios.add(servicio);
}
	
	public void agregarTecnicos(Tecnico tecnico) {
		this.listatecnico.add(tecnico);
	}

	public void agregarClientes(Clientes cliente) {
		this.listacliente.add(cliente);
}

}
