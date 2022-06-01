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

		System.out.print("Digite o preço do produto: R$ ");
		preco = leitor.nextDouble();

		System.out.println("==========");

		System.out.print("Dadas as categorias:\n1- Limpeza\n2- Alimentação\n3- Vestuário\nEscolha a categoria: ");
		categoria = leitor.nextInt();

		if (preco <= 25) {
			switch (categoria) {

			case 1:
				aumento = 1.05;
				System.out.println("O aumento será de 5%");
				break;

			case 2:
				aumento = 1.08;
				System.out.println("O aumento será de 8%");
				break;

			case 3:
				aumento = 1.1;
				System.out.println("O aumento será de 10%");
				break;

			default:
				System.out.println("O número escolhido é inválido! Digite um número entre 1 e 3.");
				System.exit(0);
			}
		} else {
			switch (categoria) {

			case 1:
				aumento = 1.12;
				System.out.println("O aumento será de 12%");
				break;

			case 2:
				aumento = 1.15;
				System.out.println("O aumento será de 15%");
				break;

			case 3:
				aumento = 1.18;
				System.out.println("O aumento será de 18%");
				break;

			default:
				System.out.println("O número escolhido é inválido! Digite um número entre 1 e 3.");
				System.exit(0);
			}
		}

		System.out.println("==========");

		System.out.print(
				"Dadas as situações:\nR- produtos que necessitam de refrigeração\nN- Produtos que não necessitam de refrigeração\nEscolha a situação: ");
		situacao = leitor.next().toUpperCase().charAt(0);
		switch (situacao) {

		case 'R':
			break;

		case 'N':
			break;

		default:
			System.out.println("Você digitou uma opção inválida! Digite R ou N.");
			System.exit(0);
		}

		if (situacao == 'R' || categoria == 2) {
			imposto = 0.05;
		} else {
			imposto = 0.08;
		}

		novoPreco = (preco * aumento) - ((preco * aumento) * imposto);

		System.out.println("==========");

		System.out.printf("O novo preço do produto será R$ %.2f\n", novoPreco);
		if (novoPreco <= 50) {
			System.out.println("Classificação: Barato");
		} else if (novoPreco < 120) {
			System.out.println("Classificação: Normal");
		} else {
			System.out.println("Classificação: Caro");
		}

		leitor.close();
	}

}
