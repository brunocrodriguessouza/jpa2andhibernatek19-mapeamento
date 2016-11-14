package br.com.k19.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Tabela Ligacao será gerada a partir dessa classe com o relacionamento
 *         Many to One (@ManyToOne)
 *
 */

@Entity
public class Ligacao {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Fatura fatura;

	private Integer duracao;

}
