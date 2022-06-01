import java.util.Scanner;

//Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

public class Ex12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int num1, num2, num3;
		int maior, menor, meio;

		System.out.print("Digite o primeiro valor: ");
		num1 = leitor.nextInt();

		System.out.print("Digite o segundo valor: ");
		num2 = leitor.nextInt();

		System.out.print("Digite o terceiro valor: ");
		num3 = leitor.nextInt();

		if (num1 > num2 && num1 > num3) {
			maior = num1;
			if (num2 > num3) {
				meio = num2;
				menor = num3;
			} else {
				meio = num3;
				menor = num2;
			}
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			if (num1 > num3) {
				meio = num1;
				menor = num3;
			} else {
				meio = num3;
				menor = num1;
			}
		} else {
			maior = num3;
			if (num1 > num2) {
				meio = num1;
				menor = num2;
			} else {
				meio = num2;
				menor = num1;
			}
		}

		System.out.printf("Ordem crescente: %d | %d | %d", menor, meio, maior);

		leitor.close();
	}

}
