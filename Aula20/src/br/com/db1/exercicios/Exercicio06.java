package br.com.db1.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio06 {
	
	
	public Set<String> copiaLista(Set<String> textos){
		Set<String> novaLista = new HashSet<>();

		String palavra = null;
		Iterator lista = textos.iterator();
		while (lista.hasNext()){
			palavra = lista.next().toString();
			novaLista.add(palavra);
		}

		return novaLista;
	}
}
