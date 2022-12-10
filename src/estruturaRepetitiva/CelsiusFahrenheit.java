package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusFahrenheit {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		char resposta;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = scanner.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			
			System.out.print("Deseja repetir (s/n)? ");
			resposta = scanner.next().charAt(0);
			
		} while (resposta != 'n');
		
		scanner.close();
	}
}
