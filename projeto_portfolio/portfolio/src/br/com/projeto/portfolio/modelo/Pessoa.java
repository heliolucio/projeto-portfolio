package br.com.projeto.portfolio.modelo;

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
public class Pessoa {
	
	@Id
	@GeneratedValue
	private BigInteger id;
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento = Calendar.getInstance();
	
	private String cpf;
	private Boolean funcionario;

}
