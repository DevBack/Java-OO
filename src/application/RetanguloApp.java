package application;

import java.util.Locale;
import java.util.Scanner;

/*
	Fazer um programa para ler os valores da largura e altura de um
	retângulo. Em seguida, mostrar na tela o valor de sua área,
	perímetro e diagonal. Usar uma classe como mostrado no
	projeto ao lado.
 */

import entities.Rectangle;

public class RetanguloApp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a Largura e Altura do Retangulo:");
		Rectangle retangulo = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

		scanner.close();

		System.out.printf("ÁREA: %.2f\n" + "PERÍMERO: %.2f\n" + "DIAGONAL: %.2f\n", retangulo.area(),
				retangulo.perimeter(), retangulo.diagonal());
	}
}
