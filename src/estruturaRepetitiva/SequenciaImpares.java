package estruturaRepetitiva;

import java.util.Scanner;

/**
 	Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
	se for o caso.
 */

public class SequenciaImpares {

	public static void main(String[] args) {
		
		int x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um Número:");
		x = scanner.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
