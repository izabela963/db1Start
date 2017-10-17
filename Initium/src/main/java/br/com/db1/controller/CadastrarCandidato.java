package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastrarCandidato {
	
	private String nomeCandidato;
	private Integer numeroCandidato;
	private String emailCandidato;
	private String linkCandidato;
	private String status;
	
	public void cadastrar() {
		setNomeCandidato(nomeCandidato);
		setNumeroCandidato(numeroCandidato);
		setEmailCandidato(emailCandidato);
		setRedeSocialCandidato(linkCandidato);
		setStatus("Cadastro realizado com sucesso!!");
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public Integer getNumeroCandidato() {
		return numeroCandidato;
	}
	public void setNumeroCandidato(Integer numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}
	public String getEmailCandidato() {
		return emailCandidato;
	}
	public void setEmailCandidato(String emailCandidato) {
		this.emailCandidato = emailCandidato;
	}
	public String getRedeSocialCandidato() {
		return linkCandidato;
	}
	public void setRedeSocialCandidato(String redeSocialCandidato) {
		this.linkCandidato = redeSocialCandidato;
	}

}
