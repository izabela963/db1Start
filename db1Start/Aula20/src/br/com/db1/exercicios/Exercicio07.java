package br.com.db1.exercicios;

import java.util.List;

public class Exercicio07 {
	
	public Boolean comparaListas(List<String> lista1, List<String> lista2){
		
		if (lista1.size() == lista2.size()) {
			if (lista1.containsAll(lista2)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
