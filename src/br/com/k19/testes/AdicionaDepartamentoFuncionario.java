package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Departamento;
import br.com.k19.modelo.Funcionario;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Criação das tabelas Governador e Estado com o relacionamento One to
 *         Many (@OneToMany)
 *
 */

public class AdicionaDepartamentoFuncionario {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("K21_mapeamento_pu");

		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rafael Consentino");

		Departamento departamento = new Departamento();
		departamento.setNome("Financeiro");
		departamento.getFuncionarios().add(funcionario);
		
		manager.persist(funcionario);
		manager.persist(departamento);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}
}
