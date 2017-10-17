package br.com.db1.exercicios;

import java.util.Set;

public class Exercicio08 {
	
	public Boolean comparaSets(Set<String> lista1, Set<String> lista2){
		
		if (lista1.size() == lista2.size()) {
			if (lista1.equals(lista2)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
