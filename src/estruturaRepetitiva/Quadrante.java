package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/**
 	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
	sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
	algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
	escrever mensagem alguma).
 */

public class Quadrante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double x, y;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o Valor de X:");
		x = scanner.nextDouble();
		System.out.println("Digite o Valor de y:");
		y = scanner.nextDouble();

		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Q1\n");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2\n");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3\n");
			} else {
				System.out.println("Q4\n");
			}
			
			System.out.println("Digite o Valor de X:");
			x = scanner.nextDouble();
			System.out.println("Digite o Valor de y:");
			y = scanner.nextDouble();
		}
		scanner.close();
	}
}
