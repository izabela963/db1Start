package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastrarCandidatoBean {
	
	private String nome;
	private Integer telefone;
	private String email;
	private String link;
	private String status;
	
	private String nomeCandidato;
	private Integer telefoneCandidato;
	private String emailCandidato;
	private String linkCandidato;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
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
	
	public String cancelar() {
		return "/home";
	}
	
	public void cadastrar() {
		setStatus("Cadastro realizado com sucesso!!");
		setNome(nomeCandidato);
		setTelefone(telefoneCandidato);
		setEmail(emailCandidato);
		setLink(linkCandidato);
		
	}
}
