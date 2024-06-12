package Aula_12_06;

import java.util.Scanner;

public class Atividade_12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int soma=0, media=0, X=1;

		while (X <=20) {
			X++;

			int idade;

			System.out.print("informe a idade " + X);
			idade = ler.nextInt();

			soma += idade;
			media = soma/20;
		}
		System.out.println("A soma das idades são "+ soma); 
		System.out.println("A media das idades são "+ media); 

	}

}
