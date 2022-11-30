package struturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * 	Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
 *	formato horas:minutos:segundos.
 *
 */

public class ExercicioDuracao {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		int duracao, horas, minutos, segundos, resto;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Duração em Segundos:");
		duracao = scanner.nextInt();
		scanner.close();
		
		horas = duracao / 3600;
        resto = duracao % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
	}
}
