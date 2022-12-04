package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Uma lanchonete possui vários produtos. Cada produto possui um código e um preço. Você deve fazer um programa para ler o código e a quantidade 
 * comprada de um produto (suponha um código válido), e daí informar qual o valor a ser pago, com duas casas decimais, conforme tabela de produtos 
 * ao lado.
 *
 */

public class Lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int codigo, quantidade;
		double valor;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Código do Produto:");
		codigo = scanner.nextInt();
		System.out.println("Digite a Quantidade:");
		quantidade = scanner.nextInt();
		
		scanner.close();
		
		if (codigo == 1) {
			valor = quantidade*5.00;
			System.out.printf("Valor a Pagar: R$%.2f", valor);
		}
		else if (codigo == 2) {
			valor = quantidade*3.50;
			System.out.printf("Valor a Pagar: R$%.2f", valor);
		}
		else if (codigo == 3) {
			valor = quantidade*4.80;
			System.out.printf("Valor a Pagar: R$%.2f", valor);
		}
		else if (codigo == 4) {
			valor = quantidade*8.90;
			System.out.printf("Valor a Pagar: R$%.2f", valor);
		}
		else if (codigo == 5) {
			valor = quantidade*7.32;
			System.out.printf("Valor a Pagar: R$%.2f", valor);
		}
		else {
			System.out.println("Código do Produto Inexistente!");
		}
	}
}
