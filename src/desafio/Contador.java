package desafio;

import java.util.Scanner;

public class Contador{
	public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int primeiroValor = terminal.nextInt(); 
		
		System.out.print("Digite o segundo número: ");
		int segundoValor = terminal.nextInt();

		
		try{
			contar(primeiroValor, segundoValor);
		} catch (ParametrosInvalidosException exeption) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

	static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException{
		
		if(primeiroValor > segundoValor){
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = segundoValor - primeiroValor;

		for(int i = 1; i <= contagem; i++){
			System.out.println("Imprimindo o número " + i);
		}
	}

}
