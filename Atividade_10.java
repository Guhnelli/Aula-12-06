package Aula_12_06;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int soma=0, X=1;
		
		while (X <=20) {
			X++;
			
			int idade;
			
			System.out.print("informe a idade " + X);
			idade = ler.nextInt();
			
			soma += idade;
		}
		System.out.println("A soma das idades são "+ soma); 

	}

}
