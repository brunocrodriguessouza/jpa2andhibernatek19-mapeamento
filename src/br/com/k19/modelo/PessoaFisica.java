package br.com.k19.modelo;

import javax.persistence.Entity;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Usando o Single Table Será criada uma única tabela com um campo DTYPE
 *         que será utilizada para identificar a classe do objeto correspondente
 *         ao registro
 *
 */

@Entity
public class PessoaFisica extends Pessoa {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
