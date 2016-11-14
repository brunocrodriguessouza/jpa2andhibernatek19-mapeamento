package br.com.k19.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Tabela Pessoa será criada, com exemplo de uma das estratégias de
 *         herança (Single Table, Joined, Table Per Class), nesse exemplo
 *         usaremos o Single Table
 * 
 *         Single Table = Cria somente uma tabela para controlar as classes
 *         especificas também
 * 
 *         Joined = Cria chave de estrangeira somente com o que tem de diferente
 * 
 *         Table Per Class = Cria outras tabelas diferentes sem relacionamento
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Pessoa {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
