package parte03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int categoria;
		char situacao;
		double aumento = 1;
		double imposto;
		double preco, novoPreco;

		System.out.print("Digite o pre�o do produto: R$ ");
		preco = leitor.nextDouble();

		System.out.println("==========");

		System.out.print("Dadas as categorias:\n1- Limpeza\n2- Alimenta��o\n3- Vestu�rio\nEscolha a categoria: ");
		categoria = leitor.nextInt();

		if (preco <= 25) {
			switch (categoria) {

			case 1:
				aumento = 1.05;
				System.out.println("O aumento ser� de 5%");
				break;

			case 2:
				aumento = 1.08;
				System.out.println("O aumento ser� de 8%");
				break;

			case 3:
				aumento = 1.1;
				System.out.println("O aumento ser� de 10%");
				break;

			default:
				System.out.println("O n�mero escolhido � inv�lido! Digite um n�mero entre 1 e 3.");
				System.exit(0);
			}
		} else {
			switch (categoria) {

			case 1:
				aumento = 1.12;
				System.out.println("O aumento ser� de 12%");
				break;

			case 2:
				aumento = 1.15;
				System.out.println("O aumento ser� de 15%");
				break;

			case 3:
				aumento = 1.18;
				System.out.println("O aumento ser� de 18%");
				break;

			default:
				System.out.println("O n�mero escolhido � inv�lido! Digite um n�mero entre 1 e 3.");
				System.exit(0);
			}
		}

		System.out.println("==========");

		System.out.print(
				"Dadas as situa��es:\nR- produtos que necessitam de refrigera��o\nN- Produtos que n�o necessitam de refrigera��o\nEscolha a situa��o: ");
		situacao = leitor.next().toUpperCase().charAt(0);
		switch (situacao) {

		case 'R':
			break;

		case 'N':
			break;

		default:
			System.out.println("Voc� digitou uma op��o inv�lida! Digite R ou N.");
			System.exit(0);
		}

		if (situacao == 'R' || categoria == 2) {
			imposto = 0.05;
		} else {
			imposto = 0.08;
		}

		novoPreco = (preco * aumento) - ((preco * aumento) * imposto);

		System.out.println("==========");

		System.out.printf("O novo pre�o do produto ser� R$ %.2f\n", novoPreco);
		if (novoPreco <= 50) {
			System.out.println("Classifica��o: Barato");
		} else if (novoPreco < 120) {
			System.out.println("Classifica��o: Normal");
		} else {
			System.out.println("Classifica��o: Caro");
		}

		leitor.close();
	}

}
