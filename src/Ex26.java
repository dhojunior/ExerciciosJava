import java.util.Scanner;

//Desenvolva um programa que dados três números inteiros, informe quantos são negativos.
public class Ex26 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num1, num2, num3, contagem;

		contagem = 0;

		System.out.print("Digite o primeiro número: ");
		num1 = leitor.nextInt();

		System.out.print("Digite o segundo número: ");
		num2 = leitor.nextInt();

		System.out.print("Digite o terceiro número: ");
		num3 = leitor.nextInt();

		if (num1 < 0) {
			contagem++;
		}

		if (num2 < 0) {
			contagem++;
		}

		if (num3 < 0) {
			contagem++;
		}

		if (contagem == 1) {
			System.out.printf("Você digitou 1 número negativo!", contagem);
		} else if (contagem > 1) {
			System.out.printf("Você digitou %d números negativos!", contagem);
		} else {
			System.out.println("Você não digitou números negativos!");
		}

		leitor.close();
	}

}
