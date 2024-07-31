package aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("##########################");
		System.out.println("Digite o valor 0 para sair");
		System.out.println("##########################");
		
		int i=1;
		while (i!=0) {
			System.out.println("Informe os valores para a lista: ");
			i=ler.nextInt();
			numeros.add(i);
		}
		System.out.println("Os números pares são: ");
		for (int n : numeros) {
			if (n%2 ==0) {
				System.out.println(n);
			}
		}
		ler.close();
	}

}
