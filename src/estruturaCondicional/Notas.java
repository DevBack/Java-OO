package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual. Em seguida, mostrar a 
 * nota final que o aluno obteve (com uma casa decimal) no ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 
 * 60.00, mostrar a mensagem "REPROVADO".
 *
 */

public class Notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double nota1;
		double nota2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira Nota:");
		nota1 = scanner.nextDouble();
		System.out.println("Digite a Segunda Nota:");
		nota2 = scanner.nextDouble();
		
		scanner.close();
		
		if((nota1+nota2) >= 60.00) {
			System.out.printf("NOTA: %.1f", nota1+nota2);
		}
		else {
			System.out.printf("NOTA: %.1f\n"
							+ "REPROVADO", nota1+nota2);
		}
	}
}
