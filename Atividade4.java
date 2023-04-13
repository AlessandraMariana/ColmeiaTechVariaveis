package Variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número 1:");
		float n1 = sc.nextFloat();
		
		System.out.println("Digite o número 2:");
		float n2 = sc.nextFloat();
		
		System.out.println("Digite o número 3:");
		float n3 = sc.nextFloat();
		
		System.out.println("Digite o número 4:");
		float n4 = sc.nextFloat();
		
		float calculo = (n1*n2) - (n3*n4);
		
		System.out.printf("A diferença é: %.1f", calculo);
		
		sc.close();
	}
}
