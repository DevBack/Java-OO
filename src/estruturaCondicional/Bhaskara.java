package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula de Baskara, calcular e mostrar os valores 
 * das raízes x1 e x2 da equação com quatro casas decimais, conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
 *
 */

public class Bhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double a, b, c;
		double delta;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Valor do Coeficiente A:");
		a = scanner.nextDouble();
		System.out.println("Digite o Valor do Coeficiente B:");
		b = scanner.nextDouble();
		System.out.println("Digite o Valor do Coeficiente C:");
		c = scanner.nextDouble();
		
		scanner.close();
		
		delta = (b*b)-(4*a*c);
		
		if(delta >=0) {
			System.out.printf("X1= %.4f\n"
							+ "X2= %.4f", -b+Math.sqrt(delta)/(2*a), -b-Math.sqrt(delta)/(2*a));
		}
		else {
			System.out.println("Esta Equação Não Possui Raízes Reais.");
		}
	}
}
