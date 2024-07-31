package aula2;

import java.util.Scanner;

public class Except1 {

	public static void main(String[] args) {
		
		Scanner batata = new Scanner(System.in);
		int a = 10, b, c;
		
		System.out.print("Digite um número: ");
		b = batata.nextInt();
		try {
			c = a/b;
			System.out.println("Valor de c: " + c);
		} catch (Exception erro) {
			System.out.println("Não existe divisão por zero...");
		}
		batata.close();
	}

}
