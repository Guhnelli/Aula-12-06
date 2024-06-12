package Aula_12_06;

import java.util.Scanner;

import java.util.Scanner;

public class Atividade_09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int soma=0;

		for (int i = 1; i <=20; i++) {

			int idade;

			System.out.print("informe a idade :");
			idade = ler.nextInt();

			soma += idade;
		}
		System.out.println("A soma das idades são "+ soma); 
	}
}