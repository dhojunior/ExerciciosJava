import java.util.Scanner;

//Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se encaixa.

public class Ex02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;
		double peso;

		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();

		System.out.print("Digite seu peso: ");
		peso = leitor.nextDouble();

		if (idade < 20) {
			if (peso < 60) {
				System.out.println("Você está no grupo de risco 9!");
			} else if (peso <= 90) {
				System.out.println("Você está no grupo de risco 8!");
			} else {
				System.out.println("Você está no grupo de risco 7!");
			}
		} else if (idade <= 50) {
			if (peso < 60) {
				System.out.println("Você está no grupo de risco 6!");
			} else if (peso <= 90) {
				System.out.println("Você está no grupo de risco 5!");
			} else {
				System.out.println("Você está no grupo de risco 4!");
			}
		} else {
			if (peso < 60) {
				System.out.println("Você está no grupo de risco 3!");
			} else if (peso <= 90) {
				System.out.println("Você está no grupo de risco 2!");
			} else {
				System.out.println("Você está no grupo de risco 1!");
			}

		}
		leitor.close();

	}

}
