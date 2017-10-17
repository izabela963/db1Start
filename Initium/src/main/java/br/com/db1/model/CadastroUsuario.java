package br.com.db1.model;

public class CadastroUsuario {

	private String nomeCandidato;
	private Integer numeroCandidato;
	private String emailCandidato;
	private String dependenciaCandidato;
	
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
	public String getDependenciaCandidato() {
		return dependenciaCandidato;
	}
	public void setDependenciaCandidato(String dependenciaCandidato) {
		this.dependenciaCandidato = dependenciaCandidato;
	}
}
