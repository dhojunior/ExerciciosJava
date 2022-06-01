import java.util.Scanner;

//Desenvolva um programa que dada a idade de uma pessoa, determine sua condi��o de eleitor
public class Ex27 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;

		System.out.print("Digite a idade: ");
		idade = leitor.nextInt();

		if (idade < 16) {
			System.out.printf("Com %d anos, ainda n�o pode votar.", idade);
		} else if (idade < 18 || idade >= 65) {
			System.out.printf("Com %d anos, o voto � facultativo.", idade);
		} else {
			System.out.printf("Com %d anos, o voto � obrigat�rio.", idade);
		}

		leitor.close();
	}

}
