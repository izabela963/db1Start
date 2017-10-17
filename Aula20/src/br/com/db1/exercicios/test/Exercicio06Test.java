package br.com.db1.exercicios.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.Exercicio06;

public class Exercicio06Test {

	
		@Test
		public void copiaListaTest(){
			
			Exercicio06 colecao = new Exercicio06();
			
			List<String> textos = new ArrayList<>();
			textos.add("oi");
			textos.add("sdfs");
			textos.add("sdse");
			textos.add("fjsrtuyw");
			textos.add("rtfb");
			textos.add("sdfgas");
			textos.add("dtaerg");
			textos.add("jhlrfy");
			textos.add("rfthwr");
			textos.add("fghrt");
			
			List<String> novaLista = colecao.copiaLista(textos);
			Assert.assertEquals(novaLista, textos);
			
		}
}
