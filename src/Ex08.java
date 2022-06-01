import java.util.Scanner;

//Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class Ex08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num1, num2;

		System.out.print("Digite o primeiro número: ");
		num1 = leitor.nextInt();

		System.out.print("Digite o segundo número: ");
		num2 = leitor.nextInt();

		if (num1 > num2) {
			System.out.printf("O Primeiro Número é maior: %d", num1);
		} else if (num2 > num1) {
			System.out.printf("O Segundo Número é maior: %d", num2);
		} else {
			System.out.print("Você digitou números iguais!");
		}

		leitor.close();

	}

}
