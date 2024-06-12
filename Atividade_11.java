package Aula_12_06;

import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int media=0, soma=0;

		for (int i = 1; i <=20; i++) {

			int idade;

			System.out.print("informe a idade :");
			idade = ler.nextInt();

			soma +=idade;
			media = soma/20;
		}
		System.out.println("A soma das idades são "+ soma); 
		System.out.println("A media das idades são "+ media); 
	}
}
