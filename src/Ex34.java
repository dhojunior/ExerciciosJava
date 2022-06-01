import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;
		double dosagem;
		double peso;

		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();

		System.out.print("Digite seu peso (em kg): ");
		peso = leitor.nextDouble();

		if (idade < 12) {
			if (peso < 5) {
				System.out.print("Este medicamento não é indicado para esse paciente.");
			} else if (peso <= 9.0) {
				dosagem = 175 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			} else if (peso <= 16) {
				dosagem = 250 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			} else if (peso <= 24) {
				dosagem = 375 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			} else if (peso <= 30) {
				dosagem = 500 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			} else {
				dosagem = 750 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			}
		} else {
			if (peso < 60) {
				dosagem = 875 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			} else {
				dosagem = 1000 * 20 / 500;
				System.out.printf("Este paciente deve tomar %.0f gotas por dose.", dosagem);
			}
		}

		leitor.close();
	}

}
