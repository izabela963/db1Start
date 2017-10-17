package br.com.db1.exercicios.test;



<<<<<<< HEAD
import java.util.Iterator;
import java.util.List;

=======
>>>>>>> origin/master
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.exercicios.ColecoesSet;

public class ColecoesSetTest {

	ColecoesSet colecao = new ColecoesSet();
	
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
		colecao.adicionarNomes("André");
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
<<<<<<< HEAD
		List<String> ordenada = (List<String>) colecao.getListaOrdenada();
		Iterator<String> it = ordenada.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
 	} 
	
	@Test
	public void exercicio6Test2(){
		List<String> ordenados = (List<String>) colecao.getListaOrdenada2();
		Iterator<String> it = ordenados.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
 	} 
=======
		colecao.getListaOrdenada();
		colecao.percorrerList();
 	}
>>>>>>> origin/master
}
