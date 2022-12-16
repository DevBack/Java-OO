package estruturaRepetitiva;

import java.util.Scanner;

/**
 	Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10.
 */

public class Tabuada {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Voce Deseja Gerar a Tabuada de Qual Número?");
		numero = scanner.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, numero*i);
		}
		scanner.close();
	}
}
