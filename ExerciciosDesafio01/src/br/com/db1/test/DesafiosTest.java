package br.com.db1.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.Desafios;

public class DesafiosTest {
	Desafios desafio = new Desafios();
	
	@Test
	public void palindromoTest() {
		Assert.assertTrue(desafio.palindromo("ovo"));
		Assert.assertFalse(desafio.palindromo("ovos"));	
	}
	
	@Test
	public void numeroPrimoTest() {
		Assert.assertTrue(desafio.numeroPrimo(7));
		Assert.assertTrue(desafio.numeroPrimo(13));
		Assert.assertFalse(desafio.numeroPrimo(1020));
	}
	
	@Test
	public void fibonacciTest() {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(5);
		lista.add(8);
		lista.add(13);
		lista.add(21);
		
		Assert.assertTrue(8 == desafio.fibonacci(22).size());
		Assert.assertTrue(desafio.fibonacci(21).containsAll(lista));
	}
	
	@Test
	public void cpfTest() {
		Assert.assertTrue(desafio.cpf(12345678909l));
		Assert.assertFalse(desafio.cpf(12345678910l));
		Assert.assertFalse(desafio.cpf(11111111111l));
		Assert.assertFalse(desafio.cpf(22222222222l));
		Assert.assertFalse(desafio.cpf(33333333333l));
		Assert.assertFalse(desafio.cpf(44444444444l));
		Assert.assertFalse(desafio.cpf(55555555555l));
		Assert.assertFalse(desafio.cpf(66666666666l));
		Assert.assertFalse(desafio.cpf(77777777777l));
		Assert.assertFalse(desafio.cpf(88888888888l));
		Assert.assertFalse(desafio.cpf(99999999999l));
		Assert.assertFalse(desafio.cpf(45215l));
		Assert.assertFalse(desafio.cpf(456456123456l));
	}
}
