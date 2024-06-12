package Aula_12_06;

import java.util.Scanner;

public class Atividade_07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int soma=0;
	
		for (int i = 1; i <=10; i++) {
			
			double numero;
			
			System.out.print("informe o numero :");
			numero = ler.nextDouble();
			
			soma += numero;
			
			System.out.println("A soma é "+ soma); 	
			
		}
		System.out.println("----------------------------"); 
		System.out.println("| A soma dos numeros é "+ soma + " |"); 
		System.out.println("----------------------------");

	}

}
