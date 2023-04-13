package Variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Salário: ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o valor do Abono: ");
		float abono = sc.nextFloat();
		
		float novosalario = salario + abono;
		
		System.out.printf("\nO novo salário é: %.2f",novosalario);
		
		sc.close();
	}
}
