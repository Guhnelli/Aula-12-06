package Aula_12_06;

import java.util.Scanner;

public class Atividade_08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double numero, X=1;
		int soma=0;
		
		while (X <= 10) {
			
			X++;
			
			System.out.print("informe o numero :");
			numero = ler.nextDouble();
			
			soma += numero;
			
			System.out.println("A soma é "+ soma); 	
		}
		System.out.println("-----------soma--------------"); 
		System.out.println("| A soma dos numeros é "+ soma + " |"); 
		System.out.println("----------------------------");
	}

}
