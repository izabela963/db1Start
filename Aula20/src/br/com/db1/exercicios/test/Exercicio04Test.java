package br.com.db1.exercicios.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.Exercicio04;



public class Exercicio04Test {
	Exercicio04 colecao = new Exercicio04();
	
	@Test
	public void exibePosicao3Test(){
		
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			valores.add(i);
		}
		
		List<Integer> novosValores = colecao.exibePosicao3(valores);
		Assert.assertTrue( 4 == novosValores.size());
		Assert.assertTrue(novosValores.contains(0));
		Assert.assertTrue(novosValores.contains(3));
		Assert.assertTrue(novosValores.contains(6));
		Assert.assertTrue(novosValores.contains(9));
	}
}
