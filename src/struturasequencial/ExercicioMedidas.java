package struturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * 	- Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados com quatro casas decimais):
 *		a) a área do quadrado que tem lado A
 *		b) a área do triângulo retângulo que base A e altura B
 *		c) a área do trapézio que tem bases A e B, e altura C
 *
 */

public class ExercicioMedidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double a, b, c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Medida A:");
		a = scanner.nextDouble();
		System.out.println("Digite a Medida B:");
		b = scanner.nextDouble();
		System.out.println("Digite a Medida C:");
		c = scanner.nextDouble();
		
		scanner.close();
		
		System.out.printf("ÁREA DO QUADRADO: %.4f.\n", a*a);
		System.out.printf("ÁREA DO TRIÂNGULO: %.4f.\n", (a*b)/2);
		System.out.printf("ÁREA DO TRAPÉZIO: %.4f.", (((a+b)*c))/2);
	}
}
