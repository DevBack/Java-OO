package struturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do círculo com três casas decimais. A fórmula 
 * da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟􏰀. Você pode usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, 
 * se preferir, use diretamente o valor 3.14159.
 *
 */

public class ExercicioCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		final double PI = 3.14159;
		double raio;
		double area;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Valor do Raio do Círculo:");
		raio = scanner.nextDouble();
		scanner.close();
		
		area = PI*(raio*raio);
		
		System.out.printf("AREA: %.3f .", area);
	}
}