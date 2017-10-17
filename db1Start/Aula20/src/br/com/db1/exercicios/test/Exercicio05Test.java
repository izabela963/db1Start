package br.com.db1.exercicios.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.Exercicio05;


public class Exercicio05Test {
	
	
	@Test
	public void multiplos2Test(){
		
		Exercicio05 colecao = new Exercicio05();
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
		
		List<Integer> novaLista = colecao.multiplos2(lista);
		
		Assert.assertTrue(novaLista.contains(0));
		Assert.assertTrue(novaLista.contains(2));
		Assert.assertTrue(novaLista.contains(4));
		Assert.assertTrue(novaLista.contains(6));
		Assert.assertTrue(novaLista.contains(8));
		
	}
}
