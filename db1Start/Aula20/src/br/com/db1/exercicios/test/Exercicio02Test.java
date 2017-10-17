package br.com.db1.exercicios.test;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.Exercicio02;


public class Exercicio02Test {
	
	Exercicio02 colecao = new Exercicio02();
	
	@Test
	public void getConsoantesTest(){
		Set<String> consoantes = colecao.getConsoantes("Fusca");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
	}
	
}