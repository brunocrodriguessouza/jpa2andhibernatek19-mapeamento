package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Autor;
import br.com.k19.modelo.Livro;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Criação das tabelas Livro, Autor, e Livro_Autor com relacionamento Many to Many
 *         (@ManyToMany)
 *
 */

public class AdicionaLivroAutor {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("K21_mapeamento_pu");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Autor autor = new Autor();
		autor.setNome("Rafael Consentino");

		Livro livro = new Livro();
		livro.setNome("JPA2");
		livro.getAutores().add(autor);

		manager.persist(autor);
		manager.persist(livro);

		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
