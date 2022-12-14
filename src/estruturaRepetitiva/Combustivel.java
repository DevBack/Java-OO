package estruturaRepetitiva;

import java.util.Scanner;

/**
 	Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
	Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
	1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
	4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
	código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
	como as quantidades de cada combustível.
 */

public class Combustivel {

	public static void main(String[] args) {
		
		int codigo = 0;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (codigo != 4) {
			
			System.out.print("Digite o Código do Combustível Abastecido:\n\n"
							 + "[1] - Álcool \n"
							 + "[2] - Gasolina \n"
							 + "[3] - Diesel \n"
							 + "[4] - Sair \n");
			codigo = scanner.nextInt();
			
			if (codigo == 1) {
				alcool++;
			}
			else if (codigo == 2) {
				gasolina++;
			
			}
			else if (codigo == 3) {
				diesel++;
			}
			else if (codigo == 4) {
				System.out.printf("MUITO OBRIGADO!\n\n"
								+ "Álcool: %d \n"
								+ "Gasolina: %d \n"
								+ "Diesel: %d \n", alcool, gasolina, diesel);
			}
			else {
				System.out.println("**Código Inválido.** \n");
			}
		}
		scanner.close();
	}
}
