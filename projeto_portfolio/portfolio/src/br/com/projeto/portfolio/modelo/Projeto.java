package br.com.projeto.portfolio.modelo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Projeto {
	

	@Id
	@GeneratedValue
	private BigInteger id;
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio = Calendar.getInstance();
	
	@Temporal(TemporalType.DATE)
	private Calendar dataPrevisaoFim = Calendar.getInstance();
	
	@Temporal(TemporalType.DATE)
	private Calendar dataFim = Calendar.getInstance();
	
	private String descricao;
	private String status;
	private BigDecimal orcamento;
	private String risco;
	private BigInteger idGerente;
	

}
