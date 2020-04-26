package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	public static List<Integer> fibonacci(){
		ArrayList<Integer> fibonacciList = new ArrayList<>();
		int primeiroValor = 0;
		int segundoValor = 1;
		int somaValorComAnterior = primeiroValor+segundoValor;
		fibonacciList.add(primeiroValor);
		fibonacciList.add(segundoValor);
		for(int i=0;somaValorComAnterior<350; i++){
			somaValorComAnterior = primeiroValor+segundoValor;
			primeiroValor = segundoValor;
			segundoValor = somaValorComAnterior;
			fibonacciList.add(somaValorComAnterior);
		}
		return fibonacciList;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}