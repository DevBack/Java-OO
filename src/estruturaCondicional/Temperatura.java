package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para isso, você deve construir um programa que 
 * leia a letra "C" ou "F" indicando em qual escala vai ser informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra 
 * escala com duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve deduzir a fórmula de Celsius 
 * para Fahrenheit): C = 5/9 (F - 32).
 * 
 */

public class Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		char escala;
		double celsius, fahrenheit;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha a Escala:\n"
						 + "Digite [C] para (Celsius);\n"
						 + "Digite [F] para (Fahrenheit);");
		escala = scanner.next().charAt(0);
		
		if (escala == 'C') {
			System.out.print("Digite a temperatura em Celsius:");
			celsius = scanner.nextDouble();
			fahrenheit = celsius * 9.0 / 5.0 + 32.0;
			System.out.printf("A Temperatura Equivalente em Fahrenheit é: %.2f", fahrenheit);
		}
		else if (escala == 'F') {
			System.out.println("Digite a Temperatura em Fahrenheit:");
			fahrenheit = scanner.nextDouble();
			celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
			System.out.printf("A Temperatura Equivalente em Celsius é: %.2f", celsius);
		}
		else {
			System.out.println("Escolha a Escala:\n"
					 + "Digite [C] para (Celsius);\n"
					 + "Digite [F] para (Fahrenheit);\n\n"
					 + "* Digite Letras Maiúsculas *");
		}
		scanner.close();
	}
}
