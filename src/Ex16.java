import java.util.Scanner;

//Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usu�rio n�o informar� valores iguais.
public class Ex16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int num1, num2, num3, maior;

		System.out.print("Digite o primeiro n�mero: ");
		num1 = leitor.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		num2 = leitor.nextInt();

		System.out.print("Digite o terceiro n�mero: ");
		num3 = leitor.nextInt();

		if (num1 > num2 && num1 > num2) {
			maior = num1;
			System.out.printf("O maior valor foi: %d", maior);
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			System.out.printf("O maior valor foi: %d", maior);
		} else if (num3 > num1 && num3 > num2) {
			maior = num3;
			System.out.printf("O maior valor foi: %d", maior);
		} else {
			System.out.println("Voc� digitou dois ou mais n�meros iguais!");
			System.out.println("FIM DO PROGRAMA");
		}

		leitor.close();
	}

}
