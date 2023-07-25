package br.com.projeto.portfolio.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.projeto.portfolio.dao.DAO;
import br.com.projeto.portfolio.modelo.Membros;

@ManagedBean
@ViewScoped
public class MembroBean {
	
	private Membros membro = new Membros();
	
	public Membros getMembro() {
		return membro;
	}
	
	public String gravar() {
		if(this.membro.getIdPessoa() == null) {
			new DAO<Membros>(Membros.class).cadastrar(this.membro);
		} else {
			new DAO<Membros>(Membros.class).editar(this.membro);
		}
		
		this.membro = new Membros();
		
		return "portfolio?faces-redirect=true";
	}
	
	public String formMembro() {
		return "membro?faces-redirect=true";
	}

}
