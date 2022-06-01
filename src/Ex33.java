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
			System.out.printf("Seu IMC = %.1f\nVoc� est� abaixo do peso!", imc);
		} else if (imc <= 25) {
			System.out.printf("Seu IMC = %.1f\nVoc� est� com peso normal!", imc);
		} else if (imc <= 30) {
			System.out.printf("Seu IMC = %.1f\nVoc� est� com excesso de peso!", imc);
		} else if (imc <= 35) {
			System.out.printf("Seu IMC = %.1f\nVoc� est� com obesidade!", imc);
		} else {
			System.out.printf("Seu IMC = %.1f\nVoc� est� com obesidade m�rbida!", imc);
		}

		leitor.close();
	}

}
