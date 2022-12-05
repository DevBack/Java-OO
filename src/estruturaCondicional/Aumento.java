package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao 
 * lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo salário desta pessoa depois do aumento, quanto foi o aumento 
 * e qual foi a porcentagem de aumento.
 *
 */

public class Aumento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double salario;
		double novoSalario;
		double  aumento;
		int porcentagem;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Salário:");
		salario = scanner.nextDouble();
		
		scanner.close();
		
		if (salario <= 1000.00) {
			porcentagem = 20;
			aumento = (salario*porcentagem)/100;
			novoSalario = salario+aumento;
		}
		else if (salario>1000.00 && salario<=3000.00) {
			porcentagem = 15;
			aumento = (salario*porcentagem)/100;
			novoSalario = salario+aumento;
		}
		else if (salario>3000.00 && salario<=8000.00) {
			porcentagem = 10;
			aumento = (salario*porcentagem)/100;
			novoSalario = salario+aumento;
		}
		else {
			porcentagem = 5;
			aumento = (salario*porcentagem)/100;
			novoSalario = salario+aumento;
		}
		
		System.out.printf("Novo Salário: R$%.2f\n"
						+ "Aumento: R$%.2f\n"
						+ "Porcentagem: %d", novoSalario, aumento, porcentagem);
	}
}
