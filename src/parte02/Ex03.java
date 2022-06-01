package parte02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int cidades[] = new int[5];
		int veiculos[] = new int[5];
		int acidentes[] = new int[5];
		int maior = 0;
		int menor = 99999;
		int indexMaior = 0, indexMenor = 0;
		int totalVeiculos = 0;
		int totalAciCidPequena = 0;
		int cidadesPequenas = 0;

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < cidades.length; i++) {
			System.out.printf("===Dados da %dª cidade===\n", i + 1);
			System.out.print("Digite o código da cidade: ");
			cidades[i] = leitor.nextInt();
			System.out.print("Digite o número de veículos de passeio: ");
			veiculos[i] = leitor.nextInt();
			System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
			acidentes[i] = leitor.nextInt();

			if (acidentes[i] > maior) {
				maior = acidentes[i];
				indexMaior = cidades[i];
			} else if (acidentes[i] < menor) {
				menor = acidentes[i];
				indexMenor = cidades[i];
			}

			totalVeiculos = totalVeiculos + veiculos[i];

			if (veiculos[i] < 2000) {
				totalAciCidPequena = totalAciCidPequena + acidentes[i];
				cidadesPequenas = cidadesPequenas + 1;
			}

		}
		double mediaGeral = totalVeiculos / veiculos.length;
		double mediaCidPequena = totalAciCidPequena / cidadesPequenas;
		System.out.printf("Maior índice de acidentes é na cidade %d com %d acidentes.\n", indexMaior, maior);
		System.out.printf("Menor índice de acidentes é na cidade %d com %d acidentes.\n", indexMenor, menor);
		System.out.printf("A média de veículos nas 5 cidades é: %.0f\n", mediaGeral);
		System.out.printf("A média de acidentes nas %d cidades pequenas é: %.0f\n", cidadesPequenas, mediaCidPequena);

		leitor.close();
	}

}
