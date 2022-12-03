package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela a classificação desta glicose de acordo 
 * com a tabela de referência ao lado.
 *
 */

public class Glicose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double glicose;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Glicose:");
		glicose = scanner.nextDouble();
		
		scanner.close();
		
		if (glicose <= 100) {
			System.out.println("Classificação: NORMAL.");
		}
		else if (glicose>100 && glicose<=140) {
			System.out.println("Classificação: ELEVADO.");
		}
		else {
			System.out.println("Classificação: DIABETES.");
		}
	}
}
