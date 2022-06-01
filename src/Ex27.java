import java.util.Scanner;

//Desenvolva um programa que dada a idade de uma pessoa, determine sua condição de eleitor
public class Ex27 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;

		System.out.print("Digite a idade: ");
		idade = leitor.nextInt();

		if (idade < 16) {
			System.out.printf("Com %d anos, ainda não pode votar.", idade);
		} else if (idade < 18 || idade >= 65) {
			System.out.printf("Com %d anos, o voto é facultativo.", idade);
		} else {
			System.out.printf("Com %d anos, o voto é obrigatório.", idade);
		}

		leitor.close();
	}

}
