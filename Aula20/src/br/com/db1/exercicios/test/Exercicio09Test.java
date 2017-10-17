package br.com.db1.exercicios.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.Produto;
import br.com.db1.exercicios.ProdutoComparator;

public class Exercicio09Test {
	
	
	//Ordena��o por pre�o
	@Test
	public void exercicio09Test(){
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(98, "CELULAR", 1000.00));
		produtos.add(new Produto(50, "MONITOR", 200.00));
		produtos.add(new Produto(55, "CANECA", 50.00));
		
		Assert.assertTrue(3 == produtos.size());
		
		Assert.assertTrue(1000.00 == produtos.get(0).getValor());
		Assert.assertTrue(200.00 == produtos.get(1).getValor());
		Assert.assertTrue(50.00 == produtos.get(2).getValor());
		
		Assert.assertEquals("CANECA",produtos.get(2).getDescricao());
		Assert.assertEquals("CELULAR",produtos.get(0).getDescricao());
		Assert.assertEquals("MONITOR",produtos.get(1).getDescricao());
		
		Collections.sort(produtos);
		
		Assert.assertTrue(1000.00 == produtos.get(2).getValor());
		Assert.assertTrue(200.00 == produtos.get(1).getValor());
		Assert.assertTrue(50.00 == produtos.get(0).getValor());
		
		Collections.sort(produtos, new ProdutoComparator());
		
		Assert.assertEquals("CANECA",produtos.get(0).getDescricao());
		Assert.assertEquals("CELULAR",produtos.get(1).getDescricao());
		Assert.assertEquals("MONITOR",produtos.get(2).getDescricao());
	}
}