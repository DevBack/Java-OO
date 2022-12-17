package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/**
 	Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
	teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
	que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
	que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
	pela soma dos pesos.
 */

public class MediaPonderada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int casos;
		double n1, n2, n3;
		final int PESO1 = 2;
		final int PESO2 = 3;
		final int PESO3 = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos Casos Você vai Digitar?");
		casos = scanner.nextInt();
		
		for (int i=1; i<=casos; i++) {
			
			System.out.println("Digite Três Números:");
			n1 = scanner.nextDouble();
			n2 = scanner.nextDouble();
			n3 = scanner.nextDouble();
			
			System.out.printf("MÉDIA: %.1f\n\n", ((n1*PESO1)+(n2*PESO2)+(n3*PESO3))/(PESO1+PESO2+PESO3));
		}
		scanner.close();
	}
}
