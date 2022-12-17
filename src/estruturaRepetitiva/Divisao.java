package estruturaRepetitiva;

import java.util.Scanner;

/**
 	Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes: ler dois números e
	imprimir o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem
	“DIVISAO IMPOSSIVEL”.
 */

public class Divisao {

	public static void main(String[] args) {
		
		int numero;
		double  numerador, denominador;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos Casos Você vai Digita?");
		numero = scanner.nextInt();
		
		for (int i=1; i<=numero; i++) {
			
			System.out.println("Entre com o Numerador:");
			numerador = scanner.nextDouble();
			System.out.println("Entre com o Denominador:");
			denominador = scanner.nextDouble();
			
			if (denominador != 0) {
				System.out.printf("DIVISÃO = %.2f\n\n", numerador/denominador);
			}
			else {
				System.out.println("DIVISÃO IMPOSSÍVEL\n\n");
			}
		}
		scanner.close();
	}
}
