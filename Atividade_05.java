package Aula_12_06;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
	String nome; 
	
	System.out.print("informe o nome :");
	nome = ler.next();
	
	for (int i = 0; i <=10; i++) {
		System.out.println("o nome é "+ nome); 
	}

	}

}
