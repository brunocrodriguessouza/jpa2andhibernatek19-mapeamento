package br.com.k19.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Cliente;
import br.com.k19.modelo.Pedido;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Criação das tabelas Pedido e Cliente com relacionamento Many to One
 *         (@ManyToOne)
 *
 */

public class AdicionaPedidoCliente {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("K21_mapeamento_pu");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Cliente cliente = new Cliente();
		cliente.setNome("Rafael Consentino");

		Pedido pedido = new Pedido();
		pedido.setData(Calendar.getInstance());
		pedido.setCliente(cliente);

		manager.persist(cliente);
		manager.persist(pedido);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
