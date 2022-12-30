package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/**
 * 
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
 * também se o aluno está aprovado (APROVADO) ou não (REPROVADO) e, em caso
 * negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado
 * (que é 60% da nota). Você deve criar uma classe Student para resolver este
 * problema.
 *
 */

public class Alunos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		student.setName(scanner.nextLine());
		student.setGrade1(scanner.nextDouble());
		student.setGrade2(scanner.nextDouble());
		student.setGrade3(scanner.nextDouble());
		
		System.out.printf("NOTA FINAL: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS%n", student.missingPoints());
		} else {
			System.out.println("APROVADO");
		}
		scanner.close();
	}
}
