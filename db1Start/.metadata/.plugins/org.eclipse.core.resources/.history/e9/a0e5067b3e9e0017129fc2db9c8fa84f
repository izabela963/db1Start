package br.com.db1.exercicios;

import java.util.HashSet;
import java.util.Set;

import org.omg.CORBA.portable.ValueOutputStream;

public class Exercicio01 {
	
	public Set<String> getVogais(String palavra) {
		palavra = palavra.toLowerCase();
		Set<String> vogais = new HashSet<>();
		vogais.add("a");
		vogais.add("e");
		vogais.add("i");
		vogais.add("o");
		vogais.add("u");
		
		Set<String> vogaisEncontradas = new HashSet<>();
		
		for (int i = 0; i < palavra.length(); i++) {
			String letra = palavra.substring(i, i + 1);
			if (vogais.contains(letra)) {
				vogaisEncontradas.add(letra);
			}
			
		}
		return vogaisEncontradas;	
	
	}
}

