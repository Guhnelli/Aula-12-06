package Aula_12_06;

import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		String nome; 
		int nomes=1;

		System.out.print("informe o nome :");
		nome = ler.next();

		while (nomes <= 10) {
			nomes++;

			System.out.println("o nome é "+ nome); 	
		}

	}

}
