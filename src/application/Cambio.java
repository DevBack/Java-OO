package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

/**
 * 
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
 * responsável pelos cálculos.
 *
 */

public class Cambio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar? ");
		double dollarPrice = scanner.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double amount = scanner.nextDouble();
		
		scanner.close();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
	}
}
