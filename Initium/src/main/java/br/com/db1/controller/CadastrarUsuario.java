package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastrarUsuario {
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String status;
	private Linguagem linguagem = Linguagem.JAVA;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Linguagem[] getListaLinguagem() {
		return linguagem.values();
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public Linguagem getLinguagem() {
		return linguagem;
	}
	
	
	public void cadastrar() {
		setEmailUsuario(emailUsuario);
		setNomeUsuario(nomeUsuario);
		setSenhaUsuario(senhaUsuario);
		
		setStatus("Cadastro realizado com sucesso!");
	}
	
}
