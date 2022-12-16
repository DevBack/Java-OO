package estruturaRepetitiva;

import java.util.Scanner;

/**
	Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
	impares entre eles.
 */

public class SomaImpares {

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Valor de X:");
		x = scanner.nextInt();
		System.out.println("Digite o Valor de Y:");
		y = scanner.nextInt();
		
		scanner.close();
		
		if (y < x) {
			int auxiliar = x;
			x = y;
			y = auxiliar;
		}
		
		int soma = 0;
		
		for (int i=x; i<=y; i++) {
				
			if (i % 2 != 0) {
				soma = soma + i;
				System.out.println("+" + i);
			}
		}
		System.out.printf("----\n"
						+ "= %d", soma);
	}
}
