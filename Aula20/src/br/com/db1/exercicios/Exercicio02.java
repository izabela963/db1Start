package br.com.db1.exercicios;

import java.util.HashSet;
import java.util.Set;

public class Exercicio02 {
	public Set<String> getConsoantes(String palavra) {
		palavra = palavra.toLowerCase();
		Set<String> consoantes = new HashSet<>();
		consoantes.add("b");
		consoantes.add("c");
		consoantes.add("d");
		consoantes.add("f");
		consoantes.add("g");
		consoantes.add("h");
		consoantes.add("j");
		consoantes.add("k");
		consoantes.add("l");
		consoantes.add("m");
		consoantes.add("n");
		consoantes.add("p");
		consoantes.add("q");
		consoantes.add("r");
		consoantes.add("s");
		consoantes.add("t");
		consoantes.add("v");
		consoantes.add("x");
		consoantes.add("w");
		consoantes.add("y");
		consoantes.add("z");
		consoantes.add("ç");
		

Set<String> consoantesEncontradas = new HashSet<>();
		
		for (int i = 0; i < palavra.length(); i++) {
			String letra = palavra.substring(i, i + 1);
			if (consoantes.contains(letra)) {
				consoantesEncontradas.add(letra);
			}
			
		}
		return consoantesEncontradas;
	
	}
}
