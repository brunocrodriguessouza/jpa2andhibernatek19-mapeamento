package br.com.k19.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Bruno Cícero Rodrigues de Souza
 * 
 *         A Tabela Reserva será criada com a personalização da conversação com
 *         Attribute Converter na Classe LocalDate
 *
 */

@Entity
public class Reserva {

	@Id
	@GeneratedValue
	private Long id;

	private LocalDate inicio;

	private LocalDate termino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getTermino() {
		return termino;
	}

	public void setTermino(LocalDate termino) {
		this.termino = termino;
	}

}
