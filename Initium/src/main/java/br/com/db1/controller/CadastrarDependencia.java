package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastrarDependencia {
	
	private String nomeDependencia;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeDependencia() {
		return nomeDependencia;
	}

	public void setNomeDependencia(String nomeDependencia) {
		this.nomeDependencia = nomeDependencia;
	}
	
	public void cadastrar() {
		setNomeDependencia(nomeDependencia);
		setStatus("Cadastro da dependência realizado com sucesso!!");
	}
}