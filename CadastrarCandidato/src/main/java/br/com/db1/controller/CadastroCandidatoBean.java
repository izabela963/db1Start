package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroCandidatoBean {
	private String nomeCandidato;
	private Integer telefoneCandidato;
	private String emailCandidato;
	private String linkCandidato;
	
	
	
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getEmailCandidato() {
		return emailCandidato;
	}
	public void setEmailCandidato(String emailCandidato) {
		this.emailCandidato = emailCandidato;
	}
	public Integer getTelefoneCandidato() {
		return telefoneCandidato;
	}
	public void setTelefoneCandidato(Integer telefoneCandidato) {
		this.telefoneCandidato = telefoneCandidato;
	}
	public String getLinkCandidato() {
		return linkCandidato;
	}
	public void setLinkCandidato(String linkCandidato) {
		this.linkCandidato = linkCandidato;
	}
	
}
