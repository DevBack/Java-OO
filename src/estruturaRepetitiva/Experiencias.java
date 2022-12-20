package estruturaRepetitiva;

import java.util.Scanner;

/**
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
 * precisa de sua ajuda para organizar os experimentos de um laboratório do qual
 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
 * coelhos. Para obter estas informações, ela sabe exatamente o número de
 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
 * de cobaias utilizadas em cada experimento. Faça um programa que leia um valor
 * inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de
 * teste contém um inteiro que representa a quantidade de cobaias utilizadas e
 * uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo
 * C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
 * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
 * o ponto.
 */

public class Experiencias {

	public static void main(String[] args) {
		
		int casos = 0;
		
		int cobaias = 0;
		char tipo;
		
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		int totalCobaias = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos Casos de Teste Serão Digitados?");
		casos = scanner.nextInt();
		
		for (int i=0; i<casos; i++) {
			System.out.println("Digite a Quantidade de Cobaias:");
			cobaias = scanner.nextInt();
			System.out.println("Digite o Tipo das Cobaias:");
			tipo = scanner.next().charAt(0);
			
			totalCobaias += cobaias;
			
			if (tipo == 'C') {
				totalCoelhos += cobaias;
			}
			else if (tipo == 'R') {
				totalRatos += cobaias;
			}
			else if (tipo == 'S') {
				totalSapos += cobaias;
			}
		}
		scanner.close();
		
		System.out.printf("RELATÓRIO FINAL:\n\n"
				+ "Total: %d Cobaias\n\n"
				+ "Total de Coelhos: %d\n"
				+ "Total de Ratos: %d\n"
				+ "Total de Sapos: %d\n\n"
				+ "Percentual de Coelhos: %.2f\n"
				+ "Percentual de Ratos: %.2f\n"
				+ "Percentual de Sapos: %.2f\n", totalCobaias, totalCoelhos, totalRatos, totalSapos, ((double)totalCoelhos/totalCobaias)*100,
																									 ((double)totalRatos/totalCobaias)*100,
																									 ((double)totalSapos/totalCobaias)*100);
	}
}
