package estruturaRepetitiva;

import java.util.Scanner;

/**
	Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
	Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
	se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
	apenas NULO.
 */

public class ParImpar {

	public static void main(String[] args) {
		
		int numero, valor;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos Números Você vai Digitar?");
		numero = scanner.nextInt();

		for (int i = 1; i <= numero; i++) {

			System.out.println("Digite um Número:");
			valor = scanner.nextInt();

			if ((valor % 2 != 0) && (valor > 0)) {
				System.out.println("ÍMPAR POSITIVO\n");
			} 
			else if ((valor % 2 != 0) && (valor < 0)) {
				System.out.println("ÍMPAR NEGATIVO\n");
			}
			else if ((valor % 2 == 0) && (valor > 0)) {
				System.out.println("PAR POSITIVO\n");
			}
			else if ((valor % 2 == 0) && (valor < 0)) {
				System.out.println("PAR NEGATIVO\n");
			}
			else {
				System.out.println("NULO\n");
			}
		}
		scanner.close();
	}
}
