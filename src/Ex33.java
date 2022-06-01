import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double peso, altura, imc;

		System.out.print("Digite o seu peso (em kg): ");
		peso = leitor.nextDouble();

		System.out.print("Digite sua altura (em m): ");
		altura = leitor.nextDouble();

		imc = peso / (Math.pow(altura, 2));

		if (imc < 20) {
			System.out.printf("Seu IMC = %.1f\nVocê está abaixo do peso!", imc);
		} else if (imc <= 25) {
			System.out.printf("Seu IMC = %.1f\nVocê está com peso normal!", imc);
		} else if (imc <= 30) {
			System.out.printf("Seu IMC = %.1f\nVocê está com excesso de peso!", imc);
		} else if (imc <= 35) {
			System.out.printf("Seu IMC = %.1f\nVocê está com obesidade!", imc);
		} else {
			System.out.printf("Seu IMC = %.1f\nVocê está com obesidade mórbida!", imc);
		}

		leitor.close();
	}

}
