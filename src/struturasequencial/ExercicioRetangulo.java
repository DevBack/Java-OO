package struturasequencial;

/**
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
 * da área, perímetro e diagonal deste retângulo, com quatro casas decimais,
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {

	public static void main(String[] args) {
		
	// Define a localidade padrão durante a execução do código. (Permite que o ponto flutuante seja representado pelo caracter "."(ponto).
		Locale.setDefault(Locale.US);
		
		double base;
		double altura;
		double area;
		double perimetro;
		double diagonal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Base do retângulo:");
		base = scanner.nextDouble();
		System.out.println("Digite a Altura do Retângulo:");
		altura = scanner.nextDouble();
		
		scanner.close();
		
		area = base*altura;
		perimetro = (base+altura)*2;
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("Área: %.4f\n"
						+ "Perímetro: %.4f\n"
						+ "Diagonal: %.4f\n", area, perimetro, diagonal);
	}
}
