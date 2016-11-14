package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Pessoa;
import br.com.k19.modelo.PessoaFisica;
import br.com.k19.modelo.PessoaJuridica;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Usando o Single Table Será criada uma única tabela com um campo DTYPE
 *         que será utilizada para identificar a classe do objeto correspondente
 *         ao registro
 *
 */

public class AdicionaPessoa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("K21_mapeamento_pu");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Marcelo");

		PessoaFisica pessoa2 = new PessoaFisica();
		pessoa2.setNome("Rafael");
		pessoa2.setCpf("12345678910");

		PessoaJuridica pessoa3 = new PessoaJuridica();
		pessoa3.setNome("K19");
		pessoa3.setCnpj("12345678910111");

		manager.persist(pessoa1);
		manager.persist(pessoa2);
		manager.persist(pessoa3);

		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}
}
