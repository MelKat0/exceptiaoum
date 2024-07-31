package aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1certo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("##########################");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("##########################");
		
		int i=1, soma = 0;
		while (i!=0) {
			System.out.println("Informe o valor a ser somado: ");
			i=ler.nextInt();
			numeros.add(i);
		}
		for (int n : numeros) {
			soma += n; //soma = soma + n;
		}
		System.out.println("A lista é: " + numeros);
		System.out.println("A soma é: " + soma);
		ler.close();
	}

}

