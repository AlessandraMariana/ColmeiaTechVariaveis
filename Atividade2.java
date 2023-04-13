package Variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite nota 3: ");
		float nota3 = sc.nextFloat();
		
		System.out.println("Digite nota 4: ");
		float nota4 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3 +nota4) /4;
		
		System.out.println();
		System.out.printf("Sua média final é: %f", media);
		
		sc.close();
	}
}
