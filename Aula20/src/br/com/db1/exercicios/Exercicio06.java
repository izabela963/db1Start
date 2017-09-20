package br.com.db1.exercicios;

import java.util.ArrayList;

import java.util.List;


public class Exercicio06 {
	
	
	public List<String> copiaLista(List<String> textos){
		List<String> novaLista = new ArrayList<>(textos);

		return novaLista;
	}
}
