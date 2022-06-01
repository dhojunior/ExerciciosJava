import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int idade;

		System.out.print("Digite a idade: ");
		idade = leitor.nextInt();

		if (idade <= 10) {
			System.out.printf("Valor do plano R$ 30,00");
		} else if (idade <= 29) {
			System.out.printf("Valor do plano R$ 60,00");
		} else if (idade <= 45) {
			System.out.printf("Valor do plano R$ 120,00");
		} else if (idade <= 59) {
			System.out.printf("Valor do plano R$ 150,00");
		} else if (idade <= 65) {
			System.out.printf("Valor do plano R$ 250,00");
		} else {
			System.out.printf("Valor do plano R$ 400,00");
		}

		leitor.close();
	}

}
