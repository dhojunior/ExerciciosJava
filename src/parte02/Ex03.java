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
			System.out.printf("===Dados da %d� cidade===\n", i + 1);
			System.out.print("Digite o c�digo da cidade: ");
			cidades[i] = leitor.nextInt();
			System.out.print("Digite o n�mero de ve�culos de passeio: ");
			veiculos[i] = leitor.nextInt();
			System.out.print("Digite o n�mero de acidentes de tr�nsito com v�timas: ");
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
		System.out.printf("Maior �ndice de acidentes � na cidade %d com %d acidentes.\n", indexMaior, maior);
		System.out.printf("Menor �ndice de acidentes � na cidade %d com %d acidentes.\n", indexMenor, menor);
		System.out.printf("A m�dia de ve�culos nas 5 cidades �: %.0f\n", mediaGeral);
		System.out.printf("A m�dia de acidentes nas %d cidades pequenas �: %.0f\n", cidadesPequenas, mediaCidPequena);

		leitor.close();
	}

}
