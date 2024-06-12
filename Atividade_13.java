package Aula_12_06;

import java.util.Scanner;

public class Atividade_13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade [] = new int [20], maior_de_idade=0;
				
		for (int i = 0; i <=20; i++) {

			System.out.print("informe a idade :");
			idade[i] = ler.nextInt();
		

			if (idade[i] > 17) {
				maior_de_idade++;
			}
			
		}
		System.out.println("maiorres de idade  "+ maior_de_idade); 
	}
}
