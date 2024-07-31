package aula2;

import java.util.Scanner;

public class Except4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x = 0;
		
		try {
		System.out.println("Digite uma nota: ");
		x = ler.nextDouble();

		if (x>=6)
			System.out.println("Você está aprovado!!!");
		else if (x<6 && x>=4)
			System.out.println("Exame!");
		else
			System.out.println("Reprovado...");
		
		} catch (Exception erro) {
			System.out.println("Informe uma nota aplicável..");
		}
		ler.close();
	}

}
