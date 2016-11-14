package br.com.k19.testes;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Candidato;
import br.com.k19.modelo.Endereco;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Criação da Candidato e persistindo o Endereco sem criar a tabela
 *         Endereco
 *
 */

public class AdicionaCandidatoEndereco {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("K21_mapeamento_pu");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Endereco endereco = new Endereco();
		endereco.setEstado("São Paulo");
		endereco.setCidade("São Paulo");
		endereco.setLogradouro("Av. Brigadeiro Faria Lima");
		endereco.setNumero(1571);

		Candidato candidato = new Candidato();
		candidato.setNome("Rafael Consentino");
		candidato.setNascimento(new GregorianCalendar(1984, 10, 30));
		candidato.setEndereco(endereco);

		manager.persist(candidato);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
