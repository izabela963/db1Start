package br.com.db1.exercicios.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.Exercicio07;

public class Exercicio07Test {
	@Test
	public void comparaListasTest(){
		
		Exercicio07 colecao = new Exercicio07();
		
		
		List<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		
		lista1.add("Engenharia");
		lista1.add("El�trica");
		lista1.add("JAVA");
		lista1.add("TinBot");
		lista1.add("JAVA");
		
		lista2.add("Engenharia");
		lista2.add("El�trica");
		lista2.add("TinBot");
		lista2.add("JAVA");
		lista2.add("JAVA");
		
		Boolean iguais = lista1.containsAll(lista2);
		
		//Assert.assertTrue(lista1.size() == lista2.size());
		Assert.assertTrue(lista1.containsAll(lista2));
		Assert.assertEquals(iguais, colecao.comparaListas(lista1, lista2));


	}
}
