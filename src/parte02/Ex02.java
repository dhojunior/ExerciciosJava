package parte02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num, tabuada;

		System.out.print("Digite o número para ver sua tabuada: ");
		num = leitor.nextInt();

		for (int i = 1; i <= 10; i++) {
			tabuada = num * i;
			System.out.printf("%d x %d = %d\n", i, num, tabuada);
		}

		leitor.close();
	}

}