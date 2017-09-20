package br.com.db1.exercicios.test;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import br.com.db1.exercicios.Exercicio03;

public class Exercicio03Test {
	
	Exercicio03 colecao = new Exercicio03();
		
	@Test
	public void excluiPosicaoTest(){
		
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			valores.add(i);
		}
		
		List<Integer> novosValores = colecao.excluiPosicao(valores);
		Assert.assertFalse(novosValores.contains(2));
	}
		
}

