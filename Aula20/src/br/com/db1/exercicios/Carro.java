package br.com.db1.exercicios;

public class Carro implements Comparable<Carro>{
	private String nome;
	private String marca;
	private Integer ano;
	private String placa;
	
	public Carro(Integer ano, String nome, String marca, String placa){
		this.nome = nome;
		this.ano = ano;
		this.placa = placa;
		this.marca = marca;
	}
	
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	@Override
	public int compareTo(Carro outroCarro){
		if (this.getAno() < outroCarro.getAno()) {
			return -1;
		}
		if (this.getAno() > outroCarro.getAno()) {
			return 1;
		}
		return 0;
	}



	
}