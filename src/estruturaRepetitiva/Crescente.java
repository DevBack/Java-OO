package estruturaRepetitiva;

import java.util.Scanner;

/**
 * 
 * 	Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
 *	mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
 *	programa deve finalizar quando forem digitados dois valores iguais.
 *
 */

public class Crescente {

	public static void main(String[] args) {
		
		int x, y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite Dois Números Inteiros:");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		while (x != y) {
			if (x > y) {
				System.out.println("DECRESCENTE");
			}
			else {
				System.out.println("CRESCENTE");
			}
			
			System.out.println("Digite Dois Números Inteiros:");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
		scanner.close();
	}
}
