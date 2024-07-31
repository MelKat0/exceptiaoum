package aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		int lista;
		int numeros = 0;
		int soma = 0;
		
		System.out.print("Digite uma quantidade de números para a lista: ");
		lista = ler.nextInt();
		
		for (int i=0;i<lista;i++) {
			System.out.println("Digite os números para a lista: ");
			numeros = ler.nextInt();
			num.add(numeros);
			
		soma = soma + numeros;
		}
		System.out.println("A soma é: " + soma);
		
		ler.close();
	}

}
