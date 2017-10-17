package br.com.db1.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio05 {
	
	public List<Integer> multiplos2(List<Integer> lista){
		
		Integer numero;
		List<Integer> listaMultiplos = new ArrayList<>();
		
		Iterator<Integer> lista1 = lista.iterator();
		while (lista1.hasNext()) {
			numero = lista1.next();
			if (numero%2 == 0) {
				listaMultiplos.add(numero);
			}
		}
		
		return listaMultiplos;
	}
	
}