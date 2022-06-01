import java.util.Scanner;

//Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes Fórmulas:
//
//para homens: (72.7 * Altura) – 58
//para mulheres: (62.1 * Altura) – 44.7
public class Ex13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		char sexo;
		double altura, pesoIdeal;

		System.out.print("Escolha seu sexo: \n[F] = 1\n[M] = 2\nDigite aqui: ");
		sexo = leitor.next().charAt(0);

		if (sexo == '1') {
			System.out.print("Digite sua altura, em metros: ");
			altura = leitor.nextDouble();

			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("Para mulheres com altura de %.2f m o peso ideal é %.2f kg\n", altura, pesoIdeal);
		} else if (sexo == '2') {
			System.out.print("Digite sua altura, em metros: ");
			altura = leitor.nextDouble();

			pesoIdeal = (72.7 * altura) - 58;
			System.out.printf("Para homens com altura de %.2f m o peso ideal é %.2f kg\n", altura, pesoIdeal);
		} else {
			System.out.println("Você digitou um sexo inválido.");
		}

		System.out.println("FIM DO PROGRAMA");
		leitor.close();
	}

}
