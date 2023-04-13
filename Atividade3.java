package Variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto do colaborador:");
		float salarioBruto = sc.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno do colaborador:");
		float adicionalNoturno = sc.nextFloat();
		
		System.out.println("Digite o total de horas extras do colcaborador:");
		float horaExtra = sc.nextFloat();
		
		System.out.println("Digite o total de descontos do colaborador:");
		float descontos = sc.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - descontos;
		
		System.out.printf("Salário líquido do colaborador é: %.2f", salarioLiquido);
		
		sc.close();
	}
}
