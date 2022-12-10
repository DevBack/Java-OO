package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * 	Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
 *	indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
 *	e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
 *	mostrar a mensagem "IMPOSSIVEL CALCULAR".
 *
 */

public class MediaIdades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int idade;
		int soma = 0;
		int cont = 0;
		double media = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma Idade:");
		idade = scanner.nextInt();
		
		if (idade > 0) {			
			cont++;
			media = (soma += idade)/cont;
			
			while (idade > 0) {
				System.out.println("Digite uma Idade:");
				idade = scanner.nextInt();		
			}
			
			System.out.printf("MÉDIA: %.2f",media);
		}
		else {
			System.out.println("IMPOSSÍVEL CALCULAR.");
		}
		
		scanner.close();
	}
}
