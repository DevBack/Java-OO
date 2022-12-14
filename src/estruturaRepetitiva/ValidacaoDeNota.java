package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/**
 	Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
	média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
	intervalo [0,10]). Cada nota deve ser validada separadamente.
 */

public class ValidacaoDeNota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double nota1, nota2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Primeira Nota:");
		nota1 = scanner.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Valor Inválido!\n"
							 + "Tente Novamente: ");
			nota1 = scanner.nextDouble();
		}
		
		System.out.println("Digite a Segunda Nota:");
		nota2 = scanner.nextDouble();
		
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Valor Inválido!\n"
							 + "Tente Novamente: ");
			nota2 = scanner.nextDouble();
		}
		
		scanner.close();
		System.out.printf("MÉDIA: %.2f", (nota1 + nota2)/2);
	}
}
