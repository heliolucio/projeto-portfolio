package br.com.projeto.portfolio.modelo;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Membros {
	
	private Pessoa idPessoa;
	private Projeto idProjeto;

}
