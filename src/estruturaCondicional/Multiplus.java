package estruturaCondicional;

import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo números podem ser digitados em qualquer ordem.
 *
 */

public class Multiplus {

	public static void main(String[] args) {
		
		int n1, n2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Número:");
		n1 = scanner.nextInt();
		System.out.println("Digite o Segundo Número:");
		n2 = scanner.nextInt();
		
		scanner.close();
		
		if (n1>=n2) {
			if (n1%n2 == 0) {
				System.out.println("São Múltiplos.");
			}
			else {
				System.out.println("Não São Múltiplos.");
			}
		}
		else {
			if (n2%n1 == 0) {
				System.out.println("São Múltiplos.");
			}
			else {
				System.out.println("Não São Múltiplos.");
			}
		}
	}
}
