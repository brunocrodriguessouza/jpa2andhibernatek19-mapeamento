package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Estado;
import br.com.k19.modelo.Governador;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Criação das tabelas Governador e Estado com o relacionamento One to
 *         One (@OneToOne)
 *
 */

public class AdicionaEstadoGovernador {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("K21_mapeamento_pu");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Governador governador = new Governador();
		governador.setNome("Rafael Consentino");

		Estado estado = new Estado();
		estado.setNome("São Paulo");
		estado.setGovernador(governador);

		manager.persist(governador);
		manager.persist(estado);

		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
