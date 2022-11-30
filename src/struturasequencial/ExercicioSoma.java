package struturasequencial;

import java.util.Scanner;

/**
 * 	Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
 *	números.
 */

public class ExercicioSoma {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite Um Número:");
		x = scanner.nextInt();
		System.out.println("Digite Outro Número:");
		y = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("\n SOMA: "+ (x+y));
	}
}
