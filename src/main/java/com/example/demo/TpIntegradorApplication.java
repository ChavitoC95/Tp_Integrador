package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entities.Clientes;
import Entities.Incidentes;
import Entities.Operador;
import Entities.Servicio;
import Entities.Tecnico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class TpIntegradorApplication {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
		EntityManager em = emf.createEntityManager();
		
		try {
			Servicio servicio1 = new Servicio("Photoshop");
			Servicio servicio2 = new Servicio("Ilustrador");
			Servicio servicio3 = new Servicio("Paquete Office");
			Tecnico tecnico1 = new Tecnico ("Jose Hernandez", 2325896);
			Tecnico tecnico2 = new Tecnico ("Melisa Andrade", 2325696);
			Incidentes incidente1 = new Incidentes("Photoshop","Error_3300");
			Clientes cliente1 = new Clientes("ResponsInscrip","2566245");
			Operador operador1 = new Operador();
			tecnico1.agrgarEspecialidad(servicio1);
			tecnico1.agrgarEspecialidad(servicio2);
			tecnico1.agrgarEspecialidad(servicio3);
			tecnico2.agrgarEspecialidad(servicio1);
			tecnico2.agrgarEspecialidad(servicio3);
			cliente1.agregarServicio(servicio1);
			cliente1.agregarServicio(servicio3);
			cliente1.agregarIncidente(incidente1);
			operador1.agregarClientes(cliente1);
			operador1.agregarincidente(incidente1);
			operador1.agregarServicio(servicio1);
			operador1.agregarServicio(servicio2);
			operador1.agregarServicio(servicio3);
			operador1.agregarTecnicos(tecnico1);
			operador1.agregarTecnicos(tecnico2);
			
			System.out.println(cliente1.getRazonSocial()+cliente1.getCuit()+ cliente1.getServicioContratado() + cliente1.getIncidentesReportados());
			
			em.getTransaction().begin();
			em.persist(cliente1);
			em.flush();
			em.getTransaction().commit();
			System.out.println(cliente1.getRazonSocial()+cliente1.getCuit()+ cliente1.getServicioContratado() + cliente1.getIncidentesReportados());
			
		}catch(Exception e){
			em.getTransaction().rollback();
		}
		em.close();
		emf.close();
		
		
		
	}



	}

