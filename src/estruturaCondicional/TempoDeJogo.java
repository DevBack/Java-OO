package estruturaCondicional;

import java.util.Scanner;

/**
 * 
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
 *  pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
 *  horas.
 *
 */

public class TempoDeJogo {

	public static void main(String[] args) {
	
		int inicio, termino, duracao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Hora Inicial do Jogo:");
		inicio = scanner.nextInt();
		System.out.println("Digite a Hora Final do Jogo:");
		termino = scanner.nextInt();
		
		scanner.close();
		
		if (inicio < termino) {
			duracao = termino-inicio;
			System.out.printf("O JOGO DUROU %d HORA(S).", duracao);
		}
		else {
			duracao = 24-(inicio-termino);
			System.out.printf("O JOGO DUROU %d HORA(S).", duracao);
		}
	}
}
