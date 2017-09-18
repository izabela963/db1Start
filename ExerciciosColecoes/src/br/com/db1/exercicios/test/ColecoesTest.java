package br.com.db1.exercicios.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.exercicios.Colecoes;

public class ColecoesTest {

	Colecoes colecao = new Colecoes();
	
	@Before
	public void before(){
		colecao.adicionarNomes("Leonardo");
		colecao.adicionarNomes("Patrick");
		colecao.adicionarNomes("Maycon");
		colecao.adicionarNomes("Camile");
		colecao.adicionarNomes("Mateus");
		colecao.adicionarNomes("Matheus");
		colecao.adicionarNomes("Luiz");
		colecao.adicionarNomes("Isadora");
		colecao.adicionarNomes("Brenda");
		colecao.adicionarNomes("Daniel");
		colecao.adicionarNomes("Andr�");
	}
	
	@Test
	public void exercicio1Test() {
		Assert.assertTrue(11 == colecao.getLista().size());
	}
	
	
	@Test
	public void exercicio2Test(){
		colecao.removerNomes("Leonardo");
		colecao.removerNomes("Patrick");
		colecao.removerNomes("Maycon");

		Assert.assertTrue(8 == colecao.tamanhoLista());
	}
	
	
	@Test
	public void exercicio4Test(){
		Assert.assertTrue(false == colecao.estaNaLista("FUSCA"));
	}
	
	
	@Test
	public void exercicio5Test(){
		Assert.assertTrue(true == colecao.estaNaLista("Leonardo"));
	}
	
	@Test
	public void exercicio6Test(){
		colecao.getListaOrdenada();
		colecao.percorrerList();
 	}
}