package estruturaRepetitiva;

import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {
	
		int x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um Número Inteiro:");
		x = scanner.nextInt();
		
		while (x != 0) {
			System.out.println("Digite Outro Número Inteiro:");
			x = scanner.nextInt();
		}
	}

}
