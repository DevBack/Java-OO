package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir. Você deve criar um programa para, 
 * dadas as medidas das três tentativas de lançamento, informar qual foi a maior.
 *
 */

public class Dardo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double lancamento, auxiliar;
		
		Scanner scanner = new Scanner(System.in);
		
		lancamento = 0.0;
		
		for (int i = 1; i<4; i++) {
			System.out.println("Digite a Distância "+ i);
			auxiliar = scanner.nextDouble();
			if (auxiliar>lancamento) {
				lancamento=auxiliar;
			}
		}
		scanner.close();
		System.out.printf("MAIOR DISTÂNCIA: %.2f", lancamento);
	}
}
