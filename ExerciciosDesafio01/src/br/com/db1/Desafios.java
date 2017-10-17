package br.com.db1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Desafios {

	public Boolean palindromo(String palavra) {

		String palavraContrario = new StringBuilder(palavra).reverse().toString();
		Integer tamanhoPalavra = palavra.length();

		System.out.println("A palavra " + palavra + " tem " + tamanhoPalavra + " letras.");

		if (palavraContrario.equals(palavra)) {
			System.out.println("E é um palíndromo");
			return true;
		} else {
			System.out.println("E é não um palíndromo");
			return false;
		}
	}

	public Boolean numeroPrimo(Integer numero) {
		for (int i = 2; i < numero / 2 + 1; i++) {
			if (numero % i == 0) {
				System.out.println("O número " + numero + " não é primo.");
				return false;
			}
		}
		System.out.println("O número " + numero + " é primo.");
		return true;
	}

	public List<Integer> fibonacci(Integer numeroMaximo) {
		List<Integer> sequenciaFibonacci = new ArrayList<>();

		Integer ultimoNumero = 0;
		Integer numeroAtual = 1;
		Integer auxiliar = 1;

		for (Integer i = 0; i <= numeroMaximo;) {
			sequenciaFibonacci.add(auxiliar);
			auxiliar = ultimoNumero + numeroAtual;
			ultimoNumero = numeroAtual;
			numeroAtual = auxiliar;
			i = auxiliar;
		}

		Iterator<Integer> lista1 = sequenciaFibonacci.iterator();
		while (lista1.hasNext()) {
			System.out.print(lista1.next() + ", ");

		}
		System.out.println();

		return sequenciaFibonacci;
	}

	public Boolean cpf(Long numero) {
		
		if ((numero == 11111111111l) || (numero == 22222222222l) || (numero == 33333333333l) || (numero == 44444444444l) || 
			(numero == 55555555555l) || (numero == 66666666666l) || (numero == 77777777777l) || (numero == 88888888888l) ||
			(numero == 99999999999l)) {
				return false;
			}
		
		
		
		Long divisor = 10000000000l;
		Long soma = 0l;
		Long digitoVerificador1 = null;
		Long digitoVerificador2 = null;
		List<Long> restos = new ArrayList<>();
		List<Long> digitos = new ArrayList<>();

		restos.add(numero % divisor);
		restos.add(numero % 1000000000);
		restos.add(numero % 100000000);
		restos.add(numero % 10000000);
		restos.add(numero % 1000000);
		restos.add(numero % 100000);
		restos.add(numero % 10000);
		restos.add(numero % 1000);
		restos.add(numero % 100);
		restos.add(numero % 10);

		digitos.add(numero / divisor);

		divisor = 1000000000l;
		for (int i = 0; i < restos.size(); i++) {
			digitos.add(restos.get(i) / divisor);
			divisor = divisor / 10l;
		}


		for (Integer i = 0; i < 9; i++) {
			soma = soma + (digitos.get(i) * (10 - i));
		}
		System.out.println(soma);
		Long resto = soma % 11l;
		digitoVerificador1 = (11l - resto) % 10;
		soma = 0l;

		for (Integer i = 0; i < 10; i++) {
			soma = soma + (digitos.get(i) * (11 - i));
		}
		System.out.println(soma);
		resto = soma % 11l;
		digitoVerificador2 = (11l - resto) % 10;

		if (digitoVerificador1 == digitos.get(9)) {
			if(digitoVerificador2 == digitos.get(10)) {
				System.out.println("CPF válido.");
				return true;
			} else {
				System.out.println("CPF inválido.");
				return false;
			}
		} else {
			System.out.println("CPF inválido.");
			return false;
		}
	}

}
