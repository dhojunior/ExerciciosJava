import java.util.Scanner;

//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
public class Ex09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int anoNasc, idade;

		System.out.print("Digite o seu ano de nascimento no formato aaaa: ");
		anoNasc = leitor.nextInt();
		idade = 2022 - anoNasc;

		if (idade >= 16) {
			System.out.printf("Você já pode votar este ano, pois possui %d anos de idade!\n", idade);
		} else {
			System.out.println("Você ainda não pode votar, pois tem menos de 16 anos de idade!");
		}

		leitor.close();
	}

}
