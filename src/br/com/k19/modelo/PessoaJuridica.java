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
public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
