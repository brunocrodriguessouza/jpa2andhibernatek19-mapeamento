package br.com.k19.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         Tabela Fatura será gerada a partir dessa classe com o
 *         relacionamento One to Many (@OneToMany)
 *
 */

@Entity
public class Fatura {
	@Id
	@GeneratedValue
	private Long id;

	@OneToMany
	private Collection<Ligacao> ligacoes = new ArrayList<Ligacao>();

	@Temporal(TemporalType.DATE)
	private Calendar vencimento;

	public Calendar getVencimento() {
		return vencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Ligacao> getLigacoes() {
		return ligacoes;
	}

	public void setLigacoes(Collection<Ligacao> ligacoes) {
		this.ligacoes = ligacoes;
	}

}
